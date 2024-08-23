package SumOrderAccount.bankprogram;

public class AxisBank extends Visa {
    String cardNumber="RAJU6804";
    int pin=6804;
    double balance=2500;

    @Override
    public boolean authenticate(String cardnumber, int pinnumber) {
            return this.cardNumber.equals(cardnumber)&&  this.pin== pinnumber;
    }

    @Override
    public double getbalance() {
        return balance ;
    }
}
