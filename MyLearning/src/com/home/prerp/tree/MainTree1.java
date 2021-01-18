package com.home.prerp.tree;


public class MainTree1 {

	public static void main(String[] args) {

		Tree1 tree = new Tree1();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
	
		tree.inOrder();
		
		
		boolean val = tree.ifNodeExists(90);
		System.out.println(val);
		
		int height = tree.heightOfNode();
		System.out.println(height);
		
		int allNodesum = tree.allNode();
		System.out.println(allNodesum);
		
		
	}

}
