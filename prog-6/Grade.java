import java.util.*;

public class Grade {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the marks you got: ");
        int m = s1.nextInt();

        String res = (m >= 80) ? ("A") : ((m >= 60 && m < 80) ? "B" : "C");

        System.out.println("Your grade is: " + res);

        s1.close();
    }

}