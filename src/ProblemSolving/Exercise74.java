package ProblemSolving;

import java.util.Scanner;

public class Exercise74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 74. Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10

true
 * **/
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
			 if(frist==10  || last ==10) {
				System.out.println("true");
			 }else {
				 System.out.println("false");
			 }
		}else {
			 System.out.println("The array length not 2");
		}
	}

}
