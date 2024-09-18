package collection_set;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class EmptyLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hashSet= new LinkedHashSet<>();
        hashSet.add(6);
        hashSet.add(29);
        hashSet.add(15);
        hashSet.add(16);
        hashSet.add(16);

        System.out.println("Before making a HashSet Empty. "+ hashSet);
        hashSet.clear();
        if(hashSet.isEmpty()){
            System.out.println("HashSet is Empty. ");
        }
        else{
            System.out.println("HashSet is Not Empty. ");
        }
    }
}
