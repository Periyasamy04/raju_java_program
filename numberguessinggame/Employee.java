package numberguessinggame;

public class Employee extends Contact{
    String designation="Intern";
    double salary=55500;

    public Employee(int phoneNumber, String name, String emailId,String designation, double salary){
        super(phoneNumber,name,emailId);
        this.designation=designation;
        this.salary=salary;
    }
}
