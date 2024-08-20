package distancecalculation;
import java.util.Scanner;
public class Citydistance {
    static int a = 1;
    static int b = 3;
    static int c = 5;
    static int d = 7;
    static int e = 9;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Starting city: ");
        String starting= sc.nextLine();
        System.out.println("enter the destination: ");
        String destination = sc.nextLine();

        int startingcity= Getvalue(starting);
        int destinationcity= Getvalue(destination);

        if(startingcity ==0 || destinationcity==0){
            System.out.println("check the given value");
        } else {
            int distance= Math.abs(startingcity - destinationcity);
            System.out.println("The difference between starting city "+ starting + "and destination city"+ destination+ " is "+ distance);
        }
    }

    public static int Getvalue(String city){
        switch (city){
            case "a":
                return a;
            case "b":
                return b;
            case "c":
                return c;
            case "d":
                return d;
            case "e":
                return e;
            default:
                return 0;
        }
    }
}

