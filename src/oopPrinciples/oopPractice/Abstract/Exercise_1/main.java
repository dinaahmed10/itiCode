package oopPrinciples.oopPractice.Abstract.Exercise_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion Lion=new Lion();
		Lion.sound();
		Tiger Tiger=new Tiger();
		Tiger.sound();
        // Create an instance of Lion and assign it to an Animal reference
		 Animal lion = new Lion();  // Polymorphism in action
		 lion.sound();
		 // Create an instance of Tiger and assign it to an Animal reference
		 Animal tiger = new Tiger();
		 tiger.sound();
		 Animal myAnimal = new Lion(); // Upcasting
		 myAnimal.sound();
		 myAnimal = new Tiger(); // Reassigning
		 myAnimal.sound();
		 int x=13;
		 double z=x;
		 
	}

}
