package com.home.prerp.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode1 {

	private int data; 
	private TreeNode1 leftChild;
	private TreeNode1 rightChild;
	
	public void insert(int value) {
		if(value == data) {
			return;
		}
		
		if( value < data) {
			if(leftChild == null) {
				leftChild = new TreeNode1(value);
			}else {
				leftChild.insert(value);
			}
		}
		
		if(value > data) {
			if(rightChild == null) {
				rightChild = new TreeNode1(value);
			}else {
				rightChild.insert(value);
			}
		}	
	}
	
	public void inOrder() { // left - root - right
		if(leftChild != null) {
			leftChild.inOrder();
		}
		System.out.println("data is :" +data);
		if(rightChild != null) {
			rightChild.inOrder();
		}
	}
	
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
    	helperInOrder(root, res);
		return res;

    }
	
	
	private void helperInOrder(TreeNode root, List<Integer> res) {
		if(root != null) {
			if(leftChild != null) {
				leftChild.helperInOrder(root, res);
			}
			res.add(data);
			if(rightChild != null) {
				rightChild.helperInOrder(root, res);
			}	
		}		
	}
	
    public List<Integer> preorderTraversal(TreeNode root) { // root-left-right
    	List<Integer> res = new ArrayList<>();
    	helperPreOrdr(res, root);
    	return res;
    }


	private void helperPreOrdr(List<Integer> res, TreeNode root) {
		if(root != null) {
			res.add(data);
			if(leftChild != null) {
				leftChild.helperPreOrdr(res, root);
			}
			if(rightChild != null) {
				rightChild.helperPreOrdr(res, root);
			}		
		}
	}
	
    public List<Integer> postorderTraversal(TreeNode root) { // left-right-root
    	List<Integer> res = new ArrayList<>();
    	helperPostorderTraversal(res, root);
    	return res;
    }


	private void helperPostorderTraversal(List<Integer> res, TreeNode root) {
		if(root != null) {
			if(leftChild != null) {
				leftChild.helperPostorderTraversal(res, root);
			}if(rightChild != null) {
				rightChild.helperPostorderTraversal(res, root);
			}
			res.add(data);
		}
	}
	
	// check if given node exist
	public boolean ifNodeExists( TreeNode1 node, int key) {
		if(node == null) {
			return false;
		}if (key == data) {
			return true;
		}
		boolean left = ifNodeExists(node.leftChild, key);
		
		if(left) {
			return true;
		}
		
		boolean right = ifNodeExists(node.rightChild, key);
		return right;
	}

	//find height of tree 
	public int heightOfNode(TreeNode1 node) {
		if(node == null) {
			return -1;
		}
		int leftHeight = heightOfNode(node.leftChild);
		int rightHeight = heightOfNode(node.rightChild);
		
		if(leftHeight > rightHeight) {
			return leftHeight + 1;
		}else {
			return rightHeight + 1;
		}
	}
	
	// count all nodes
	public int allNode(TreeNode1 node) {
		if(node == null) {
			return 0;
		}
		
		return 1 + allNode(node.leftChild) + allNode(node.rightChild);
	}

	public TreeNode1(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}


	public TreeNode1 getLeftChild() {
		return leftChild;
	}


	public void setLeftChild(TreeNode1 leftChild) {
		this.leftChild = leftChild;
	}


	public TreeNode1 getRightChild() {
		return rightChild;
	}


	public void setRightChild(TreeNode1 rightChild) {
		this.rightChild = rightChild;
	}
	
}
