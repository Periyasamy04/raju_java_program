package SumOrderAccount.bankprogram;

public class MainVisa {
    public static void main(String[] args) {
        AxisBank axisBank = new AxisBank();
        if(axisBank.authenticate("SPAN2504", 6804)){
            System.out.println("Withdraw Amount is: "+axisBank.withdraw(1000));
        }
        else{
            System.out.println("Your Authentication is Failed. ");
        }
    }
}
