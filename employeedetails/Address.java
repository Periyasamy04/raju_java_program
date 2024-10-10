package employeedetails;

public class Address {
    public String addressLine1;
    public String addressLine2;
    public String city;
    public String state;
    public String pinCode;

    public Address(String addressLine1, String addressLine2, String city, String state, String pinCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }
    @Override
    public String toString() {
        return addressLine1 + ", " + addressLine2 + ", " + "\nCity: " + city + "\nState: " + state + "\nPinCode: " + pinCode;

    }
}
