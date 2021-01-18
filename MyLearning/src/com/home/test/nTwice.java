package com.home.test;

public class nTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nTwice("Hello", 2) → "Helo"
		//nTwice("Chocolate", 3) → "Choate"
		//nTwice("Chocolate", 1) → "Ce"
		
		String str = "hello";
		int n = 2;
		
		System.out.println(str.substring(0, n));
		System.out.println(str.substring(str.length() - 2));
	}

}
