public class Commonno {
    public static void main(String[] args) {
        int[] a1 = {350, 450, 250};
        int[] a2 = {850, 750, 540, 250};
        int[] a3 = {450, 250, 350, 471};
        int count=0;
        for (int i = 0; i < a1.length; i++) {
            for(int j=0; j<a2.length; j++){
                for(int k=0;k< a3.length; k++){
                    if(a1[i]==a2[j] && a2[j]==a3[k] && a3[k]==a1[i]){
                        count++;
                    }
                }
            }
        }
        System.out.println("Repeated numbers:"+count);
    }
}
