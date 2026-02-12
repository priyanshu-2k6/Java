class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void display() {
        System.out.println("This is a cirlce.");
    }
}

public class Overrid {
    public static void main(String[] args) {
        Shape s = new Circle(); // Upcasting
        s.display();
    }
}