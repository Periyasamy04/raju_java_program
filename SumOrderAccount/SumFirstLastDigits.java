package SumOrderAccount;

import java.util.Scanner;

public class SumFirstLastDigits {
    public int sumFirstAndLastDigit( int number) {
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        int lastDigit = number % 10;

        if (number < 0) {
            System.out.println("Invalid number");
            return -1;
        }
        return firstDigit+ lastDigit;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number that you wish: ");
        int value= sc.nextInt();
        SumFirstLastDigits sumfirstlastdigits= new SumFirstLastDigits();
        System.out.println(sumfirstlastdigits.sumFirstAndLastDigit(value));
    }
}