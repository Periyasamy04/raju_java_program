package collection_set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ConvertSetToArray {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet= new LinkedHashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");

        String[] array= hashSet.toArray(new String[0]);
        for(String output : array)
        System.out.println(output);
    }
}
