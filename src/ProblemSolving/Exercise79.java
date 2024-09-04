package ProblemSolving;

import java.util.Arrays;

public class Exercise79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 79. Write a Java program to rotate an array (length 3) of integers in the left direction.
Sample Output:

Original Array: [20, 30, 40]                                           
Rotated Array: [30, 40, 20]
		 **/
		int [] array= { 20,30,40};
		int [] RotatedArray= new int [array.length];
		int x=array[0]; //20
		RotatedArray[0]=array[1];
		RotatedArray[1]=array[2];
		RotatedArray[2]=array[0];
		/// int[] new_array_nums = {array_nums[1], array_nums[2], array_nums[0]};
		System.out.println("Original Array: "+Arrays.toString(array));
		System.out.println("Rotated Array: "+Arrays.toString(RotatedArray));

	}

}
