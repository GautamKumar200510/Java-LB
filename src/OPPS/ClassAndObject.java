class Car {

    // Properties / Data
    String color;
    int speed;

    // Method / Behavior
    void drive() {
        System.out.println("Car is driving");
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        // Object creation
        Car c1 = new Car();

        // Object ke andar values store karna
        c1.color = "Red";
        c1.speed = 100;

        // Object ka data access karna
        System.out.println("Car Color: " + c1.color);
        System.out.println("Car Speed: " + c1.speed);

        // Object ka method call karna
        c1.drive();
    }
}