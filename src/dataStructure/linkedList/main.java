package dataStructure.linkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 
	  LinkedList LinkedList2=new LinkedList(); 
		 LinkedList2.insertAtEnd(4); 
		 LinkedList2.insertAtEnd(5);
		 LinkedList2.insertAtFrist(13);
		 LinkedList2.insertAtEnd(6);
		 LinkedList2.insertAtEnd(7);
		 LinkedList2.insertAtFrist(1);
		 LinkedList2.display();
	  
	 
	  System.out.println("/////////////////////////////");
		 LinkedList LinkedList3=new LinkedList();
		 LinkedList3.insertAtEnd(2);
		 LinkedList3.insertAtEnd(5);
		 LinkedList3.insertAtEnd(7);
		 LinkedList3.deleteinfrist();
		 LinkedList3.insertAtEnd(4);
		 LinkedList3.insertAtIndex(4, 1);
		 LinkedList3.insertAtIndex(6, 2);
		 LinkedList3.deleteinfrist();
		 LinkedList3.insertAtIndex(8, 3);
		 LinkedList3.insertAtIndex(3, 1);
		 LinkedList3.deleteinlast();
		 LinkedList3.deleteinlast();
		 LinkedList3.insertAtFrist(12);
		 LinkedList3.insertAtEnd(15);
		 LinkedList3.deleteinindex(2);
		 LinkedList3.display();
}
}
