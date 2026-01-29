class Bank{
    // public variable to access anywhere without method
    public String name;
    // private variable, can be accessed only using method of class
    private double bal;
    Bank(String a, double b){
        name = a;
        bal=b;
    }
    public void dep(double b){
        bal += b;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Balance: "+bal);
    }
}
public class Priv {
    public static void main(String[] args) {
        Bank p = new Bank("Raju", 20000);
        System.out.println("Parameterized values: ");
        p.display();
        p.name = "Rajesh"; // Can manipulate values directly as it is public var.
        // p.bal = 20; // Can't manipulate values as private var.
        p.dep(250); // Method to access private var.
        System.out.println();
        System.out.println("Manipulated values:");
        p.display();
    }
}