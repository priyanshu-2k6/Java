abstract class Vehicle{
	abstract void start();  // Abstract Method
	void stop(){			// Concrete Method
		System.out.println("The Vehicle is Stopping :/");
	}
}

class Car extends Vehicle{
	@Override
	void start(){
		System.out.println("Car start with ignition key...");
	}
}

class Bike extends Vehicle{
	@Override
	void start(){
		System.out.println("Bike starts with a kick/self-start...");
	}
}

public class Main{
	public static void main(String[] args){
		Car c = new Car();
		Bike b = new Bike();
		c.start();
		b.start();
		c.stop();
		b.stop();
	}
}