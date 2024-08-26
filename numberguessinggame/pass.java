package numberguessinggame;

public class pass {
    public static void main(String[] args) {
        int limit=50;
        for(int i=0;i<=limit;i++){
            if(i % 5==0){
                System.out.println("pass");
            }else{
                System.out.println(i);
            }
        }
    }
}