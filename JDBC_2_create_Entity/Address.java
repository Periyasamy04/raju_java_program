package JDBC_2_create_Entity;

public class Address {
    public String AddressLine1;
    public String AddressLine2;
    public String City;
    public String State;
    public String PinCode;

    public Address(String addressLine1, String addressLine2, String city, String state, String pinCode) {
        this.AddressLine1 = addressLine1;
        this.AddressLine2 = addressLine2;
        this.City = city;
        this.State = state;
        this.PinCode = pinCode;
    }

    @Override
    public String toString() {
        return AddressLine1 + ", " + AddressLine2 + ", " + "\nCity: " + City + "\nState: " + State + "\nPinCode: " + PinCode;

    }
}
