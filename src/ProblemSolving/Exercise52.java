package ProblemSolving;

import java.util.Scanner;

public class Exercise52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/***
   52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
 * ***/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int num1=input.nextInt();
		System.out.print("Input the second number : ");
		int num2=input.nextInt();
		System.out.print("Input the third number : ");
		int num3=input.nextInt();
		
		int sum=num1+num2;
		if(sum==num3) {
			System.out.print("The result is: true");
		}else {
			System.out.print("The result is: false");
		}
		
		
	}

}
