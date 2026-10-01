
import java.util.Scanner;

public class Terniary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income :");

        int income = sc.nextInt();

        System.out.println((income > 10000) ? "Rich" : "Poor");

        System.out.println("Enter Bool : ");

        boolean ans = (10 > 20) ? true : false;
        System.out.println(ans);
    }

}
