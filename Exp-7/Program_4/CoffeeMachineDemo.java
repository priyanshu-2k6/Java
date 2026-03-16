
class CoffeeMachine extends Thread {

    public void heatWater() {
        System.out.println("Heating water...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Water heated.");
    }

    public void addCoffee() {
        System.out.println("Adding coffee powder...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Coffee powder added.");
    }

    public void pourCoffee() {
        System.out.println("Pouring coffee...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Coffee ready!");
    }

    @Override
    public void run() {
        heatWater();
        addCoffee();
        pourCoffee();
        System.out.println("Coffee preparation completed.");
    }
}

public class CoffeeMachineDemo {

    public static void main(String[] args) {

        CoffeeMachine cm = new CoffeeMachine();

        System.out.println(cm.getName() + " is in NEW state.");

        cm.start();

        System.out.println(cm.getName() + " is in RUNNING state.");

        try {
            cm.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(cm.getName() + " is in TERMINATED state.");
    }
}
