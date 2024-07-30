public class Reversestr {
    public static void main(String[] args) {
        String ori="raju";
        System.out.println("original string is "+ori);
        char ch;
        String rev="";
        for(int i=0;i< ori.length();i++){
            ch=ori.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Reverse string is "+rev);
    }
}
