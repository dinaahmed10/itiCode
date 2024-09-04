package ProblemSolving;

import java.util.Scanner;

public class Exercise49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 49. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
Sample Output:

Input a number: 20                                                     
1
 **/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num=input.nextInt();
		if(num%2==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
