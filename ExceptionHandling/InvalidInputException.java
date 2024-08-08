package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InvalidInputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        System.out.println("Enter the number2: ");
        try {
            int Number1= sc.nextInt();
            int Number2= sc.nextInt();
            int result= Number1 / Number2;
            System.out.println("the result"+ result);
        }
        catch(ArithmeticException a){
            System.out.println("cannot divisible by 0");
        }
        catch(InputMismatchException i){
            System.out.println("invalid input");
        }
    }
}
