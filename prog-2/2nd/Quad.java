import java.util.*;

public class Quad {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("This is the program to find the roots of the given quadratic equation ax^2 + bx + c = 0");
        System.out.println("Enter the values of a, b & c:");
        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();
        float d = (b * b) - (4 * a * c);
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            String r1f = String.format("%.4f", r1);
            String r2f = String.format("%.4f", r2);
            System.out.println("The roots of the equation:- " + a + "x^2 + " + b + "x + " + c + " = 0 are: ");
            System.out.println("Root 1: " + r1f);
            System.out.println("Root 2: " + r2f);
        } else {
            System.out.println("The roots are imaginary.");
        }
        s1.close();
    }
}