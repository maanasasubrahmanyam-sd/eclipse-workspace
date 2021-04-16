package com.home.prerp.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree1 {

	private TreeNode1 root;
	
	public void insert(int value) {
	
		if(root == null) {
			root = new TreeNode1(value);
		}else {
			root.insert(value);
		}
		
	}
	
	public void levelOreder(TreeNode1 root) {

		if(root == null) {
			return ;
		}else {
			root.inOrder();
		}
	}
	
	public Tree1 inOrder( ) { 
		if(root == null) {
			root.inOrder();
		}else {
			root.inOrder();
		}
		return null;
	}

	public boolean ifNodeExists(int key) {

		if(root == null) {
			return false;
		}else {
			return root.ifNodeExists(root, key);
		}
	}
	
	public int heightOfNode() {
		if(root == null) {
			return 0;
		}else {
			return root.heightOfNode(root);
		}
	}
	
	public int allNode() {
		if(root == null) {
			return 0;
		}else {
			return root.allNode(root);
		}
	}
	
	public void serialization( List<Integer> i) {
		 root.serialization(root, i);
	}
	
}
