class Overload {
    void show(int a, double b) {
        System.out.println("Integer and Double: " + a + ", " + b);
    }

    void show(double a, int b) {
        System.out.println("Double and Integer: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.show(10, 20.5);
        obj.show(30.5, 40);
    }
}