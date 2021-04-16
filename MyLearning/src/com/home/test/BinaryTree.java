package com.home.test;

public class BinaryTree {

	private TreeNode root;

	private class TreeNode {
		private char data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(char data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {

		TreeNode a = new TreeNode('a');
		TreeNode b = new TreeNode('b');
		TreeNode c = new TreeNode('c');
		TreeNode d = new TreeNode('d');
		TreeNode e = new TreeNode('e');
		TreeNode f = new TreeNode('f');
		TreeNode g = new TreeNode('g');
		TreeNode h = new TreeNode('h');
		TreeNode i = new TreeNode('i');
		TreeNode j = new TreeNode('j');

		root = a;
		a.left = b;
		a.right = c;

		b.left = d;
		b.right = e;
		
		c.left = f;
		c.right = g;

		d.left = j;
		e.left = i;

		f.left = h;

	}

	private void inOrderTraversal(TreeNode node) { // left- root - right

		if (node == null) {
			return;
		}

		inOrderTraversal(node.left);
		System.out.println(" inOrderTraversal root.data is " + node.data);
		inOrderTraversal(node.right);

	}

	private void preOrderTraversal(TreeNode node) { // root- left - right
		if(node == null) {
			return ;
		}
		System.out.println(" preOrderTraversal root.data is " + node.data);
		preOrderTraversal(node.left);		
		preOrderTraversal(node.right);		
	}
	
	private void postOrderTraversal(TreeNode node) { //  left - right - root
		if(node == null) {
			return ;
		}
		postOrderTraversal(node.left);		
		postOrderTraversal(node.right);	
		System.out.println("postOrderTraversal root.data is " + node.data);

	}
	
	
	public static void main(String[] args) {

		BinaryTree node = new BinaryTree();

		node.createBinaryTree();
		node.inOrderTraversal(node.root);
		System.out.println();
		node.preOrderTraversal(node.root);
		System.out.println();
		node.postOrderTraversal(node.root);
	}

}
