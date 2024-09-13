package dataStructure.Queue;

public class simpleQueue {
	int[]arr;
	int front ;
	int size;
	int rear;
	
	simpleQueue(int size){
		arr=new int[size];
		this.front=0;
		this.rear=-1;
		this.size=size;
	}
	public boolean isFull() {
		if(rear==size-1) {
			return true;
		}else {
		return false;
		}
	}
	
	public boolean isEmpty() {
		if(front==size||(front==0&&rear==-1)) {
			return true;
		}else {
		return false;
		}
	}
	
	public void enQueue(int x) {
		if(!isFull()) {
		rear++;
		arr[rear]=x;
		}else {
			System.out.println("Queue is full ,overflow");
		}
	}
	
	public int deQueue() {
		if(!isEmpty()) {
		int x=arr[front];
		front++;
		return x;
		}else {
			
			System.out.println("Queue is Empty ,underflow");
			return -1;
		}
		
	}
	public int Peek() {
		return arr[front];
	}
	public void display() {
		if(!isEmpty()) {
		for(int i=front;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
		else {
			System.out.println("Queue is Empty : ");
		}
	
}
}