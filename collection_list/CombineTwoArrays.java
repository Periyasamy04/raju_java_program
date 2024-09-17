package collection_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineTwoArrays {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>(Arrays.asList("Raju","sadhana","Shruti","Naveen","Akshaya"));
        List<String> list2=new ArrayList<>(Arrays.asList("Karthick","Vicky","Hari","Lalit"));

        list1.addAll(list2);
        System.out.println("Combined Values : "+list1);
    }
}
