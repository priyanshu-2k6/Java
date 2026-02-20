public class javalabclass {  
    public static void main(String[] args) {
      //cannot instantiate an abstract class
      //constructors are allowed for an abstract class
      //final methods are allowed 
      square s = new square(2);
      s.calculate_area();
      s.display_area();
      square.test();
    }	
  }
//an abstract class is given below
abstract class shape
  {
    float area;
    public shape() {
      this.area=0.0F;
    }
    //abstract method declaration
    abstract public void calculate_area();
    public static void test()
    {
      System.out.println("hello from static method");
    }
    public final void display_area()
    {
      System.out.println(area);
    }
  }

//extending the abstract class.
class square extends shape
  {
    int side;
    public square(int side) {
      this.side = side;
    }	
    //implementing the abstract method 
    //its mandatory to provide the implementation of the 
    //abstract methods inherited.
    public void calculate_area() {
      this.area=side*side;
    }
  } 
