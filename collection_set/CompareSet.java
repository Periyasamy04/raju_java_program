package collection_set;

import java.util.HashSet;

public class CompareSet {
    public static void main(String[] args) {
        HashSet<String> set1= new HashSet<>();
        set1.add("Suriya");
        set1.add("Raju");
        set1.add("Dinesh");

        HashSet<String> set2= new HashSet<>();
        set2.add("saran");
        set2.add("Raju");
        set2.add("Naveen");

        set1.retainAll(set2);
        System.out.println("The Repeating elements is: "+set1);
    }
}
