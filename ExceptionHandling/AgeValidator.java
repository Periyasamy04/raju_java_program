package ExceptionHandling;
import java.util.Scanner;
public class AgeValidator {
    static void Validateage(int age)throws InvalidAgeException{
        if(age>0 && age<120){
            System.out.println("the age is valid "+age);
        }
        else{
            throw new InvalidAgeException("age must be between 0 and 120");
            }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input: ");
        int input= sc.nextInt();
        try {
            Validateage(input);
        } catch (InvalidAgeException a) {
            System.out.println("InvalidAgeException occurs "+a);
        }
    }
}