package collection_list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparingArrays {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(12, 31, 14, 76));
        List<Integer> list2=new ArrayList<>(Arrays.asList(91, 18, 14, 65));

        if(list1.equals(list2)){
            System.out.println("Equal.");
        }else{
            System.out.println("Not Equal.");
        }
    }
}