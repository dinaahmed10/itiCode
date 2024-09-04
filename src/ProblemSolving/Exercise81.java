package ProblemSolving;

import java.util.Arrays;

public class Exercise81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
81. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.
Sample Output:

Original Array: [20, 30, 40]                                           
New array after swaping the first and last elements: [40, 30, 20] 

		 **/
		int [] array= { 20,30,40};
		System.out.println("Original Array: "+Arrays.toString(array));
		int [] array2= { array[2],array[1],array[0]};
		System.out.println("New array after swaping the first and last elements"+Arrays.toString(array2));
   ////////////////////right//////////
		int x=array[0];
	 array[0]=	array[array.length-1];
		array[array.length-1]=x;
		System.out.println("Original Array: "+Arrays.toString(array));
		
	}

}
