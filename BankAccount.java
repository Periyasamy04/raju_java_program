public class BankAccount {
    protected int accountNumber=287682876;
    protected double balance=5000;
    double amount;

    protected double deposit(double amount){
        balance= balance+amount;
        System.out.println("balance after deposit:"+balance);
        return amount;
    }

    protected double withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("balance after withdrawing " + balance);
        } else {
            System.out.println("insufficient amount");
        }
        return amount;
    }

}
