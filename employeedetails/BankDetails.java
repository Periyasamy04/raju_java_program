package employeedetails;

public class BankDetails {
    public String nameontheAccount;
    public String accountNumber;
    public String bankName;
    public String branch;

    BankDetails(String nameontheAccount, String accountNumber, String bankName, String branch) {
        this.nameontheAccount = nameontheAccount;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "\nName on the bank: " + nameontheAccount + "\n" + "Account Number: " + accountNumber + "\n"
                + "Bank Name: " + bankName + "\n" + "Branch: " + branch;
    }
}
