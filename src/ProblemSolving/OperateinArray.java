package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class OperateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*              sum odd even avarage */
		Scanner input=new Scanner(System.in);
		System.out.print("input leanth of array : ");
		int leanthArray=input.nextInt();
		int[] array=new int[leanthArray];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("array :"+Arrays.toString(array));
		System.out.println("Sum Array : "+sumArray(array));
		System.out.println("Avarage Array : "+avarageArray(array));
		System.out.println("Odd Array : "+Arrays.toString(oddArray(array)));
		System.out.println("Even Array : "+Arrays.toString(evenArray(array)));
	}
	
	public static int sumArray(int[] arr) {
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
		 sum+=arr[i];
		}
		return sum  ;
		
	}
	public static int avarageArray(int[] arr) {
		int n=arr.length;
		int sum=0,avarage=0;
		for(int i=0;i<n;i++) {
		 sum+=arr[i];
		}
		avarage=sum/n;
		return avarage  ;
		
	}
	public static int[] oddArray(int[] arr) {
		int n=arr.length;
		 
		 int Iarr=0;
		 for(int i=0;i<n;i++) {
				if(arr[i]%2!=0) {
					Iarr++;
				}
				}
			 
		 int [] arrr=new int[Iarr];
		 int Iarrr=0;
		for(int i=0;i<n;i++) {
	      if(arr[i]%2!=0) {
	    	  arrr[Iarrr]=arr[i];
	    	  Iarrr++;
	      }
		}
	 
		return arrr  ;
		
	}
	public static int[] evenArray(int[] arr) {
		int n=arr.length;
		 
		 int Iarr=0;
		 for(int i=0;i<n;i++) {
				if(arr[i]%2==0) {
					Iarr++;
				}
				}
			 
		 int [] arrr=new int[Iarr];
		 int Iarrr=0;
		for(int i=0;i<n;i++) {
	      if(arr[i]%2==0) {
	    	  arrr[Iarrr]=arr[i];
	    	  Iarrr++;
	      }
		}
	 
		return arrr  ;
		
	}

}
