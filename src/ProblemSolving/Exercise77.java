package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
77. Write a Java program to create an array of length 2 from two integer arrays with three elements. The newly created array will contain the first and last elements from the two arrays.
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:

Array1: [50, -20, 0]                                                   
Array2: [5, -50, 10]                                                   
New Array: [50, 10]
		 **/

		Scanner input = new Scanner(System.in);
		System.out.print("Input The array1 : ");
		int[] array1 = new int[3];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		System.out.print("Input The array2 : ");
		int[] array2 = new int[3];
		for (int ii = 0; ii < array2.length; ii++) {
			array2[ii] = input.nextInt();
			}
		int[] array3 = new int[2];
		array3[0]=array1[0];
		array3[1]=array2[array2.length-1];
      System.out.println("Array1: " + Arrays.toString(array1));
        
        // Print the elements of array2
        System.out.println("Array2: " + Arrays.toString(array2));
		System.out.println("Array1: ["+array1[0]+", "+array1[1]+", "+array1[2]+"]");
		System.out.println("Array2: ["+array2[0]+", "+array2[1]+", "+array2[2]+"]");
		System.out.println("New Array: ["+array3[0]+", "+array3[1]+ "]");
	}
}
