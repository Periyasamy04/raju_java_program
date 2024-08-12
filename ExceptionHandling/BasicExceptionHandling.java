package ExceptionHandling;
public class BasicExceptionHandling {
    public static void main(String[] args) {
        int number1=9;
        int number2=0;
        try{
            int result=number1 / number2;
            System.out.println(result);
        }
        catch(ArithmeticException a){
            System.out.println(" Cannot divisible by 0 ");
        }
    }
}
