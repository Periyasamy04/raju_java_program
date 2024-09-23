package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishingConnectionJDBC {

        public static void main(String[] args) {
            String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
            String user = "periyasamy";
            String password = "Raju@6804";

            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the database!");
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
