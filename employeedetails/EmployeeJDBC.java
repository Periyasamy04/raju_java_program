package employeedetails;

public class EmployeeJDBC {
    public String employeeId;
    public String firstName;
    public String lastName;
    public String middleName;
    public String dateOfBirth;
    public String gender;
    public String emailAddress;
    public String phoneNumber;
    public Address address;

    public EmployeeJDBC(String employeeId, String firstName,
                        String lastName, String middleName,
                        String dateOfBirth, String gender,
                        String emailAddress, String phoneNumber,
                        Address address){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString(){
        return employeeId + "\n" + firstName + "\n" +
                lastName + "\n" + middleName + "\n" +
                dateOfBirth + "\n" + gender + "\n" +
                emailAddress + "\n" + phoneNumber + "\n" + address;
    }

    public static void main(String[] args) {
        Address address1 =new Address("NO:5/9 Banu Nagar","2nd Avenue Ambattur","Chennai","TamilNadu","600099");
        EmployeeJDBC employeeJDBC=new EmployeeJDBC("CI2404","Raju",
                "S","Bhai",
                "06-08-2004","male",
                "periyasamy6804@gmail.com",
                "9677011150",address1);
        System.out.println(employeeJDBC);
    }
}
