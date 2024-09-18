package collection_list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparingArrays {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(12);
        list1.add(78);
        list1.add(32);

        List<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(78);
        list2.add(32);
        
        if(list1.equals(list2)){
            System.out.println("Equal.");
        }else{
            System.out.println("Not Equal.");
        }
    }
}
