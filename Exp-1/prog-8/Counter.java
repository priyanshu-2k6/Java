import java.util.*;
import java.util.concurrent.TimeUnit;

public class Counter {

    static void counter(int n) {
        if (n == 0) {
            System.out.println("Time Over!");
            return;
        }
        System.out.println(n);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // Even if kept empty, it's okay.
            e.printStackTrace();
        }
        counter(n - 1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time (in seconds): ");
        int a = sc.nextInt();
        counter(a);

        sc.close();
    }

}