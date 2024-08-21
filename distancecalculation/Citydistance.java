package distancecalculation;
import java.util.Scanner;
public class Citydistance {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        int d = 7;
        int e = 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Starting city: ");
        String starting= sc.nextLine();
        System.out.println("enter the destination: ");
        String destination = sc.nextLine();

        int startingcity= Getvalue(starting,a,b,c,d,e);
        int destinationcity= Getvalue(destination,a,b,c,d,e);

        if(startingcity ==0 || destinationcity==0){
            System.out.println("check the given value");
        } else {
            int distance= Math.abs(startingcity - destinationcity);
            System.out.println("The difference between starting city "+ starting + "and destination city"+ destination+ " is "+ distance);
        }
    }

    public static int Getvalue(String city,int a, int b, int c, int d, int e){
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

