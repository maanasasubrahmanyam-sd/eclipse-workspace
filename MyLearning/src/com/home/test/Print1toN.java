package com.home.test;

public class Print1toN {

	public static void main(String[] args) {

		print(7);
		System.out.println("done");
		printRev(7);
	}

	private static void printRev(int n) {

		if(n == 1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printRev(n-1);
	}

	private static void print(int n) {

		if(n == 1) {
			System.out.println(n);
			return;
		}
		print(n-1);
		System.out.println(n);
		
	}

}
