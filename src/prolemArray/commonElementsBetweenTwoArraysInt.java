package prolemArray;

public class commonElementsBetweenTwoArraysInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 15. Write a Java program to find common elements between two integer arrays. **/
		int [] arr1= {4,3,6,2,8,1,9};
		int [] arr2= {9,5,1,4,3,10,2,8};
		int []arr=new int[arr1.length];
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			for(int y=0;y<arr2.length;y++) {
				if(arr1[i]==(arr2[y])) { 
					arr[index]=arr1[i];
					index++;
				}
			}
		}
 
		for(int i=0;i<arr.length && arr[i]!=0;i++){
			System.out.println("Duplicate Element : "+arr[i]);
		}

		
	}

}
