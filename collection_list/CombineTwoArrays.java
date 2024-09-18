package collection_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineTwoArrays {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("Raju");
        list1.add("Sadhana");
        list1.add("Akshaya");
        
        List<String> list2=new ArrayList<>();
        list2.add("Karthick");
        list2.add("Lalit");
        list2.add("Hari");

        list1.addAll(list2);
        System.out.println("Combined Values : "+list1);
    }
}
