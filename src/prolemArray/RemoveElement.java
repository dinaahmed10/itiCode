package prolemArray;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 7. Write a Java program to remove a specific element from an array.
 * */
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		System.out.print("input element : ");
		int ele=input.nextInt();
		System.out.println("array :"+Arrays.toString(array));
		System.out.println("remove a specific element from Array : "+Arrays.toString(removeElement(array,ele)));
		
	}
	public static int[] removeElement(int []arr,int element){
		int n=arr.length;
		int index=0;
		for(int i=0;i<n;i++) {
			if(element==arr[i]) {
				index=i;
			}
		}
		int [ ] array=new int[n-1];
		for(int i=0;i<n-1;i++) {
			if(i>=index) {
				array[i]=arr[i+1];
			}else {
				array[i]=arr[i];
			}
		}
		return array;
		
	}

}
