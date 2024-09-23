package JDBC;

import java.sql.*;

public class CountRecordJDBC {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";
        String CountQuary= "SELECT COUNT(*) AS count FROM Books";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(CountQuary);
            resultSet.next();
            int Output= resultSet.getInt("count");
            System.out.println("The Total number of Records is: " + Output);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
