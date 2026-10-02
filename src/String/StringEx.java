
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

        System.out.println("-----------------------------String Method-------------------");

        String str = "Gautam";
        System.out.println( str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(1 , 4));

        System.out.println("=========================================");

        String str2 = "My name is Gautam Kumar";
        System.out.println(str2.contains("Gautam"));
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());

        System.out.println("======================================");

        String Str3 = "       Gautam           ";
        System.out.println(Str3.trim());

        System.out.println("============Important String Method===========");

        String str4 = "I love to go Patna";
        String[] words = str4.split(" ");

        for (String word : words){
             System.out.println(word);
        }

    }

}
