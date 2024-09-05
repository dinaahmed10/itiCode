package prolemArray;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*11. Write a Java program to reverse an array of integer values.**/
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			
			array[i]=input.nextInt();
		}
		System.out.println("array :"+Arrays.toString(array));
		System.out.println("Reversearray :"+Arrays.toString(ReverseArray(array)));
	}
	public static int[]ReverseArray(int[]arr){
		int n=arr.length;
		int [ ] array=new int[n];
		int i=0;
		int num=n-1;
		while(i<n) {
		array[i]=arr[num];
		i++;
		num--;
		}
		
		return array;
		
	}

}
