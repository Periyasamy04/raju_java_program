package GenericsTask;
import java.util.Scanner;
public class Box<p> {
    private p age;

    public void setage(p age){
        this.age = age;
    }
    public p getage() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Intput values
        System.out.print("Enter the Integer Value: ");
        int intinput= scanner.nextInt();
        Box<Integer> intvalue=new Box<>();
        intvalue.setage(intinput);
        System.out.println(intvalue.getage());
        // String values
        scanner.nextLine();
        System.out.print("Enter the String Value: ");
        String stringinput= scanner.nextLine();
        Box<String> stringvalue=new Box<>();
        stringvalue.setage(stringinput);
        System.out.println(stringvalue.getage());
    }
}
