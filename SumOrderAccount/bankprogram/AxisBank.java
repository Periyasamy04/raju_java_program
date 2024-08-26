package SumOrderAccount.bankprogram;

public class AxisBank extends Visa {
    String cardNumber="RAJU6804";
    int pin=6804;
    double balance=2500;

    @Override
    public boolean authenticate(String cardNumber, int pinNumber) {
            return this.cardNumber.equals(cardNumber)&&  this.pin== pinNumber;
    }

    @Override
    public double getBalance() {
        return balance ;
    }
}
