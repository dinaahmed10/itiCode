package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 94. Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.
 * ***/
		
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		int even=0,odd=0;
		System.out.println(" array : "+Arrays.toString(array));
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		int[] arrayeven=new int[even];
		int Ieven=0,Iodd=0;
		int[] arrayodd=new int[odd];
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				arrayeven[Ieven]=array[i];
				Ieven++;
			}else {
				arrayodd[Iodd]=array[i];
				Iodd++;
			}
		}
		System.out.println(" arrayodd : "+Arrays.toString(arrayodd));
		System.out.println(" arrayeven : "+Arrays.toString(arrayeven));
		int count =0;
		for(int i=0;i<arrayodd.length;i++) {
			 
			array[i]=arrayodd[i];
			count++;
			 
		}
		for(int i=0;i<arrayeven.length;i++) {
			 
			array[count]=arrayeven[i];
			count++;
			 
		}
		 
		System.out.println(" array : "+Arrays.toString(array));
		 
	}
	}