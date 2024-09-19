package collection_set;

import java.util.HashSet;

public class RemoveAll {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();
        set.add("Suriya");
        set.add("Raju");
        set.add("Dinesh");
        System.out.println("Before making a HashSet Empty. "+ set);
        set.clear();
        if(set.isEmpty()){
            System.out.println("HashSet is Empty. ");
        }
        else{
            System.out.println("HashSet is Not Empty. ");
        }
    }
}
