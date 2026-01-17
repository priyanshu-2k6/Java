import java.util.*;

public class GreaterThanTwo {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the 3 values below:");

        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();

        int res = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The greates number among the three is: " + res);
        s1.close();
    }

}