import java.util.*;
import java.io.*;

interface MenuItem {
    Set<String> nveg = Set.of("mutton", "chicken", "fish", "egg");

    void getDescription();

    double getPrice();

    boolean isVegetarian(String t);
}

class FoodItem implements MenuItem {
    private String type, name, description;
    private double price;

    @Override
    public boolean isVegetarian(String t) {
        t = t.toLowerCase();
        if (nveg.contains(t))
            return false;

        else
            return true;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void getDescription() {
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + getPrice());
        System.out.println(description);
    }

    public String getName() {
        return name;
    }

    FoodItem(String t, String n, double p, String d) {
        if (isVegetarian(t))
            type = "Veg";

        else
            type = "Non-Veg";

        name = n;
        price = p;
        description = d;
    }
}

class BeverageItem implements MenuItem {
    private String type, name, description;
    private double price;

    @Override
    public boolean isVegetarian(String t) {
        t = t.toLowerCase();
        if (nveg.contains(t))
            return false;

        else
            return true;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void getDescription() {
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + getPrice());
        System.out.println(description);
    }

    public String getName() {
        return name;
    }

    BeverageItem(String t, String n, double p, String d) {
        if (isVegetarian(t))
            type = "Veg";

        else
            type = "Non-Veg";

        name = n;
        price = p;
        description = d;
    }
}

public class Shop {

    public static void main(String[] args) throws Exception {
        int i, ord = 0;
        double total = 0;
        BufferedReader br1 = new BufferedReader(new FileReader("FoodItem.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("BeverageItem.txt"));
        String[] order = new String[100];
        Scanner s = new Scanner(System.in);

        int count = 0;
        while (br1.readLine() != null) {
            count++;
        }
        int count2 = 0;
        while (br2.readLine() != null) {
            count2++;
        }

        br1.close();
        br2.close();

        br1 = new BufferedReader(new FileReader("FoodItem.txt"));
        br2 = new BufferedReader(new FileReader("BeverageItem.txt"));

        FoodItem[] food = new FoodItem[count];
        BeverageItem[] bev = new BeverageItem[count2];

        String line;
        int ind = 0;
        int ind2 = 0;

        while ((line = br1.readLine()) != null) {
            String[] data = line.split(",");

            String ing = data[0];
            String name = data[1];
            double price = Double.parseDouble(data[2]);
            String desc = data[3];

            food[ind] = new FoodItem(ing, name, price, desc);
            ind++;
        }
        while ((line = br2.readLine()) != null) {
            String[] data = line.split(",");

            String ing = data[0];
            String name = data[1];
            double price = Double.parseDouble(data[2]);
            String desc = data[3];

            bev[ind2] = new BeverageItem(ing, name, price, desc);
            ind2++;
        }
        br1.close();
        br2.close();

        menu: while (true) {
            System.out.println("Menu: 1. Food    2. Beverage    3. View Cart    4. Exit");
            System.out.print("Enter Choice: ");
            int c1 = s.nextInt();
            switch (c1) {
                case 1:
                    food: while (true) {
                        for (i = 0; i < ind; i++) {
                            System.out.println((i + 1) + ". " + food[i].getName());
                        }
                        System.out.println((i + 1) + ". Main Menu");
                        System.out.print("Enter Choice: ");
                        int c2 = s.nextInt();
                        if (c2 == (i + 1)) {
                            continue menu;
                        } else {
                            food[c2 - 1].getDescription();
                            System.out.println("Add to Cart : 1. Yes    2. No");
                            System.out.print("Enter Choice: ");
                            int c3 = s.nextInt();
                            if (c3 == 1) {
                                order[ord] = food[c2 - 1].getName();
                                total += food[c2 - 1].getPrice();
                                ord++;
                            } else {
                                continue food;
                            }
                        }

                    }

                case 2:
                    beverage: while (true) {
                        for (i = 0; i < ind2; i++) {
                            System.out.println((i + 1) + ". " + bev[i].getName());
                        }
                        System.out.println((i + 1) + ". Main Menu");
                        System.out.print("Enter Choice: ");
                        int c2 = s.nextInt();
                        if (c2 == (i + 1)) {
                            continue menu;
                        } else {
                            bev[c2 - 1].getDescription();
                            System.out.println("Add to Cart : 1. Yes    2. No");
                            System.out.print("Enter Choice: ");
                            int c3 = s.nextInt();
                            if (c3 == 1) {
                                order[ord] = bev[c2 - 1].getName();
                                total += bev[c2 - 1].getPrice();
                                ord++;
                            } else {
                                continue beverage;
                            }
                        }

                    }
                case 3:
                    System.out.println("Cart Contents:");
                    for (int j = 0; j < ord; j++) {
                        System.out.println((j + 1) + ". " + order[j]);
                    }
                    System.out.println("Total ODV = Rs. "+total);
                    System.out.println("\nPlace order? :    1. Yes  2. No");
                    int c = s.nextInt();
                    if (c == 1) {
                        System.out.println("Thank you for using out Online Catering Services !!!\nPlease Visit Again :D");
                        System.exit(0);
                    }
                    else {
                        continue menu;   
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }
}