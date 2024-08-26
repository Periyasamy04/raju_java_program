package SumOrderAccount.bankprogram;

public class SbiBank extends Visa {
    String cardNumber="ACHU1512";
    int pin=1512;
    double balance= 4000;

    @Override
    public boolean authenticate(String cardNumber, int pinNumber) {
        return this.cardNumber.equals(cardNumber)&&  this.pin== pinNumber;
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
