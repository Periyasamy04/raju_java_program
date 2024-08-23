package SumOrderAccount.bankprogram;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MainVisa {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter Your Card Number: ");
        String inputcardnumber= scanner.nextLine();
        System.out.println("Enter Your Pin Number: ");
        int inputpin= scanner.nextInt();
        System.out.println("Enter Your Amount: ");
        int inputamount= scanner.nextInt();

        AxisBank axisBank = new AxisBank();
        if(axisBank.authenticate(inputcardnumber, inputpin)){
            System.out.println("In Axis bank Your Withdrawal Amount is: "+axisBank.withdraw(inputamount));
        }
        else{
            System.out.println("Your Authentication is Failed. ");
        }

        FederalBank federalBank= new FederalBank();
        if(federalBank.authenticate(inputcardnumber, inputpin)){
            System.out.println("In Federal bank Your Withdrawal Amount is: "+federalBank.withdraw(inputamount));
        }
        else{
            System.out.println("Your Authentication is Failed. ");
        }

        SbiBank sbiBank= new SbiBank();
        if(sbiBank.authenticate(inputcardnumber, inputpin)){
            System.out.println("In SBI bank Your Withdrawal Amount is: "+sbiBank.withdraw(inputamount));
        }
        else{
            System.out.println("Your Authentication is Failed. ");
        }
    }
}
