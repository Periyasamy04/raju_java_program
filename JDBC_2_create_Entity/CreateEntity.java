package JDBC_2_create_Entity;
public class CreateEntity {
    public String Employee_ID;
    public String Frist_Name;
    public String Last_Name;
    public String Middle_Name;
    public String Date_Of_Birth;
    public String Gender;
    public String Email_Address;
    public String Phone_Number;
    public Address address;

    public CreateEntity(String Employee_ID, String Frist_Name,
                        String Last_Name, String Middle_Name,
                        String Date_Of_Birth, String Gender,
                        String Email_Address, String Phone_Number,
                        Address address){
        this.Employee_ID = Employee_ID;
        this.Frist_Name = Frist_Name;
        this.Last_Name = Last_Name;
        this.Middle_Name = Middle_Name;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Gender = Gender;
        this.Email_Address = Email_Address;
        this.Phone_Number = Phone_Number;
        this.address = address;
    }

    @Override
    public String toString(){
        return Employee_ID + "\n" + Frist_Name + "\n" +
                Last_Name + "\n" + Middle_Name + "\n" +
                Date_Of_Birth + "\n" + Gender + "\n" +
                Email_Address + "\n" + Phone_Number + "\n" + address;
    }

    public static void main(String[] args) {
        Address address1 =new Address("NO:5/9 Banu Nagar","2nd Avenue Ambattur","Chennai","TamilNadu","600099");
        CreateEntity createEntity=new CreateEntity("CI2404","Raju",
                "S","Bhai",
                "06-08-2004","male",
                "periyasamy6804@gmail.com",
                "9677011150",address1);
        System.out.println(createEntity);
    }
}
