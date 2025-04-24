package pet;

public class Dog extends Pet{

	@Override
	public void walk() {
		System.out.println("Dog walk");
	}

	@Override
	public void eat() {
		System.out.println("Dog eat");
	}
	
}
