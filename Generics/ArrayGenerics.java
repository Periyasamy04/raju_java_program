package Generics;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayGenerics<P> {

    public <P> void printArray(P[] arrayinput){
        for(P elements:arrayinput)
            System.out.println(elements);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayGenerics arrayGenerics=new ArrayGenerics();
        System.out.print("Enter the Size of the Array: ");
        int size=scanner.nextInt();

        scanner.nextLine();
        Integer[] array= new Integer[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        arrayGenerics.printArray(array);
    }
}
