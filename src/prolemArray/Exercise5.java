package prolemArray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		
		/**
		  5. Write a Java program to test if an array contains a specific value.
		 **/
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		System.out.println();
		String[] array=new String[leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextLine();
		}
		System.out.println("array :"+Arrays.toString(array));
		System.out.print("Ente specific value: ");
		String item=input.nextLine();
		System.out.println("array :"+Arrays.toString(array));
		System.out.println(contains(array,item));
		
	}	 
		
	
	
	public static boolean contains(String[] arr,String item) {
		boolean x=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(item)) {
				x=true;
				break;
			}
		}
		
		return x;
		
	}
	
	

}
