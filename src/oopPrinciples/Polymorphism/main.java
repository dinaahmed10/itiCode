package oopPrinciples.Polymorphism;


 
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     //Upcasting
		 Animal animal=new Animal();
		 Animal myDog = new Dog();
	     Animal myCat = new Cat();
	     myDog.eat();
	     myDog.makeSound();
	     myCat.eat();
	     myCat.makeSound();
	     animal.eat();
	     animal.makeSound();
	     ///////////////////////////////////////////
	     Dog Dog1 = new Dog();
	     Dog1.fooding();
	     Dog1.fooding(8);
	     Dog1.fooding("woof");
	     Dog1.fooding(5, "meat");
	     
	     
	}
	 
}