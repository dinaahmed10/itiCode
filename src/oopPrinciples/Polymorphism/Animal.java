package oopPrinciples.Polymorphism;

public  class Animal {
	
	public void makeSound() {
        System.out.println("Animal makes a sound");
    }
	public void eat() {
        System.out.println("Animal is eating ");
    }
	
	
	////method as final, you cannot override it./////
	public final void play() {
        System.out.println(" is playing!");
    }

}
