package JDBC_2_create_Entity;
public class CreateEntity {
    public int Employee_ID;
    public String Frist_Name;
    public String Last_Name;
    public String Middle_Name;
    public String Date_Of_Birth;
    public String Gender;
    public String Email_Address;
    public String Phone_Number;
    public String Address;

    public CreateEntity(int Employee_ID, String Frist_Name,
                        String Last_Name, String Middle_Name,
                        String Date_Of_Birth, String Gender,
                        String Email_Address, String Phone_Number,
                        String Address){
        this.Employee_ID = Employee_ID;
        this.Frist_Name = Frist_Name;
        this.Last_Name = Last_Name;
        this.Middle_Name = Middle_Name;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Gender = Gender;
        this.Email_Address = Email_Address;
        this.Phone_Number = Phone_Number;
        this.Address = Address;
    }

    @Override
    public String toString(){
        return Employee_ID + "\n" + Frist_Name + "\n" +
                Last_Name + "\n" + Middle_Name + "\n" +
                Date_Of_Birth + "\n" + Gender + "\n" +
                Email_Address + "\n" + Phone_Number + "\n" + Address;
    }

    public static void main(String[] args) {
        CreateEntity createEntity=new CreateEntity(123,"Raju",
                "S","Bhai",
                "06-08-2004","male",
                "periyasamy6804@gmail.com",
                "9677011150","Ambattur");
        System.out.println(createEntity);
    }
}
