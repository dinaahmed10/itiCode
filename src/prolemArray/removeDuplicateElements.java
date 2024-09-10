package prolemArray;

import java.util.Arrays;

public class removeDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*16. Write a Java program to remove duplicate elements from an array.*/
		int [] arr= {4,2,6,7,4,5,2,3,6};
		int[]arrWithoutDuplication=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(containsItem(arrWithoutDuplication,arr[i])==false){
				arrWithoutDuplication[index++]=arr[i];
			}
		}
		System.out.println("Array : "+Arrays.toString(arr));
		System.out.println("Array : "+Arrays.toString(arrWithoutDuplication));
	}
	public static boolean containsItem(int[]arr,int x){
		for(int i=0;i<arr.length;i++){
			if(x==arr[i]) {
				return true;
			}
		}  
			return false; 
	}

}
