package numbertowords;

import java.util.Scanner;

public class Conversion {
    public void check(int value, String stringvalue) {
        String ones[] = {"", " One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "twelve", "thirteen", "Fourteen", "Fiveteen", "sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String tens[] = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (value > 19) {
            System.out.print(tens[value / 10] + " " + ones[value % 10]);
        } else {
            System.out.print(ones[value] + " ");
        }
        if (value > 0) {
            System.out.print(stringvalue + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = sc.nextInt();
        Conversion conversion = new Conversion();
        conversion.check((value / 100000) % 100, " Lakhs ");
        conversion.check((value / 1000) % 100, " thounsand ");
        conversion.check((value / 100) % 10, " Hundred ");
        conversion.check(value % 100, "");
    }
}

