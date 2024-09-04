package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class arrangeArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*      رتب من الصغير للكبير*/
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("array :"+Arrays.toString(array));
		arrange(array);
		System.out.println("arrayِِِArrange :"+Arrays.toString(array));
		
	}


public static int[] arrange(int [] arr) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		int min=arr[i];
		int nn=0;
		for(int j=i;j<n;j++) {
			 if(min>arr[j]) {
				 min=arr[j];
				 nn=j;
			 }
		} 
		if(nn!=0) {
		arr[nn]=arr[i];
		arr[i]=min;
		 
		}
	}
	
	return arr;
	
}

}
