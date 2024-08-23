package SumOrderAccount.bankprogram;

public class SbiBank extends Visa {
    String cardNumber="ACHU1512";
    int pin=1512;
    double balance= 4000;

    @Override
    public boolean authenticate(String cardnumber, int pinnumber) {
        return this.cardNumber.equals(cardnumber)&&  this.pin== pinnumber;
    }
    @Override
    public double getbalance() {
        return balance;
    }
}
