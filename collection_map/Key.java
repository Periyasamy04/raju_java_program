package collection_map;

import java.util.HashMap;

public class Key {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"Raju");
        map.put(1,"Akshaya");
        map.put(2,"Naveen");
        System.out.println(map.keySet());
    }
}
