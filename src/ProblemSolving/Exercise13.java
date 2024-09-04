package ProblemSolving;

public class Exercise13 {
	public static void main(String[] args) {
		/*
		13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5 
		 * */
		double Width = 5.6;
		double Height = 8.5 ;
		double area=Width*Height ;
		double perimeter=2*(Width+Height);
		System.out.println("Area is"+Width+"*"+Height+"="+ area);
		System.out.println("Perimeter is "+"2 * ( "+Width+"+"+Height+") = "+ perimeter);
		
	}

}
