import java.util.Scanner;

public class SumOfNoGenerics {
    public  <T extends Number> void sum(T number1, T number2) {
        double doublenumbers = number1.doubleValue() + number2.doubleValue();
        System.out.println(doublenumbers);
        int intnumbers = number1.intValue() + number2.intValue();
        System.out.println(intnumbers);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number1: ");
        int numbers1= scanner.nextInt();
        System.out.print("Enter the Number2: ");
        int numbers2= scanner.nextInt();
        SumOfNoGenerics sumOfNoGenerics = new SumOfNoGenerics();
        sumOfNoGenerics.sum(numbers1,numbers2);
    }
}
