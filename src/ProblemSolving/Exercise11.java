package ProblemSolving;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 * */
		float Radius=7.5f;
		double perimeter=  (2* Math.PI * Radius);
		double area=  (Math.PI * Math.pow(Radius, 2));
		System.out.println("Perimeter is = "+perimeter);
		System.out.println("Area is = "+area);
	}

}
