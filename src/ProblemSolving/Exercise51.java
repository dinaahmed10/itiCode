package ProblemSolving;

import java.util.Scanner;

public class Exercise51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 51. Write a Java program to convert a string to an integer.
Sample Output:

Input a number(string): 25                                             
The integer value is: 25
 * */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number(string): ");
		String Snum=input.nextLine();
		 int result = Integer.parseInt(Snum);
		System.out.println("The integer value is:"+result);
		
		
	}

}
