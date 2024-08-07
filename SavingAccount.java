public class SavingAccount extends BankAccount {
    public void interestRate(double principal,double rate,double years){
        double interestrate=principal*rate*years/100;
        System.out.println(" interestRate of the savings account "+interestrate);
    }

    public static void main(String[] args) {
        BankAccount bankaccount= new BankAccount();
        System.out.println(bankaccount.accountNumber);
        bankaccount.deposit(1000);
        bankaccount.withdraw(500);
        SavingAccount savingAccount= new SavingAccount();
        savingAccount.interestRate(6000, 3,5);
    }
}
