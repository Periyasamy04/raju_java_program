package collection_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(20);

        ListIterator<Integer> it = list.listIterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}