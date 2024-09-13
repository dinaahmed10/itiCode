package oopPrinciples.Polymorphism;

public class Dog  extends Animal{
	
	@Override
	public void makeSound() {
        System.out.println("Dog makes a sound");
    }
	@Override
	public void eat() {
        System.out.println("Dog is eating ");
    }
	
	
	 public void fooding() {
	        System.out.println("meat");
	    }
 
	     public void fooding(int numMeals) {
	         System.out.println(numMeals);
	    }

	    public void fooding(String typefood) {
	        System.out.println(typefood);
	    }
	    public void fooding(int numMeals,String typefood) {
	         System.out.println("Number of meals :"+numMeals+" , Type of food :"+typefood);
	    }

}
