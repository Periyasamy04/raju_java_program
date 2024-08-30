package setexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoxSet {
    public static void main(String[] args) {
        // Define the sets for each box
        Set<Integer> boxA = new HashSet<>(Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15));
        Set<Integer> boxB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 12, 13, 14, 15));
        Set<Integer> boxC = new HashSet<>(Arrays.asList(2, 3, 6, 7, 10, 11, 14, 15));
        Set<Integer> boxD = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15));

        Set<Integer>[] Boxes = new Set[]{boxA, boxB, boxC, boxD};

        Set<Integer> guessedNumberSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        Scanner scanner = new Scanner(System.in);

        for (int i =  0; i < Boxes.length; i++) {
            System.out.print("Is your number in Box " + (char)('A' +i) + "? (Yes/No): ");
            String value = scanner.nextLine();
            if (value.equals("yes")) {
                guessedNumberSet.retainAll(Boxes[i]);
            } else if (value.equals("no")) {
                guessedNumberSet.removeAll(Boxes[i]);
            } else {
                System.out.println("Invalid Input.");
            }
        }
        if(guessedNumberSet.size()==1){
            System.out.println("Your Guessed Number is "+guessedNumberSet.iterator().next());
        }
        else{
            System.out.println("Guessed Number is not between the range given. ");
        }
    }
}