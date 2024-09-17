package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    String extractPhoneNumbers(String text) {
        String phoneNumberregex = "\\(\\+\\d{2}\\)\\s\\d{5}-\\d{5}|\\d{3}-\\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(phoneNumberregex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder output=new StringBuilder();
        while(matcher.find()){
            if(!output.isEmpty()){
                output.append(" Or ");
            }
            output.append(matcher.group());
        }
        if(!output.isEmpty()){
            return output.toString();
        }
        else
            return "Null";
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber=new PhoneNumber();
        System.out.println(phoneNumber.extractPhoneNumbers("Call me at (+91) 23456-72890 or at 987-424-4124"));
    }
}
