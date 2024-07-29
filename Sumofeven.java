public class Sumofeven {
    public static void main(String[] args) {
        int sum=0;
        int n=25;
        for(int i=1;i<=25;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("sum of even number is: "+sum);
    }
}
