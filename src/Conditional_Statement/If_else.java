
import java.util.Scanner;

public class If_else{
    public static void main(String[] args) {
        
        Scanner Sc= new Scanner(System.in);
        System.out.print("Enter Your Incomme : ");
        int incomme = Sc.nextInt();

        if (incomme>100000) {
            System.out.println("You are Rich");
        } else {
            System.out.println("You are Poor");
        }
    }
}