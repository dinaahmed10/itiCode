package oopPrinciples.Polymorphism;




/////class as final, you cannot extend it.
public final class Cat extends Animal {
	@Override
	public void makeSound() {
        System.out.println("Cat makes a sound");
    }
	@Override
	public void eat() {
        System.out.println("Cat is eating ");
    }
	 
}
