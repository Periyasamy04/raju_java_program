package regex;

import java.util.regex.*;

public class PasswordValidation {
    boolean isValidPassword(String password) {
        String regex = "((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@,#,&,*])).{12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        int[] arr= new int[12];
        if(matcher.matches()) {
            for (int i = 0; i < password.length(); i++) {
                for (int j = 0; j < password.length(); j++) {
                    if (password.charAt(i) == password.charAt(j)) {
                        arr[i]++;
                    }
                }
            }

            for (int i = 0; i < password.length(); i++) {
                if (arr[i] == 1) {
                    System.out.println("valid password.");
                    return true;
                }
            }
        }
        System.out.println("invalid password.");
        return false;
    }

    public static void main(String[] args) {
        PasswordValidation passwordValidation=new PasswordValidation();
        System.out.println(passwordValidation.isValidPassword("ABCabc123@#*"));
    }
}