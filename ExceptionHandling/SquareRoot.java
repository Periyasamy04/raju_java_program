package ExceptionHandling;

public class SquareRoot {
    static void square(int number) throws IllegalArgumentException{
        if(number <=0){
            System.out.println("the number is negative"+number);
        }
        throw new IllegalArgumentException("Squareroot of the number "+number+" is:"+ Math.sqrt(number));
    }

    public static void main(String[] args) {
        try{
            square(9);
        }
        catch(IllegalArgumentException a){
            System.out.println("IllegalArgumentException occurs"+a);
        }
    }
}
