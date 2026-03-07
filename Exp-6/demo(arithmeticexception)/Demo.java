
public class Demo {

    public static void main(String[] args) {
        int j = 0;
        int i = 0;

        try {
            j = 18 / i;
        } catch (Exception e) {
            System.out.println("Something went wrong." + e);
        }

        System.out.println(j);
        System.out.println("Bye.");
    }
}
