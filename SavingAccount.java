public class SavingAccount extends BankAccount {
    double interestRate,principal,rate,years;
    public void interestRate(){
        interestRate=principal*rate*years/100;
        System.out.println(" interestRate of the savings account"+interestRate);
    }

    public static void main(String[] args) {
        BankAccount bankaccount= new BankAccount();
        System.out.println(bankaccount.accountNumber);
        bankaccount.deposit(1000);
        bankaccount.withdraw(500);

    }
}
