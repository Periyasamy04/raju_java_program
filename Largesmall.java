public interface Largesmall {
    public static void main(String[] args) {
        int[] arr={42,445547,784857,145142,78442};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println("minimum of the number is: "+arr[0]);
        System.out.println("maximum of the number is: "+arr[arr.length-1]);
    }
}
