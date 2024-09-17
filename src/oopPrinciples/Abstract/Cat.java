package oopPrinciples.Abstract;

public class Cat  implements Animal{

	@Override
	public void eat() {
		 System.out.println("Cat is eating");
		
	}

	@Override
	public void drink() {
		 System.out.println("Cat is drinking");
		
	}

}
