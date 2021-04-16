package com.home.test;

public class MainTree {

	public static void main(String[] args) {

		Tree intTree = new Tree ();
		intTree.insert(15);
		intTree.insert(22);
		intTree.insert(4);
		intTree.insert(19);
		intTree.insert(20);
		intTree.insert(18);
		intTree.insert(3);
		
		intTree.travesalInOrder();
		System.out.println();
		intTree.traversalPreOrder();
		System.out.println();
		intTree.traversalPostOrder();
		
		System.out.println();
		System.out.println(intTree.get(999));
		System.out.println(intTree.get(15));
		
		System.out.println(intTree.minValue());
		System.out.println(intTree.maxValue());

	}

}
