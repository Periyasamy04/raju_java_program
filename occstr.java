public class occstr{
    public static void main(String[] args) {
        String str="asdswasdaweafasdaewadadasadswfaswadadaaaaddaaad";
        String occ="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='a'){
                occ=occ+str.charAt(i);
            }
        }
        System.out.println("string after removing character a: "+occ);
    }
}