package JDBC;

import java.sql.*;

public class CountRecordJDBC {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String CountQuary= "SELECT COUNT(*) AS count FROM Books";
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(CountQuary);
            resultSet.next();

            System.out.println("The Total number of Records is: " + resultSet.getInt("count"));
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
