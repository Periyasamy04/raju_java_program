package SumOrderAccount;
import java.util.Scanner;

public class Risingreducing {

    public void checking(int number1, int number2, int number3){
        if(number1 < number2 && number2 < number3){
            System.out.print("The Given input "+ number1+","+number2+","+number3+"is in Ascending Order. ");
        }
        else if(number1 > number2 && number2 > number3){
            System.out.println("The Given input"+ number1+","+number2+","+number3+"is in Descending Order. ");
        }
        else{
            System.out.println("The Given input is not either Ascending or Descending. ");
        }
    }

    public static void main(String[] args) {
        Risingreducing risingreducing= new Risingreducing();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the number2: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the number3: ");
        int number3 = sc.nextInt();
        risingreducing.checking(number1,number2,number3);
    }
}

