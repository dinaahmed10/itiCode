package dataStructure.linkedList.Queue;

class Node {
    int data;
    Node next;
 

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
         
    }
}

public class queueLinkedList {
	private Node rear;
	private Node front;
	private int size;
	
	queueLinkedList(){
		this.front=null;
		this.rear=null;
		this.size=0;
	}
	public boolean isEmpty() {
		if(rear==null) {
			return true;
		}else {
		return false;
		}
	}
	
	public void enQueue(int date) {
		size++;
		Node node=new Node(date);
		if(isEmpty()) {
			rear=node;
			front=node;
		}else {
			rear.next=node;
			rear=node;
		}
		 
		 
	}
	
	public int deQueue() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return-1;
		}else {
			size--;
			int x=front.data;
			front =front.next;
			return x;
		}
	}
	
	
	public int Peek() {
		return front.data;
	}
	public int lastElement() {
		return rear.data;
	}
	public void display() {
		Node idisplay=front;
		while(idisplay!=null) {
			System.out.println(idisplay.data);
			idisplay=idisplay.next;
		}
	}
}
