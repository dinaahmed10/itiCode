package dataStructure.Heap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap heapmax=new MaxHeap(5);
		heapmax.insert(5);
		heapmax.insert(3);
		heapmax.insert(4);
		heapmax.insert(6);
		heapmax.insert(2);
		heapmax.printHeap();
		heapmax.extractMax();
		heapmax.printHeap();
		 
		MinHeap heapmin =new MinHeap(5);
		heapmin.insert(5);
		heapmin.insert(3);
		heapmin.insert(4);
		heapmin.insert(6);
		heapmin.insert(2);
		heapmin.printHeap();
		heapmin.extractMin();
		heapmin.printHeap();
	}

}
