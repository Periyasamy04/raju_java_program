package JDBC;

import java.sql.*;

public class ExceptionHandlingJDBC {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";
        String retrieveQuery= "SELECT * FROM teacher";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(retrieveQuery);
            while(resultSet.next()) {
                int BookID= resultSet.getInt("Book_id");
                String BookName= resultSet.getString("Book_Name");
                String BookAuthor= resultSet.getString("Book_Author");
                System.out.println(BookID + "\t" + BookName + "\t\t" + BookAuthor);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
