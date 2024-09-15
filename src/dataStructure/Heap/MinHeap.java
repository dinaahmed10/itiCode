package dataStructure.Heap;

public class MinHeap {
	  private int[] heap;
	    private int size;
	    private int capacity;

	    // Constructor
	    public MinHeap(int capacity) {
	        this.capacity = capacity;
	        this.size = 0;
	        heap = new int[capacity];
	    }

	     
	    private int parent(int index) {
	        return (index - 1) / 2;
	    }

	    
	    private int leftChild(int index) {
	        return 2 * index + 1;
	    }

 
	    private int rightChild(int index) {
	        return 2 * index + 2;
	    }

	    
	    public void insert(int value) {
	        if (size == capacity) {
	            throw new IllegalStateException("Heap is full");
	        }
	        
	       
	        heap[size] = value;
	        size++;
	        
	         
	        int index = size - 1;
	        while (index > 0 && heap[parent(index)] > heap[index]) {
	            // Swap the elements
	            int temp = heap[index];
	            heap[index] = heap[parent(index)];
	            heap[parent(index)] = temp;
	            
	            index = parent(index);
	        }
	    }

	    // Method to get the minimum element (root of the heap)
	    public int getMin() {
	        if (size == 0) {
	            throw new IllegalStateException("Heap is empty");
	        }
	        return heap[0];
	    }
	    public int extractMin() {
	        if (size == 0) {
	            throw new IllegalStateException("Heap is empty");
	        }
	        
	        int min = heap[0];
	        heap[0] = heap[size - 1];
	        size--;
	        remove(0);
	        
	        return min;
	    }
	    private void remove(int index) {
	        int smallest = index;
	        int left = leftChild(index);
	        int right = rightChild(index);

	        if (left < size && heap[left] < heap[smallest]) {
	            smallest = left;
	        }
	        
	        if (right < size && heap[right] < heap[smallest]) {
	            smallest = right;
	        }
	        
	        if (smallest != index) {
	            // Swap the elements
	            int temp = heap[index];
	            heap[index] = heap[smallest];
	            heap[smallest] = temp;
	            
	            // Recursively heapify the affected subtree
	            remove(smallest);
	        }
	    }
	    public void printHeap() {
	        for (int i = 0; i < size; i++) {
	            System.out.print(heap[i] + " ");
	        }
	      
	    }

}
