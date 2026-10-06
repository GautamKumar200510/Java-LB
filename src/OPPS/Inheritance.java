class Car {

    // Parent class method
    void drive() {
        System.out.println("Car is driving");
    }

    void stop() {
        System.out.println("Car is stopped");
    }
}


// Child class
class SportsCar extends Car {

    void turbo() {
        System.out.println("Turbo is activated");
    }
}


public class Inheritance {

    public static void main(String[] args) {

        // Object of child class
        SportsCar car = new SportsCar();

        // Parent class ke methods
        car.drive();
        car.stop();

        // Child class ka method
        car.turbo();
    }
}