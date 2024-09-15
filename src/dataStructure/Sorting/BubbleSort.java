package dataStructure.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ////Bubble sort
		//performance o(n^2)
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int [ ]array=new int [leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random()*101);
		}
		
		System.out.println("Array :"+ Arrays.toString(array)); 
		System.out.println("Array :"+ Arrays.toString(bubbleSort(array)));
	} 
	    public static int[]  bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped=true; 
	        for (int i = 0; i < n - 1 && swapped; i++) {
	            swapped = false; 
	            for (int j = 0; j < n - i - 1; j++) { 
	                if (arr[j] > arr[j + 1]) { 
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	        }
			return arr;
	    }
}
