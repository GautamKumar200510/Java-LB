class Car {

    void drive() {
        System.out.println("Car is driving normally");
    }
}


class SportsCar extends Car {

    @Override
    void drive() {
        System.out.println("Sports car is driving very fast");
    }
}


public class Polymorphism {

    public static void main(String[] args) {

        // Parent class object
        Car c1 = new Car();
        c1.drive();

        // Child class object
        SportsCar c2 = new SportsCar();
        c2.drive();
    }
}