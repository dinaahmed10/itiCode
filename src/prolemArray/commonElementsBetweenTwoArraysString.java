package prolemArray;

public class commonElementsBetweenTwoArraysString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**14. Write a Java program to find common elements between two arrays (string values).
		 * **/
String[] arr1= {"ahmed","ali","dina","samaa","omnia"};
String[] arr2= {"mohamed","dina","donia","ali","mary"};
String[] arr=new String[arr1.length];
int index=0;

for(int i=0;i<arr1.length;i++) {
	for(int y=0;y<arr2.length;y++) {
		if(arr1[i].equals(arr2[y])) {
			arr[index]=arr1[i];
			index++;
		}
	}
}

for(int i=0;i<arr.length && arr[i]!=null;i++){
	System.out.println("Duplicate Element : "+arr[i]);
}


	}

}
