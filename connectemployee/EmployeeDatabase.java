package connectemployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDatabase {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_periyasamy;encrypt=true;trustServerCertificate=true";
        String user = "periyasamy";
        String password = "Raju@6804";
        String createQuery= "CREATE TABLE employees(EmployeeId VARCHAR(50) PRIMARY KEY NOT NULL,FirstName VARCHAR(50) NOT NULL, LastName VARCHAR(50) NOT NULL, MiddleName VARCHAR(50), DateOfBirth DATE NOT NULL, Gender VARCHAR(50) NOT NULL, EmailAddress VARCHAR(50) UNIQUE NOT NULL, PhoneNumber VARCHAR(50) UNIQUE NOT NULL, Address VARCHAR(50) NOT NULL, JobTitle VARCHAR(50) NOT NULL, Department VARCHAR(50) NOT NULL, ManagerId VARCHAR(50) NOT NULL, DateofJoining DATE NOT NULL, Employmentstatus VARCHAR(50), Salary VARCHAR(50) NOT NULL, WorkLocation VARCHAR(50), EmergencyContact VARCHAR(50) NOT NULL, Skills VARCHAR(50) NOT NULL, Education VARCHAR(50) NOT NULL, Certification VARCHAR(50), PerformanceReviews VARCHAR(50), PanNumber VARCHAR(50) UNIQUE NOT NULL, AadharNumber VARCHAR(50) UNIQUE NOT NULL, BankAccountDetails VARCHAR(50) UNIQUE NOT NULL)";
        String insertQuery= "INSERT INTO employees VALUES('CI2405','Periyasamy','S','Raju','2004-08-06','Male','periyasamy6804@gmail.com','9677011150','Ambattur','Intern','BCA','CIM01','2024-07-15',null,'Employee\''s Salary','Medavakkam','9123456789','Java','BCA in saveetha Liberals Arts and Science','NPTEL,SystemTron',null,'HEFT060824','9234 5678 9123 4567','Axis12345678')";
        String insertQuery1= "INSERT INTO employees VALUES('CI2404','Akshaya','A','Amuthan','2004-12-15','Female','akshaya1512@gmail.com','6383909012','Kanchipuram','Intern','BCA','CIM01','2024-07-15',null,'Employee\''s Salary','Medavakkam','9677011150','Java','BCA in saveetha Liberals Arts and Science','NPTEL,SystemTron',null,'EFGT788912','9876 5432 1987 4321','Overseas987654')";
        String insertQuery2= "INSERT INTO employees VALUES('CI2406','Naveen','D','DevaRajan','2004-09-16','Male','Naveendevarajan@gmail.com','7810000928','Kanchipuram','Intern','BCA','CIM01','2024-07-15','Full-Time','Employee\''s Salary','Medavakkam','9417572562','Java','BCA in saveetha Liberals Arts and Science','NPTEL',null,'ZJKL694637','5342 9074 8927 8634','Indian52838623')";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement= connection.createStatement();
            statement.executeUpdate(insertQuery2);
            System.out.println("Connected to the Database Successfully. ");
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
