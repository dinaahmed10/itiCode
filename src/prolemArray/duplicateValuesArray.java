package prolemArray;

import java.util.Arrays;
import java.util.Scanner;

public class duplicateValuesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*12. Write a Java program to find duplicate values in an array of integer values.*/
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			
			array[i]=input.nextInt();
		}
		System.out.println("array :"+Arrays.toString(array));
		System.out.println("duplicateValueArray :"+Arrays.toString(duplicateValueArray(array)));
	}
	public static int []duplicateValueArray(int[] arr){
		int n=arr.length;
		int [ ] array=new int[n];
		int index=0;
		int indexDuplicate=0;
		for(int i=0;i<n;i++) {
			int x=arr[i];
			for(int j=i+1;j<n;j++) {
				System.out.println(j);
				if(x==arr[j] && x!=0) {
					x=arr[j];
					indexDuplicate=j;
					arr[j]=0;
					array[index]=arr[indexDuplicate];
					index++;
				} 
			}
	 
			 
			
		}
		return arr;
	}

}
