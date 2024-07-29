public class Palindrome {
    public static void main(String[] args) {
        String[] arr = {"racecar", "man", "madam", "question"};
        char ch;
        for (int i=0;i<4;i++) {
            String rev = "";
            for (int j = 0;j<arr[i].length();j++) {
                ch = arr[i].charAt(j);
                rev = ch + rev;
            }
            if(arr[i].equals(rev)){
                System.out.println(arr[i]+" is a palindrome");
            }
        }
    }
}
