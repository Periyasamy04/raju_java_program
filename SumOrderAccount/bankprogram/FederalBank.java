package SumOrderAccount.bankprogram;

public class FederalBank extends Visa {
    String cardNumber="SADHU2909";
    int pin=2909;
    double balance=5000;

    @Override
    public boolean authenticate(String cardnumber, int pinnumber) {
            return this.cardNumber.equals(cardnumber)&&  this.pin== pinnumber;
    }

    @Override
    public double getbalance() {
        return balance;
    }
}
