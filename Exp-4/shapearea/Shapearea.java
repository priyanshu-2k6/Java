public class Shapearea {
    double calArea(double rad) {
        return Math.PI * rad * rad;
    }

    double calArea(double len, double br) {
        return len * br;
    }

    double calArea(double base, double ht, boolean isTri) {
        if (isTri) {
            return 0.5 * base * ht;
        }
        return 0;
    }

    double calArea(double a, double b, double ht) {
        return 0.5 * (a + b) * ht;
    }

    public static void main(String[] args) {
        Shapearea cal = new Shapearea();
        System.out.println("Circle Area: " + cal.calArea(5.0));
        System.out.println("Rectangle Area: " + cal.calArea(10.0, 5.0));
        System.out.println("Triangle Area: " + cal.calArea(6.0, 4.0, true));
        System.out.println("Trapezium Area: " + cal.calArea(5.0, 7.0, 10.0));
    }
}