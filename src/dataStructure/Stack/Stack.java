package dataStructure.Stack;

public class Stack {
	int []arr;
	int top;
	int size;
	
	Stack(int size){
		this.arr=new int[size];
		this.size=size;
		this.top=-1;
	}
	
	public boolean isFull() {
		if(top==size-1) {
			return true;
		}else {
		return false;
		}
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
		return false;
		}
	}
	public int Pop() {
		if(!isEmpty()) {
			int x=arr[top];
			top--;
			return x;
		}else {
			System.out.println("Stack is Empty");
			return -1;
		}
		 
		
	}
	public void Push(int num) {
		if(!isFull()) {
		top++;
		arr[top]=num;
	}else {
		System.out.println("Stack is full");
	}
		}
	
	public void printStack() {
		for(int i=top;i!=-1;i--) {
			System.out.println(arr[i]);
		}
	}
	
	public int lastElement() {
		return arr[top];
		
	}
	
	public int fristElement() {
		return arr[0];
		
	}
	public int minElement(){
		int min=arr[top];
		for(int i=top;i>=0;i--) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	
	public int maxElement(){
		int max=arr[top];
		for(int i=top;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public int countOddElement() {
		int countOdd=0;
		for(int i=top;i>=0;i--) {
			if(arr[i]%2!=0) {
				countOdd++;
			}
		}
		return countOdd;
		
	}
	public int countEvenElement() {
		int countEven=0;
		for(int i=top;i>=0;i--) {
			if(arr[i]%2==0) {
				countEven++;
			}
		}
		return countEven;
		
	}
	public int totalOddElement() {
		int totalOdd=0;
		for(int i=top;i>=0;i--) {
			if(arr[i]%2!=0) {
				totalOdd+=arr[i];
			}
		}
		return totalOdd;
		
	}
	public int totalEvenElement() {
		int totalEven=0;
		for(int i=top;i>=0;i--) {
			if(arr[i]%2==0) {
				totalEven+=arr[i];
			}
		}
		return totalEven;
		
	}
	 public int totalElement() {
		 int total=0;
		 for(int i=top;i>=0;i--) {
				 
			 total+=arr[i];
				
			}
		return total;
		 
	 }
	
	

}
