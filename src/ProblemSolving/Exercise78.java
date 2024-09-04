package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***
78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
Sample Output:

Original Array: [5, 7]                                                 
true 
		 ***/
		Scanner input = new Scanner(System.in);
		System.out.print("Input The array : ");
		int[] array1 = new int[2];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		
		boolean bool =( array1.length>=2 && ( array1[0]==4 || array1[0]==7 ||array1[1]==4 || array1[1]==7));
		System.out.println("Original Array: "+Arrays.toString(array1));
		System.out.println(bool);
	}

}
