package collection_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppendElements {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();
        set.add("Suriya");
        set.add("Raju");
        set.add("Dinesh");

        System.out.println("Before Appending an Element. "+set);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Element You want to append: ");
        String input= scanner.nextLine();
        set.add(input);
        System.out.println("After Appending an Element. "+set);
    }
}
