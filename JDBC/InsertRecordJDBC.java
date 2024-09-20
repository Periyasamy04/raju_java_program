package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordJDBC {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String Sqlrecord= "INSERT INTO Books VALUES (001,'Naruto Classic Manga','Masashi Kishimoto'),(002,'Demonslayer Manga','Koyoharu Gotouge'),(003,'Naruto Shippuden Manga','Masashi Kishimoto')";

            Statement statement = connection.createStatement();
            statement.execute(Sqlrecord);
            System.out.println("Records are Inserted Successfully. ");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
