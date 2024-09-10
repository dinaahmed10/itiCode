package prolemArray;

 
import java.util.Scanner;

public class duplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*   12. Write a Java program to find duplicate values in an array of integer values. 
 * 
Duplicate Element : 2                                                                                         
Duplicate Element : 5                                                                                         
Duplicate Element : 6

 *  **/
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			
			array[i]=input.nextInt();
		}
		duplicateValuesArray(array);
	}
	public static void duplicateValuesArray(int[]arr) {
		int n=arr.length;
		int[] array=new int[n];
		for(int i=0;i<n;i++) { 
			int r=0;
			for(int ii=1;ii<n;ii++) {
				if(arr[i]==arr[ii]   && !array.equals(arr[i]) ) {
					array[r++]=arr[i]; 
				}
			}
		}
		int i=0;
		while(array[i]!=0) {
			System.out.print("Duplicate Element : "+array[i]+"\n");
			i++;
		}
		 	}

}
