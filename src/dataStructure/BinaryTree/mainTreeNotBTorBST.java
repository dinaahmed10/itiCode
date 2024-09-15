package dataStructure.BinaryTree;

public class mainTreeNotBTorBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNotBTorBST root=new TreeNotBTorBST(3);
		TreeNotBTorBST child1=new TreeNotBTorBST(7);
		TreeNotBTorBST child2=new TreeNotBTorBST(6);
		TreeNotBTorBST child3=new TreeNotBTorBST(4);
		 root.addChild(child1);
	      root.addChild(child2);
	      root.addChild(child3);
	      
	      TreeNotBTorBST childd1 = new TreeNotBTorBST(2);
	      TreeNotBTorBST childd2 = new TreeNotBTorBST(2);
	        child1.addChild(childd1);
	        child1.addChild(childd2);
	        root.printTree(root, 0);
	}

}
