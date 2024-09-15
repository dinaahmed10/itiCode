package dataStructure.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ////Merge sort
		//performance o(n log n)
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int [ ]array=new int [leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random()*101);
		}
		
		System.out.println("Array :"+ Arrays.toString(array));
		mergeSort(array);
		System.out.println("Array :"+ Arrays.toString(array)); 
	}
	 public static void  mergeSort(int[] arr) {
		 if (arr.length < 2) {
	            return;
	            
	        }

	        int mid = arr.length / 2; 
	        int[] left = new int[mid]; 
	        int[] right = new int[arr.length - mid];  

	         
	        System.arraycopy(arr, 0, left, 0, mid);
	        System.arraycopy(arr, mid, right, 0, arr.length - mid);

	        
	        mergeSort(left);
	        mergeSort(right);

	         
	        merge(arr, left, right);
	 } 
	 private static void merge(int[] arr, int[] left, int[] right) {
	        int i = 0, j = 0, k = 0;

	        // Merge left and right arrays
	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                arr[k++] = left[i++];
	            } else {
	                arr[k++] = right[j++];
	            }
	        }

	        // Copy remaining elements of left array
	        while (i < left.length) {
	            arr[k++] = left[i++];
	        }

	        // Copy remaining elements of right array
	        while (j < right.length) {
	            arr[k++] = right[j++];
	        }
	        
	    }
	 

}
