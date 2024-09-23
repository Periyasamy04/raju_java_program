package JDBC;

import java.sql.*;
import java.util.Scanner;

public class SearchResultJDBC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("let me know the Book name you're interested in: ");
        String BookName= scanner.nextLine();
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";
        String SearchQuery= "SELECT * FROM Books WHERE Book_Name=?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement= connection.prepareStatement(SearchQuery);
            statement.setString(1,BookName);
            ResultSet resultSet= statement.executeQuery();
            while(resultSet.next()) {
                int BookID= resultSet.getInt("Book_id");
                String BookAuthor= resultSet.getString("Book_Author");
                System.out.println("Book_ID = " + BookID + "\n" + "Book_Name = " + BookName + "\n" + "Bok_Author = " + BookAuthor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
