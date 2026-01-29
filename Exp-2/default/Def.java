class Person{
    String name;
    Person(){
        System.out.println("Default constructor was called.");
        name="Default Person";
    }
    void displayInfo(){
        System.out.println("Name: "+name);
    }
}
public class Def{
    public static void main(String[] args) {
        Person p = new Person();
        p.displayInfo();
    }
}