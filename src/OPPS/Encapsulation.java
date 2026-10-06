class Car {

    // Data hiding
    private String color;
    private int speed;

    // Setter method
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method
    public String getColor() {
        return color;
    }

    // Setter method
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter method
    public int getSpeed() {
        return speed;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        // Object creation
        Car c1 = new Car();

        // Values set using setter
        c1.setColor("Red");
        c1.setSpeed(100);

        // Values get using getter
        System.out.println("Car Color: " + c1.getColor());
        System.out.println("Car Speed: " + c1.getSpeed());
    }
}