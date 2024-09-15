package dataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
	TreeNode root;
	
	BinaryTree(){
		root=null;
	}
	public boolean isEmpty() {
		if(root==null) {
			return true;
		}else {
		return false;
		}
	}
	 
	void insertBT(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            // Insert in level-order
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node.left == null) {
                    node.left = new TreeNode(value);
                    break;
                } else {
                    queue.add(node.left);
                }
                if (node.right == null) {
                    node.right = new TreeNode(value);
                    break;
                } else {
                    queue.add(node.right);
                }
            }
        }
    }
	void insertBST(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode temp, int value) {
        if (temp == null) {
            temp = new TreeNode(value);
            return temp;
        }

        if (value < temp.value) {
            temp.left = insertRec(temp.left, value);
        } else if (value > temp.value) {
            temp.right = insertRec(temp.right, value);
        }

        return temp;
    }
    
    
	private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
	private void preorderRec(TreeNode root) {
        if (root != null) {
        	System.out.print(root.value + " ");
        	preorderRec(root.left);
        	preorderRec(root.right);
        }
    }
	private void postorderRec(TreeNode root) {
        if (root != null) { 
        	postorderRec(root.left);
        	postorderRec(root.right);
        	System.out.print(root.value + " ");
        }
    }
	public void preOrder() {
		preorderRec(root);
		System.out.println();
	}
	public void inOrder() {
		inorderRec(root);
		System.out.println();
	}
	public void postOrder() {
		postorderRec(root);
		System.out.println();
	}
	 

}