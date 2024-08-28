package numberguessinggame;

public class Company extends Contact {
    int gstNumber;
    int establishedYear;

    public Company(int phoneNumber, String name, String emailId,int gstNumber,int establishedYear){
        super(phoneNumber,name,emailId);
        this.gstNumber=gstNumber;
        this.establishedYear=establishedYear;
    }
}