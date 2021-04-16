package com.home.test;

import java.util.ArrayList;
import java.util.List;

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
		
		System.out.println("Inorder traversal");
		System.out.println(tree.inOrder());
		
		List<Integer> i = new ArrayList<>();
		tree.serialization(i);
		
		for(int value : i) {
			System.out.print(value);
			System.out.print(",");
		}
		
		String[]s = new String[]{"50","30","20","-1","-1","40","-1","-1","70","60","-1","-1","80","-1","-1"};
		
		//tree.deserailization(s);
		
		
	}

}
