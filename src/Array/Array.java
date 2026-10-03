public class Array {
    public static void main(String[] args) {

        
        // // Primitive array
        // int[] arr = {10, 20, 30, 40};
        // int n = arr.length;

        // System.out.print("Primitive Array -> ");
        // for (int i = 0; i < n; i++)
        //     System.out.print(arr[i] + " ");

        // System.out.println();

        // // Non-primitive array (String objects)
        // String[] names = {"Lakshit", "Rahul", "Pankaj"};

        // System.out.print("Non-Primitive Array -> ");
        // for (int i = 0; i < names.length; i++)
        //     System.out.print(names[i] + " ");

        // System.out.println("    --------------------------------------------------------------------       ");

        int mark [] = {89, 98,38, 76, 92};
        System.out.println(mark.length);

        System.out.println("First element : " + mark[0]);
        System.out.println("Second element : " + mark[1]);
        System.out.println("Third element : " + mark[2]);
        System.out.println("Fourth element : " + mark[3]);
        System.out.println("Fifth element : " + mark[4]);
        // System.out.println("Sixth element : " + mark[5]);             // index out bound exception 


        System.out.println("-------------------------------------------------------");

        int marks [] = {89, 98,38, 76, 92};
        int n = marks.length;

        System.out.println("==========For Noram Loop===========");
        for (int idx = 0; idx <= n-1 ; idx++) {
            System.out.println(marks[idx]);
            
        }

        System.out.println("=============For Each Loop============");
        for(int number: marks){
            System.out.println(number);
        }
    }
}
        
  
