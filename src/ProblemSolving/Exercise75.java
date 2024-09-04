package ProblemSolving;

import java.util.Scanner;

public class Exercise75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
  75. Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false

 * */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input The array length : ");
		int num=input.nextInt();
		int [] array=new int[num];
		if(num>=2) {
			for(int i=0;i<array.length;i++) {
				  array[i]=input.nextInt();
			}
			 System.out.println("////////////////");
			int frist=array[0];
			int last=array[array.length-1];
			 if(frist==last) {
				System.out.println("true");
			 }else {
				 System.out.println("false");
			 }
		}else {
			 System.out.println("The array length not 2");
		}
	}

}