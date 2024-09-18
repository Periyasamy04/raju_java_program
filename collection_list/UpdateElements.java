package collection_list;

import java.util.*;

public class UpdateElements {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Suriya");
        list.add("Raju");
        list.add("Saran");
        list.add("Dinesh");
        list.add("Naveen");

        Scanner scanner=new Scanner(System.in);
        System.out.print("Select the value you want to be replaced "+list + ":");
        String updatevalue= scanner.nextLine();
        int indexValue= list.indexOf(updatevalue);
        System.out.print("Enter the value You want to Update: ");
        String changingelement= scanner.nextLine();
        list.set(indexValue,changingelement);
        System.out.println(list);
    }
}