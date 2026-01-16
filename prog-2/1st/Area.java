import java.util.*;
public class Area{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle:");
        float a = s1.nextFloat();
        float b = s1.nextFloat();
        float c = s1.nextFloat();

        if (((a+b)>c)&&((a+c)>b)&&((b+c)>a)) {
            double s = (a + b + c) / 2;
            double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of triangle is: " + A);
        }
        else {
            System.out.println("Triangle not possible with these sides");
        }
        s1.close();
    }
}
