package SumOrderAccount;
import java.util.Scanner;

public class IncreaseDecrease {

    public void checking(int number1, int number2, int number3) {
        if(number1 < number2 && number2 < number3) {
            System.out.print("The Given input "+ number1+", "+number2+", "+number3+" is in Increasing Order. ");
        }
        else if(number1 > number2 && number2 > number3) {
            System.out.println("The Given input " + number1 + ", " + number2 + ", " + number3 + " is in Decreasing Order. ");
        }
        else {
            System.out.println("The Given input is not either increasing or Decreasing. ");
        }
    }

    public static void main(String[] args) {
        IncreaseDecrease risingReducing = new IncreaseDecrease();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter the number3: ");
        int number3 = scanner.nextInt();
        risingReducing.checking(number1,number2,number3);
    }
}

