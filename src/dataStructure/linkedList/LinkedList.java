package dataStructure.linkedList;

public class LinkedList {
	  private Node heap;
	  private int size=0;
	   public void insertAtEnd(int data) {
		   
		   Node node=new Node(data);
		   node.data=data;
		   node.next=null;
		   if(heap ==null ){
		   this.heap=node;
		   }
		   else {
		   Node last=heap;
		   
		   while(last.next!=null) {
			   last=last.next;
		   }
		   last.next=node;
}
		   size++;
	   }
	   public void insertAtFrist(int data){
		   Node node=new Node(data);
		   node.data=data;
		   node.next=null;
		   if(heap ==null ){
			   this.heap=node;
			   }else {
				   node.next= heap;
				   heap=node;
			   }
		   size++;
	   }
	   
	   public void insertAtIndex(int data, int index) {
		   Node node=new Node(data);
		   node.data=data;
		   node.next=null;
		   if(index<=size) {
			   if(index==1) {
				   insertAtFrist(data);
			   }else {
			   Node indexNode=heap;
			   int count=1;
			   while(count<(index-1)) {
				   indexNode=indexNode.next;
				   count++;
			   }
			   node.next=indexNode.next;
			   indexNode.next=node; 
			   size++;
			   }
			   }else {
			   System.out.println("Out Of Size");
		   }
		   
	   }
	   public int deleteinindex(int index) {
		   if(index<=size) {
			   if(index==1) {
				 int x=  deleteinfrist();
				   return x;
			   }else {
		   Node indexNode=heap;
		   int count=1;
		   while(count<(index-1)) {
			   indexNode=indexNode.next;
			   count++;
		   }
		   int x=indexNode.next.data;
		   indexNode.next=indexNode.next.next;
		   size--;
		   return x;
	   }
			   }else {
		   System.out.println("Out Of Size");
		   return -1;
	   }
		 
	   }
	   public int deleteinfrist() {
		  int x=heap.data; 
		  heap=heap.next;
		  size--;
		  return x;
	   }
	   
	   public int deleteinlast() {
		  Node last=heap;
		  while(last.next!=null) {
			   last=last.next;
		   }
		  int x=last.data;
		  Node newLast=heap;
		  while(newLast.next!=last) {
			  newLast=newLast.next;
		   }
		  newLast.next=null;
		  size--;
		  return x;
	   }
	   public void display() {
	        Node print = heap;
	        while (print != null) {
	            System.out.println(print.data);
	            print = print.next;
	        }
	    }
	public Node getHeap() {
		return heap;
	}
	public void setHeap(Node heap) {
		this.heap = heap;
	}
	   
	   }
