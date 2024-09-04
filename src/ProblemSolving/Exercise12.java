package ProblemSolving;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
		 * */
		Scanner input=new Scanner(System.in);
		System.out.print("Input first number:");
		int  num1=input.nextInt();
		int  num2=input.nextInt();
		int  num3=input.nextInt();
		int average=(num1+num2+num3)/3;
		System.out.println(average);

	}

}
