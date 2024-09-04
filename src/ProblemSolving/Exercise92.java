package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 92. Write a Java program to count the number of even and odd elements in a given array of integers.
 */
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		int counteven=0, countodd=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				counteven++;
			}else {
				countodd++;
			}
		}
		System.out.println(" array : "+Arrays.toString(array));
		System.out.println(" counteven : "+counteven);
		System.out.println(" countodd : "+countodd);
		
		
	}

}
