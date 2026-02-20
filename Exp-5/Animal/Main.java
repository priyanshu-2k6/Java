abstract class Animal{
	public abstract void eat();
	public abstract void sleep();
}

class Dog extends Animal{
	@Override
	public void eat(){
		System.out.println("The Dog is Eating :P");
	}
	@Override
	public void sleep(){
		System.out.println("The Dog is Sleeping :D");
	}
}

public class Main{
	public static void main(String[] args){
		Dog d = new Dog();
		d.eat();
		d.sleep();
	}
}