package collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpdateElements {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(20);

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
