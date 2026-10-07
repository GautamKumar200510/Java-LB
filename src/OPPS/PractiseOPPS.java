// 1. CLASS
class Car {

    // 3. ENCAPSULATION
    private String color;
    private int speed;

    // Constructor
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    // 4. INHERITANCE
    void drive() {
        System.out.println("Car is driving");
    }
}


// Child class
class SportsCar extends Car {

    SportsCar(String color, int speed) {
        super(color, speed);
    }

    // 5. POLYMORPHISM
    @Override
    void drive() {
        System.out.println("Sports car is driving very fast");
    }
}


// 6. ABSTRACTION
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}


// Main class
public class PractiseOPPS {

    public static void main(String[] args) {

        // 2. OBJECT
        Car c1 = new Car("Red", 100);

        System.out.println(c1.getColor());

        c1.drive();


        // Object of child class
        SportsCar c2 = new SportsCar("Blue", 200);

        c2.drive();
    }
}