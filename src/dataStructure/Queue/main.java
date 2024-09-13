package dataStructure.Queue;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleQueue simpleQueue=new simpleQueue(5);
		simpleQueue.enQueue(5);
		simpleQueue.enQueue(15);
		simpleQueue.enQueue(35);
		simpleQueue.enQueue(55);
		simpleQueue.enQueue(57);
		simpleQueue.display();
		simpleQueue.enQueue(57); 
		System.out.println("frist element : "+simpleQueue.Peek());
		System.out.println("Pop : "+simpleQueue.deQueue());
		System.out.println("Pop : "+simpleQueue.deQueue());
		System.out.println("Pop : "+simpleQueue.deQueue());
		 simpleQueue.display();
		 simpleQueue.deQueue();
		 simpleQueue.deQueue();
		 simpleQueue.display();
		 simpleQueue.enQueue(57);
		 
		 System.out.println("////////////////////////////////////////////////////////////////////"); 
		 circularQueue circularQueue=new circularQueue(5); 
		 circularQueue.enQueue(8);
		 circularQueue.enQueue(6);
		 circularQueue.enQueue(3);
		 circularQueue.enQueue(5);
		 circularQueue.enQueue(7);
		 circularQueue.display();
		 System.out.println("frist element : "+circularQueue.Peek());
		 System.out.println("\n//////////////////");
		 circularQueue.enQueue(7);
		 System.out.println("dequeue : "+circularQueue.deQueue());
		 circularQueue.display();
		 circularQueue.enQueue(1);
		 System.out.println("////////////////////////////////////////////////////////////////////"); 
		 circularQueue.display();
		 System.out.println("frist element : "+circularQueue.Peek());
		
		
	}

}
