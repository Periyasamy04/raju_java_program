package JDBC;
import java.sql.*;

public class RetriveRecordsJDBC {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";
        String retrieveSQL= "SELECT * FROM Books";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(retrieveSQL);
            while(resultSet.next()) {
                System.out.println("Book ID: " + resultSet.getInt("Book_id"));
                System.out.println("Book Name: " + resultSet.getString("Book_Name"));
                System.out.println("Book Author: "+ resultSet.getString("Book_Author"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
