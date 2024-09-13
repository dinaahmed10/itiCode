package dataStructure.Queue;

public class circularQueue {
	int[]arr;
	int front;
	int capacity ;
	int size;
	int rear;
	circularQueue(int capacity){
		arr=new int[capacity];
		this.capacity=capacity;
		this.front=0;
		this.rear=-1;
		this.size=0;
	}
	public boolean isFull() {
		if(size==capacity) {
			return true;
		}else {
		return false;
		}
	}
	
	public boolean isEmpty() {
		if( size==0) {
			return true;
		}else {
		return false;
		}
	}
	
	public void enQueue(int x) {
		if(!isFull()) {
		rear=(rear+1)%capacity;
		arr[rear]=x;
		size++;
		}else {
			System.out.println("Queue is full ,overflow");
		}
	}
	
	public int deQueue() {
		if(!isEmpty()) {
		int x=arr[front];
		front=(front+1)%capacity;
		size--;
		return x;
		}else { 
			System.out.println("Queue is Empty ,underflow");
			return -1;
		}
		
	}
	public void display() {
		if(!isEmpty()) {
			for (int i = 0; i < size; i++) {
	            System.out.println(arr[(front + i) % capacity] + " ");
	        }
	} else {
			System.out.println("Queue is Empty : ");
		}
	
}
	public int Peek() {
		return arr[front];
	}
}
