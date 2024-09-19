package collection_map;

import java.util.HashMap;
import java.util.TreeMap;

public class FirstLastElements {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(0,"Raju");
        map.put(1,"Akshaya");
        map.put(2,"Naveen");
        System.out.println("First (Lowest) key: "+ map.firstKey());
        System.out.println("Last (Highest) key: "+ map.lastKey());
    }
}
