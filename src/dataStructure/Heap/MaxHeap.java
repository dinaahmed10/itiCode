package dataStructure.Heap;

public class MaxHeap {
	  private int[] heap;
	    private int size;
	    private int capacity;

	    // Constructor
	    public MaxHeap(int capacity) {
	        this.capacity = capacity;
	        this.size = 0;
	        heap = new int[capacity];
	    }
	    // Method to get the index of the parent
	    private int parent(int index) {
	        return (index - 1) / 2;
	    }

	    // Method to get the index of the left child
	    private int leftChild(int index) {
	        return 2 * index + 1;
	    }

	    // Method to get the index of the right child
	    private int rightChild(int index) {
	        return 2 * index + 2;
	    }
	    

	    public void insert(int value) {
	        if (size == capacity) {
	            throw new IllegalStateException("Heap is full");
	        }
	        
	        // Insert the new element at the end
	        heap[size] = value;
	        size++;
	        
	        // Heapify-up
	        int index = size - 1;
	        while (index > 0 && heap[parent(index)] < heap[index]) {
	            // Swap the elements
	            int temp = heap[index];
	            heap[index] = heap[parent(index)];
	            heap[parent(index)] = temp;
	            
	            index = parent(index);
	        }
	    }

	    // Method to get the maximum element (root of the heap)
	    public int getMax() {
	        if (size == 0) {
	            throw new IllegalStateException("Heap is empty");
	        }
	        return heap[0];
	    } public int extractMax() {
	        if (size == 0) {
	            throw new IllegalStateException("Heap is empty");
	        }
	        
	        int max = heap[0];
	        heap[0] = heap[size - 1];
	        size--;
	        heapify(0);
	        
	        return max;
	    }

	    // Method to heapify a subtree rooted at index
	    private void heapify(int index) {
	        int largest = index;
	        int left = leftChild(index);
	        int right = rightChild(index);

	        if (left < size && heap[left] > heap[largest]) {
	            largest = left;
	        }
	        
	        if (right < size && heap[right] > heap[largest]) {
	            largest = right;
	        }
	        
	        if (largest != index) {
	            // Swap the elements
	            int temp = heap[index];
	            heap[index] = heap[largest];
	            heap[largest] = temp;
	            
	            heapify(largest);
	        }
	    }
	    public void printHeap() {
	        for (int i = 0; i < size; i++) {
	            System.out.print(heap[i] + " ");
	        }
	        System.out.println();
	    }

}
