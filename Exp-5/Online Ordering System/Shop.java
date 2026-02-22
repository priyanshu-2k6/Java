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
        System.out.println("Price: " + getPrice());
        System.out.println(description);
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
        System.out.println("Price: " + getPrice());
        System.out.println(description);
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
        BufferedReader br = new BufferedReader(new FileReader("FoodItem.txt"));

        int count = 0;
        while (br.readLine() != null) {
            count++;
        }

        br.close();

        br = new BufferedReader(new FileReader("FoodItem.txt"));

        FoodItem[] food = new FoodItem[count];

        String line;
        int ind = 0;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            String ing = data[0];
            String name = data[1];
            double price = Double.parseDouble(data[2]);
            String desc = data[3];

            food[ind] = new FoodItem(ing, name, price, desc);
            ind++;
        }

        System.out.println("Menu:\n\nFood Items:\n");
        for (int i = 0; i < ind; i++) {
            System.out.println((i + 1) + ". ");
            food[i].getDescription();
        }
    }
}