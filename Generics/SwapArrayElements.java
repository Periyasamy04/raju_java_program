package Generics;
import java.util.Scanner;

public class SwapArrayElements<P>{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.print("Enter the Index 1: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter the Index 2: ");
        int index2 = scanner.nextInt();

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println("After Swapping the Elements:");
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
