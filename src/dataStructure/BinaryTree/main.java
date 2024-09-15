package dataStructure.BinaryTree;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {4,6,9,3,2,7};
		 BinaryTree binaryTree = new BinaryTree();
	        
	        // Insert nodes
	        binaryTree.insertBT(1);
	        binaryTree.insertBT(2);
	        binaryTree.insertBT(3);
	        binaryTree.insertBT(4);
	        binaryTree.insertBT(5);
	        binaryTree.insertBT(6);
	        binaryTree.insertBT(7);
	        
	        // Display in-order traversal
	        System.out.println("In-order traversal of the binary tree:");
	        binaryTree.inOrder();
			 
			
		 BinaryTree tree = new BinaryTree();

	        // Inserting nodes into the tree
	        tree.insertBST(50);
	        tree.insertBST(30);
	        tree.insertBST(20);
	        tree.insertBST(10);
	        tree.insertBST(40);
	        tree.insertBST(70);
	        tree.insertBST(60);
	        tree.insertBST(80);
	        tree.inOrder(); 
			tree.postOrder(); 
			tree.preOrder();
			
	}

}
