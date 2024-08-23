package SumOrderAccount.bankprogram;

public class AxisBank extends Visa {


    @Override
    public boolean authenticate(String cardNumber, int pin) {
        if(this.cardNumber.equals(cardNumber)&&  this.pin== pin){
            return true;
        }
        else{

            return false;
        }
    }

    @Override
    public double getbalance() {
        return balance ;
    }
}
