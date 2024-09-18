package collection_list;

import java.util.LinkedList;

public class InsertLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> List=new LinkedList<>();

        List.add(12);
        List.add(14);
        List.add(16);
        List.addFirst(20);

        for (int i=0;i<List.size();i++){
            System.out.println(List.get(i));
        }
    }
}
