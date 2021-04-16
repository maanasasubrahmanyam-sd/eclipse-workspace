package com.home.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
	
	public void levelOreder(TreeNode1 root) {
		
		if(root == null) {
			return;
		}
		Queue<TreeNode1> q = new LinkedList<TreeNode1>();
		q.add(root);
		while(!q.isEmpty()) {
			q.poll();
			System.out.println(root.data);
			
			if(root.leftChild != null) {
				q.add(root.leftChild);
			}
			if(root.rightChild != null) {
				q.add(root.rightChild);
			}
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
	
	public void serialization(TreeNode1 root, List<Integer> i) {
		if(root== null) {
			i.add(-1);
			return;
		}
		i.add(root.data);
		serialization(root.leftChild, i);
		serialization(root.rightChild, i);
		
	}
	/*
	 * static int index = 0;
	 * 
	 * public TreeNode1 deserializeUsingStaticCounter(String[] data) { if (index >
	 * data.length || data[index].equals("null")) { index++; return null; }
	 * 
	 * TreeNode1 node = new TreeNode1(Integer.parseInt(data[index++]));
	 * node.setLeftChild(deserializeUsingStaticCounter(data));
	 * node.setRightChild(deserializeUsingStaticCounter(data));
	 * 
	 * return node; }
	 */

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
