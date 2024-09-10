package prolemArray;

import java.util.Arrays;
import java.util.Scanner;

public class duplicateValuesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *
 * 13. Write a Java program to find duplicate values in an array of string values.
Duplicate Element is : bcd                                                                                    
Duplicate Element is : oiu
 * 
 * ***/
		
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		input.nextLine();
		String[] array=new String[leanthArray];
	    System.out.println("Enter " + leanthArray + " strings:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextLine();
        }
        System.out.println("array: " + Arrays.toString(array));
		duplicateValuesArray(array);
		
	}
	
	public static void duplicateValuesArray(String[]arr) { 
		int n=arr.length; 
		String[] array=new String[n];
		int r=0; 
		for(int i=0;i<n;i++) {   
			for(int ii=i+1;ii<n;ii++) { 
				if(arr[i].equals(arr[ii] ) && !arrayContains(array,arr[i])  ) {
					array[r]=arr[i]; 
					r++;
					break;
				}
			}
		}
		
		 
		int i=0; 
		
		while(array[i]!=null) {
		  System.out.println("Duplicate Element : "+array[i]);
			i++;
		}
		}
		 
	
	public static boolean arrayContains(String[] array, String element) {
        if (array == null) {
            return false; // Handle null array
        }
        for (String item : array) {
            if (item != null && item.equals(element)) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }

}
