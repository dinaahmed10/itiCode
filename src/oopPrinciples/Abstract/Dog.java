package oopPrinciples.Abstract;

public class Dog extends Animall implements Animal{

	@Override
	public void eat() {
		 System.out.println("Dog is eating");
		
	}

	@Override
	public void drink() {
		 System.out.println("Dog is drinking");
		
	}
	public void food() {
		 System.out.println(" food Dog ");	
	}

}
