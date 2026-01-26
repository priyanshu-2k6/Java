import java.util.*;

public class Encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enter the plain text (in a single line): ");
        String line = sc.nextLine();
        System.out.print("Enter the number of bits to shift: ");
        int shift = sc.nextInt();
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNextInt()) {
            num.add(lineScan.nextInt());
        }
        for (int i = 0; i < num.size(); i++) {
            int g = num.get(i) << shift;
            num.set(i, g);
        }
        System.out.println("The encrypted text is: ");
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }
        System.out.println();
        System.out.print("Remember the Code: " + shift);
        sc.close();
        lineScan.close();
    }
}

