package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailTask {
    boolean isValidEmail(String email){
        String regexpattern="[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}";
        Pattern pattern = Pattern.compile(regexpattern);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()){
            System.out.println("Given email is valid.");
            return true;
        }
        else{
            System.out.println("Please enter the valid email.");
            return false;
        }
    }

    public static void main(String[] args) {
        GmailTask gmailTask=new GmailTask();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the your email: ");
        String email= scanner.nextLine();
        gmailTask.isValidEmail(email);
    }
}
