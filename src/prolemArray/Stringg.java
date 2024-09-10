package prolemArray;

import java.util.Arrays;
import java.util.Scanner;

public class Stringg {

	 public static void main(String[] args) {
		 
		 
		 String[] fruits = {"apple", "banana", "orange"};

	        // Using Arrays.toString() to print the entire array
	        System.out.println("Fruits in the array: " + Arrays.toString(fruits));
	        
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the length of the array: ");
	        int lengthArray = input.nextInt();
	        input.nextLine(); // Consume the newline character left by nextInt()

	        String[] array = new String[lengthArray];

	        System.out.println("Enter " + lengthArray + " strings:");
	        for (int i = 0; i < array.length; i++) {
	        	//4
	        	//System.out.print(i);
	            array[i] = input.nextLine();
	        }

	        // Optional: Print the array to verify input
	        System.out.println("You entered:");
	        for (String str : array) {
	            System.out.println(str);
	        }

	        input.close(); // Close the scanner
	    }
	}
