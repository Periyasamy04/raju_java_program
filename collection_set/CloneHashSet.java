package collection_set;

import java.util.HashSet;

public class CloneHashSet {
    public static void main(String[] args) {
        HashSet<String> originalSet= new HashSet<>();
        originalSet.add("Suriya");
        originalSet.add("Raju");
        originalSet.add("Dinesh");

        System.out.println(originalSet);
        HashSet cloneSet= new HashSet();
        cloneSet = (HashSet)originalSet.clone();
        System.out.println(cloneSet);
    }
}
