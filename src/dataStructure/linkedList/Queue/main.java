package dataStructure.linkedList.Queue;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueLinkedList queue =new queueLinkedList();
		queue.enQueue(4);
		queue.enQueue(6);
		queue.enQueue(2);
		queue.enQueue(7);
		queue.enQueue(3);
		queue.enQueue(8);
		queue.enQueue(5);
		queue.display();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.display();
		System.out.println("frist element : "+queue.Peek()) ;
		System.out.println("last element : "+queue.lastElement()) ;
	}
	

}
