package dataStructure.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////Selection sort
		//performance o(n^2)
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int [ ]array=new int [leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random()*101);
		}
		
		System.out.println("Array :"+ Arrays.toString(array)); 
		System.out.println("Array :"+ Arrays.toString(selectionSort(array)));
		
		
	}
	public static int[] selectionSort(int [] array) {
		for(int i=0;i<array.length;i++) {
			int min=array[i];
			int idexmin=i;
			for(int j=i+1;j<array.length;j++) {
				if(min>array[j]) {
				min=array[j];
				idexmin=j;
				}
			} 
			 
			array[idexmin]=array[i];
			array[i]=min;
			 
		}
		return array;
		
	}

}
