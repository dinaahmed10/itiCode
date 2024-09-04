package ProblemSolving;

import java.util.Arrays;

public class Exercise80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.
Sample Output:

Original Array: [20, 30, 40]                                           
Larger value between first and last element: 40 
		 **/
		int [] array= { 20,30,40};
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("Original Array: "+Arrays.toString(array));
		System.out.println("Larger value between first and last element: "+max);

	}

}
