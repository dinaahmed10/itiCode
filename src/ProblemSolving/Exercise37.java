package ProblemSolving;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/**
37. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
 * */

		Scanner input = new Scanner(System.in);
		System.out.print("Input an string: ");
		String string=input.nextLine();
		System.out.println(string.length());
		for(int i=string.length()-1;i>=0;i--) {
			System.out.print(string.charAt(i));
		}
	}

}
