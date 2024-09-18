package collection_map;

import java.util.HashMap;

public class RemoveAllMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"Raju");
        map.put(1,"Akshaya");
        map.put(2,"Naveen");
        System.out.println("Before Removing: "+map);
        map.clear();
        System.out.println("After Removing: "+map);
    }
}
