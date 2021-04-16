package com.home.test;

public class Tree {

	private TreeNode root;
	
	public void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		}else {
			root.insert(value);
		}
	}
	
	public void travesalInOrder() {
		if(root != null) {
			root.travesalInOrder();
		}
	}
	
	public void traversalPreOrder() { 
		if( root != null) {
			root.traversalPreOrder();
		}
	}
	
	public void traversalPostOrder() { 
		if( root != null) {
			root.traversalPostOrder();
		}
	}
	
	public TreeNode get(int value) {
		if( root != null) {
			return root.get(value);
		}

		return null;
	}
	
	public int minValue() {
		if(root == null) {
			return Integer.MIN_VALUE;
		}else {
			return root.minValue();
		}
	}
	
	public int maxValue() {
		if(root == null) {
			return Integer.MAX_VALUE;
		}else {
			return root.maxValue();
		}
	}
}
