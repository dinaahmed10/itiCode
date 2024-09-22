package oopPrinciples.Abstract;

public interface Animal {
	  void eat(); // public and abstract
	   void drink() ;
	   default void sleep() {
	        System.out.println("Animal sleeps");
	    }
	   
}
