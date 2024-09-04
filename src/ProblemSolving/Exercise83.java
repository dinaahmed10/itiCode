package ProblemSolving;

public class Exercise83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*****
 83. Write a Java program to multiply the corresponding elements of two integer arrays.
Sample Output:

Array1: [1, 3, -5, 4]                                                  
                                                                       
Array2: [1, 4, -5, -2]                                                 
                                                                       
Result: 1 12 25 -8
 ********/
		
		int [] array1= { 1,3,-5,4};
		int [] array2= { 1,4,-5,-2};
		System.out.print("Result ");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i] *array2[i]+" ");
		}
		
		
	}

}
