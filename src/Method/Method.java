class Student {

    String name = "Gautam";

    // Method 1: No Parameter + No Return
    void displayName() {
        System.out.println("Student Name: " + name);
    }

    // Method 2: Parameter + Return
    int calculateTotal(int maths, int java) {
        return maths + java;
    }
}

public class Method {

    public static void main(String[] args) {

        // Create object
        Student s1 = new Student();

        // Call displayName() method
        s1.displayName();

        // Call calculateTotal() method
        int total = s1.calculateTotal(80, 90);

        System.out.println("Total Marks: " + total);
    }
}