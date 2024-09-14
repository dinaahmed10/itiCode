package dataStructure.linkedList.Stack;

 class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class stackLinkedList {
	private Node top;
	  private int size=0;
	
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}else {
		return false;
		}
	}
	
	public void Push(int date) {
	 Node node=new Node(date);
	 if(isEmpty()) {
		top=node; 
	 }else {
		 node.next=top;
		 top=node;
	 }
	 size+=1;
		}
	public int Pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			int x=top.data;
			top=top.next;
			size-=1;
			return x;
		} 
	}
	
	public void display() {
		Node iStack=top;
		 while(iStack!=null) {
			 System.out.println(iStack.data);
			 iStack=iStack.next;
		 }
	}

	public int fristElement() {
		Node iStack=top;
		 while(iStack.next!=null) { 
			 iStack=iStack.next;
		 }
		return iStack.data;
		
	}
	
	public int lastElement() {
		return top.data;
		
	}

}
