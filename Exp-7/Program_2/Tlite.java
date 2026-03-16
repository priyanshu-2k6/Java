
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " is in the RUNNING state.");

        // Sleep for a while to simulate some work
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " has completed its work and is in the TERMINATED state.");
    }
}

public class Tlite {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // New Threads
        System.out.println(thread1.getName() + " is in the NEW state.");
        System.out.println(thread2.getName() + " is in the NEW state.");

        // Start both threads
        thread1.start();
        thread2.start();

        // Running Threads
        System.out.println(thread1.getName() + " is in the RUNNING state.");
        System.out.println(thread2.getName() + " is in the RUNNING state.");

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TERMINATED Threads
        System.out.println(thread1.getName() + " is in the TERMINATED state.");
        System.out.println(thread2.getName() + " is in the TERMINATED state.");
    }
}
