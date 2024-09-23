package JDBC;

import java.sql.*;
import java.util.Scanner;

public class FilterRecordJDBC {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("let me know the author's name you're interested in: ");
        String AuthorName= scanner.nextLine();
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";
        String FilterQuery= "SELECT Book_Name FROM books WHERE Book_Author=?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement= connection.prepareStatement(FilterQuery);
            statement.setString(1,AuthorName);
            ResultSet resultSet= statement.executeQuery();
            while(resultSet.next()) {
                String BookName= resultSet.getString("Book_Name");
                System.out.println("The Book Name is: " + BookName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
