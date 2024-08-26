package SumOrderAccount.bankprogram;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MainVisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Bank Name: ");
        String bankName = scanner.nextLine();
        System.out.println(" Enter Your Card Number: ");
        String inputCardNumber = scanner.nextLine();
        System.out.println("Enter Your Pin Number: ");
        int inputPin = scanner.nextInt();
        System.out.println("Enter Your Amount: ");
        int inputAmount = scanner.nextInt();

        AxisBank axisBank = new AxisBank();
        FederalBank federalBank = new FederalBank();
        SbiBank sbiBank = new SbiBank();

        if (bankName.toLowerCase().equals("axisbank")) {
            if (axisBank.authenticate(inputCardNumber, inputPin)) {
                System.out.println("In Axis bank Your Withdrawal Amount is: " + axisBank.withdraw(inputAmount));
            } else {
                System.out.println("Your Authentication is Failed. ");
            }
        }

        if (bankName.toLowerCase().equals("federalbank")) {
            if (federalBank.authenticate(inputCardNumber, inputPin)) {
                System.out.println("In Federal bank Your Withdrawal Amount is: " + federalBank.withdraw(inputAmount));
            } else {
                System.out.println("Your Authentication is Failed. ");
            }
        }

        if (bankName.toLowerCase().equals("sbibank")) {
            if (sbiBank.authenticate(inputCardNumber, inputPin)) {
                System.out.println("In SBI bank Your Withdrawal Amount is: " + sbiBank.withdraw(inputAmount));
            } else {
                System.out.println("Your Authentication is Failed. ");
            }
        }
    }
}
