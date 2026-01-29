class Calculator{
    int res;
    Calculator(){
        System.out.println("Default constructor was called.");
        res=0;
    }
    Calculator(int i){
        System.out.println("Parameterized constructor was called.");
        res=i;
    }
    void display(){
        System.out.println("Result = "+res);
    }
}
public class Const {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(20);
        c1.display();
        c2.display();
    }
}