package distancecalculation;
import java.util.Scanner;
public class Citydistance {
    int a = 1;
    int b = 3;
    int c = 5;
    int d = 7;
    int e = 9;

    public int calculation(int startingdistance, int endingdistance) {
        if (startingdistance > endingdistance) {
            return startingdistance - endingdistance;
        } else {
            return endingdistance - startingdistance;
        }
    }

    public int switchCase(String location) {
        int calculation = 0;
        switch (location) {
            case "a":
                calculation = this.a;
                break;
            case "b":
                calculation = this.b;
                break;
            case "c":
                calculation = this.c;
                break;
            case "d":
                calculation = this.d;
                break;
            case "e":
                calculation = this.e;
                break;
            default:
                System.out.println("invalid location");
                break;
        }
        return calculation;
    }

    public static void main(String[] args) {
        Citydistance citydistance = new Citydistance();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Starting: ");
        String starting= sc.nextLine();
        System.out.println("enter the destination: ");
        String destination = sc.nextLine();

        int Starting= citydistance.calculation(citydistance.switchCase(starting),citydistance.switchCase(destination));
        System.out.println(Starting);
    }
}

