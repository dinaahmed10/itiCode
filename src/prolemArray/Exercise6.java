package prolemArray;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. Write a Java program to find the index of an array element.
		*/
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		System.out.print("input element : ");
		int ele=input.nextInt();
		System.out.println(" index of an array element : "+(indexElement(array,ele)));
		

	}
	
	public static int indexElement(int []arr,int element) {
		int n=arr.length;
		int index=0;
		for(int i=0;i<n;i++) {
			if(element==arr[i]) {
				index=i;
			}
		}
		return index;
		
	}

}
