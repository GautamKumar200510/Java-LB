
public class TypeCasting {

    public static void main(String[] args) {
// 1. Implicit Conversion (Widening)
        int a = 10;
        double b = a;   // Automatic conversion

        System.out.println(b);

// 2. Explicit Conversion (Narrowing)
        double x = 10.75;
        int y = (int) x;

        System.out.println(y);

    }

}
