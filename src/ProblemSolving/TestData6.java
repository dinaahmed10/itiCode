package ProblemSolving;

import java.util.Scanner;

public class TestData6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * */
		Scanner input=new Scanner(System.in);
		System.out.print("Input first number:");
		int  n=input.nextInt();
		System.out.print("Input second number:");
		int  u=input.nextInt();
		System.out.println(n+" + "+u+" = "+ (n+u));
		System.out.println(n+" - "+u+" = "+ (n-u));
		System.out.println(n+" x "+u+" = "+n*u);
		System.out.println(n+" / "+u+" = "+n/u);
		System.out.println(n+" mod "+u+" = "+n%u);
	}

}
