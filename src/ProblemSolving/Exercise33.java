package ProblemSolving;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 3. Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 * **/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num=input.nextInt();
		int sum=0;
		 while(num!=0) {
			sum+=num%10;
			num/=10;
			
		 }
			System.out.println("The sum of the digits is: "+sum);
	}

}
