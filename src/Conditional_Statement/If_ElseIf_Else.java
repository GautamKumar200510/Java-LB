
import java.util.Scanner;

public class If_ElseIf_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Income : ");
        int Income = sc.nextInt();

        if (Income>100000) {
            System.out.println("You are top 5% rich in india");
        }
        else if (Income>90000) {
            System.out.println("You are top 10% rich in india");
        }
        else if (Income>80000) {
            System.out.println("You are top 20% rich in india");
        }
        else if (Income>70000) {
            System.out.println("You are top 30% rich in india");
        }
        else if (Income>60000) {
            System.out.println("You are top 40% rich in india");
        }
        else if (Income>50000) {
            System.out.println("You are top 50% rich in india");
        }
            
        
        else {
            System.out.println("You are poor in India");
        }

    }

}
