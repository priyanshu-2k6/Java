class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("This is a single-threaded program.");
        System.out.println("It is running in a single thread.");
        System.out.println("Only one task is being performed.");
    }
}

public class SingleThreadExample {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}