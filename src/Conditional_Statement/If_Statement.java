
import java.util.Scanner;

public class If_Statement {

    public static void main(String args[]) {
        // int i = 10;

        // if (i < 15) {
        //     System.out.println("Condition is True");
        // }
// 1. check yor are rich or not??
        Scanner sc = new Scanner(System.in);
        int income;
        System.out.print("Enter Your Income : ");
        income = sc.nextInt();

        if (income > 100000) {
            System.out.println("You are rich");

        }

// 2. yor are eligible for vote ??
    System.out.print("Enter Your age : ");
    int age= sc.nextInt();
    if (age>=18) {
        System.out.println("You are eligible");
        
    }

    }
}
