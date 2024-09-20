package JDBC;
import java.sql.*;
import java.util.Scanner;

public class DeleteRecordJDBC {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Book ID You Want to Delete: ");
        int BookID= scanner.nextInt();
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";
        String createtableSQL= "DELETE FROM Books WHERE Book_ID=?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement= connection.prepareStatement(createtableSQL);
            statement.setInt(1,BookID);
            statement.execute();
            System.out.println("The Record is Deleted Successfully. ");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
