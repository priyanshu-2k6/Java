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

class ElectricCar extends Car {
    int batteryCapacity = 100;

    void displayBattery() {
        System.out.println("Battery Capacity: " + batteryCapacity
                + " kWh");
    }
}

public class Multi {
    public static void main(String[] args) {
        ElectricCar BYD = new ElectricCar();
        BYD.move();
        BYD.displayBrand();
        BYD.displayBattery();
    }
}