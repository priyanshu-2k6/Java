
import java.util.Scanner;

public class DivisionCal {

    public static double divide(int n, int d) {
        if (d == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            return n / d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter numerator: ");
            int num = sc.nextInt();
            System.out.println("Enter denominator: ");
            int den = sc.nextInt();
            double res = divide(num, den);
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } catch (java.util.InputMismatchException e) {
            System.err.println("Error: Invalid Input. Please enter valid integers.");
        } finally {
            sc.close();
        }
    }
}
