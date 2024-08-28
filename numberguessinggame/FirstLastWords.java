package numberguessinggame;

import java.util.Scanner;

public class FirstLastWords {
    public static void main(String[] args) {
        String[] words={"apple","application","banana","appreciate","pineapple"};

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String firstword= scanner.nextLine();
        System.out.println("Enter the last word: ");
        String lastword= scanner.nextLine();

        for(int i=0;i < words.length;i++){
            if(words[i].startsWith(firstword) && words[i].endsWith(lastword)){
                System.out.println(words[i]);
            }
        }
    }
}