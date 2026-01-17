import java.util.*;

public class Marks {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int a = s1.nextInt();

        String res = a >= 40 ? "Passed" : "Failed";

        System.out.println("The result is: " + res);
        
        s1.close();
    }

}