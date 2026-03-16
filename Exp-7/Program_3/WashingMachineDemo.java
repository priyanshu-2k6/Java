
class WashingMachine extends Thread {

    public void waterIn() {
        System.out.println("Water filling started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Water filling completed.");
    }

    public void rinse() {
        System.out.println("Rinsing clothes...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Rinsing completed.");
    }

    public void spin() {
        System.out.println("Spinning started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Spinning completed.");
    }

    @Override
    public void run() {
        waterIn();
        rinse();
        spin();
        System.out.println("Washing cycle completed.");
    }
}

public class WashingMachineDemo {

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        System.out.println(wm.getName() + " is in NEW state.");

        wm.start();

        System.out.println(wm.getName() + " is in RUNNING state.");

        try {
            wm.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(wm.getName() + " is in TERMINATED state.");
    }
}
