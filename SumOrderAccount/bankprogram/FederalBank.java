package SumOrderAccount.bankprogram;

public class FederalBank extends Visa {
    String cardNumber="SADHU2909";
    int pin=2909;
    double balance=5000;

    @Override
    public boolean authenticate(String cardNumber, int pinNumber) {
            return this.cardNumber.equals(cardNumber) && this.pin== pinNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
