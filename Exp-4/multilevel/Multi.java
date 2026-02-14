class Vehicle {
    void move() {
        System.out.println("This vehicle is moving.");
    }
}

class Car extends Vehicle {
    String brand = "Tesla";

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}


public class Multi {
    public static void main(String[] args) {
        Car BYD = new Car();
        BYD.move();
        BYD.displayBrand();
        // BYD.displayBattery();
    }
}