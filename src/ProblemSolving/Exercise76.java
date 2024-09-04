package ProblemSolving;

public class Exercise76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
76. Write a Java program to test if the first and last element of two integer arrays are the same. The array length must be greater than or equal to 2.
Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
array2 = 45, 20, 10, 20, 30, 50, 11
Sample Output:

false
 
 * ****/
		int [] array1= {50, -20, 0, 30, 40, 60, 12};
		int [] array2= {45, 20, 10, 20, 30, 50, 11};
		boolean result= (array1.length>=2 &&  array2.length>=2 && array1[0]==array2[0] && array1[array1.length-1]==array2[array2.length-1] );
		
		System.out.println(result);
	}

}
