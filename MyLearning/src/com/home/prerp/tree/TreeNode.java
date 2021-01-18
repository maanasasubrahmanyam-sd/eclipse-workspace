package com.home.prerp.tree;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if(value == data) {
			return;
		}
		
		if( value < data) {
			if(leftChild == null) {
				leftChild = new TreeNode(value);
			}else {
				leftChild.insert(value);
			}
		}
		
		if(value > data) {
			if(rightChild == null) {
				rightChild = new TreeNode(value);
			}else {
				rightChild.insert(value);
			}
		}
		
	}
	
	public int minValue() {
		if(leftChild == null) {
			return data;
		}else {
			return leftChild.minValue();
		}
	}
	
	public int maxValue() {
		if(rightChild == null) {
			return data;
		}else {
			return rightChild.maxValue();
		}
	}
	
	public void travesalInOrder() { // left - root - right
		if(leftChild != null) {
			leftChild.travesalInOrder();
		}
		System.out.print(data + " ,");
		if(rightChild != null) {
			rightChild.travesalInOrder();
		}
	}
	
	public void traversalPreOrder() { // root - left -right
		System.out.print(data +",");
		if(leftChild != null) {
			leftChild.traversalPreOrder();
		}
		if(rightChild != null) {
			rightChild.traversalPreOrder();
		}	
	}
	
	public void traversalPostOrder() { // left - right - root
		if(leftChild != null) {
			leftChild.traversalPostOrder();
		}
		if(rightChild != null) {
			rightChild.traversalPostOrder();
		}	
		System.out.print(data +",");
	}
	
	public TreeNode get(int value) {
		if(value == data) {
			return this;
		}
		
		if(value < data) {
			if(leftChild != null) {
				return leftChild.get(value);
			}
		}
		else {
			if(rightChild != null) {
				return rightChild.get(value);
			}
		}
		return null;
	}
	
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}


	
	
	

}
