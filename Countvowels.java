public class Countvowels {
    public static void main(String[] args) {
        String[] arr ={"apple", "ball", "collection", "meeting", "raju"};
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'a' || arr[i].charAt(j) == 'e' || arr[i].charAt(j) == 'i' || arr[i].charAt(j) == 'o' || arr[i].charAt(j) == 'u') {
                    count++;
                }
            }
            System.out.println(arr[i] + " = " + count);
        }
    }
}
