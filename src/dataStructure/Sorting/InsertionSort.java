package dataStructure.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        ////Insertion sort
			//performance o(n^2)
			Scanner input=new Scanner(System.in);
			System.out.print("input leanth of array : ");
			int leanthArray=input.nextInt();
			int [ ]array=new int [leanthArray];
			for(int i=0;i<array.length;i++) {
				array[i]=(int) (Math.random()*101);
			}
			
			System.out.println("Array :"+ Arrays.toString(array)); 
			System.out.println("Array :"+ Arrays.toString(insertionSort(array)));
	}
	public static int[] insertionSort(int [] array) {
		for(int i=0;i<array.length;i++) {
			int currentItem=array[i];
			int j;
			for(j=i-1;j>=0 && currentItem<array[j] ;j-- ) {
				array[j+1]=array[j];
				
			}
			array[j+1]=currentItem;
		}
		return array;
		
	}

}
