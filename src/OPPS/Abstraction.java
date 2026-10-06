abstract class Car {

    // Abstract method
    abstract void start();

    // Normal method
    void stop() {
        System.out.println("Car is stopped");
    }
}


// Child class
class BMW extends Car {

    // Implementation of abstract method
    @Override
    void start() {
        System.out.println("BMW starts with a button");
    }
}


public class Abstraction {

    public static void main(String[] args) {

        // Object of child class
        BMW car = new BMW();

        car.start();
        car.stop();
    }
}