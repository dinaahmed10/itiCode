package prolemArray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
9. Write a Java program to insert an element (specific position) into an array.
 **/
		
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		System.out.print("input element insert : ");
		int ele=input.nextInt();
		System.out.print("input position insert : ");
		int position=input.nextInt();
		System.out.println("array :"+Arrays.toString(array));
		System.out.println("insert a specific element in position from Array : "+Arrays.toString(insertPositionElement(array,ele,position)));
		
	}
	public static int[] insertPositionElement(int []arr,int element,int position){
		int n=arr.length;
		 
		for(int i=0;i<n;i++) {
			if(position==(i+1)) {
				arr[i]=element;
			}
		}
		 
		return arr;
		
	}

}
