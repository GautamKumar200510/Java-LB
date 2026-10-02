
import java.util.Scanner;


public class StringEx {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your FirstName");

        String firstName = "Gautam";
        System.out.println("Name : " + firstName);

        String lastName = "Kumar";
        System.out.println("SurName : " + lastName);

        System.out.println("Full Name : " + firstName + " " + lastName);

        System.out.println("-------------------------------------------------------------");


        System.out.println("Enter your FirstName");

        String FirstName = sc.nextLine();

        System.out.println("Enter your lastName");

        String LastName = sc.nextLine();

        System.out.println("Your name is  : "  + FirstName + " " + LastName );

    }

}
