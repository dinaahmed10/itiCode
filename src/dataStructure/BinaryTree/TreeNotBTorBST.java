package dataStructure.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeNotBTorBST {
	 int value;
	  List<TreeNotBTorBST> children;
	  
	  public TreeNotBTorBST(int value) {
	        this.value = value;
	        this.children = new ArrayList<>();
	    }
	  public List<TreeNotBTorBST> getChildren() {
	        return children;
	    }

	    public void addChild(TreeNotBTorBST child) {
	        this.children.add(child);
	    }
	    
	    public static void printTree(TreeNotBTorBST node, int level) {
	        // Print the current node value with indentation based on the level
	        for (int i = 0; i < level; i++) {
	            System.out.print("  ");
	        }
	        System.out.println(node);

	        // Recursively print each child node
	        for (TreeNotBTorBST child : node.children) {
	            printTree(child, level + 1);
	        }
	    }
}
