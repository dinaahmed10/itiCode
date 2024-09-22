package oopPrinciples.Abstract;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal Animal1=new Animal();   eror ont object from interface
		Dog Dog=new Dog();
		Dog.eat();
		Dog.drink();
		Dog.food();
		Dog.sleep();
		Dog.sound();
		Cat Cat=new Cat();
		Cat.eat();
		Cat.drink();
		Test Test=new Test();
		Test.display();
		System.out.println(Constants.add(5, 10) );
		
	}

}
