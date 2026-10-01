
import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

          int age = 18;
        boolean iscitizen = true;

        System.out.print("Enter Your Age: ");
        age  = sc.nextInt();
      

         System.out.println("Are You Citizen?? : ");
         iscitizen = sc.nextBoolean();

         if (age>18) {
            System.out.println("able to vote ");
            if (iscitizen) {
                System.out.println("Your are citizen and able to vote");
                
            } else {
                System.out.println("You are not citizen");
            }
             
         } else {
            System.out.println("Not able to vote");
         }

    }

}
