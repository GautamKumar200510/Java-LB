
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        
        // Taking input in the array
        // int arr[] = {10,20,30,40,50}

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");

        int size = sc.nextInt();

        int arr[] = new int[size];
        
        for (int count = 1; count < size; count++){
            int index = count-1;
            System.out.println("Enter the value of Index : " + index);
            arr[index] = sc.nextInt();
    
        }
//  Find sum of all Array
        int sum =0;

        for ( int num: arr){
            sum = sum+ num;
            System.out.println("Total sum : " + sum);
            System.out.println("========================================");
        }
        // Find minimum and maximum value in array
        
        int arr2[] = {20, 5, -3, 0, 89, 76, 298, 45, 23, 96};

        int mini = Integer.MAX_VALUE;
        for (int number : arr2) {
            if (number < mini) {
                mini = number;
            }
        }
        System.out.println("Minimum value: " + mini);
    }
}
