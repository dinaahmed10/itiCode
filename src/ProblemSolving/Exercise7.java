package ProblemSolving;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *Write a Java program that takes a number as input and prints its multiplication table up to 10.
 * */
		Scanner input=new Scanner(System.in);
		System.out.print("Input a number:");
		int  number=input.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+" x "+number+"= " +(i*number));
		}
	}

}
