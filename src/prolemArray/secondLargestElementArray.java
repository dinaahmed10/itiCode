package prolemArray;

import java.util.Arrays;

public class secondLargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		/***  17. Write a Java program to find the second largest element in an array. 
		 *   18. Write a Java program to find the second smallest element in an array.
		 *  ***/
      int[]arr= {5,7,2,8,1,4,6};
         
       for(int i=0;i<arr.length;i++) {
    	  
    	   int max=arr[i];
    	   int Imax=0;
    	   for(int j=i+1;j<arr.length;j++) {
        	  if(max<arr[j]) {
        		  max=arr[j] ;
        		  Imax=j;
        	  }
           } 
    	   if(Imax==0) {
    	    
    	   }else {
    		   arr[Imax]=arr[i];
        	   arr[i]=max;
    	   }
    		 
       }
     	System.out.println("Array : "+Arrays.toString(arr));
     	System.out.println("second largest element in an array : "+arr[1]);
     	System.out.println("second smallest element in an array : "+arr[arr.length-2]);

	}

}
