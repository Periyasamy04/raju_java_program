import java.util.Scanner;
public class Grademarks {
    public static void main(String[] args) {
        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark:");
        mark = sc.nextInt();
        if (mark <= 500 && mark > 400) {
            System.out.println("Grade A");
        } else if (mark <= 400 && mark > 300) {
            System.out.println("Grade B");
        } else if (mark <= 300 && mark > 200) {
            System.out.println("Grade C");
        } else if (mark <= 200 && mark > 100) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }
    }
}