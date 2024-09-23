package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecordJDBC {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Book Name You Want to Update: ");
        String NewBookName= scanner.nextLine();
        System.out.print("Enter the Book ID: ");
        int BookID= scanner.nextInt();
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";
        String UpdateQuary= "UPDATE Books SET Book_Name=? WHERE Book_ID=?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement= connection.prepareStatement(UpdateQuary);
            statement.setString(1,NewBookName);
            statement.setInt(2,BookID);
            statement.executeUpdate();
            System.out.println("The Record is updated Successfully. ");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
