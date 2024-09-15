package dataStructure.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int [ ]array=new int [leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random()*101);
		}
		
		System.out.println("Array :"+ Arrays.toString(array));
		quickSort(array,0,array.length-1);
		System.out.println("Array :"+ Arrays.toString(array)); 
	}
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the subarrays
            quickSort(arr, low, pivotIndex - 1); // Before pivot
            quickSort(arr, pivotIndex + 1, high); // After pivot
        }
    }

    // Method to partition the array
    private static int partition(int[] arr, int low, int high) {
        // Pivot (Element to be placed at right position)
        int pivot = arr[high];

        // Index of smaller element
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // If the current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at index i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


}
