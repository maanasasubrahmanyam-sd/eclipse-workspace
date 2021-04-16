package com.home.test;

public class GCD {

	public static void main(String[] args) {

		int gcd = findGcd(36,60);
		System.out.println("Gcd is : " + gcd);
	}

	private static int findGcd(int a, int b) {
		if( a == 0) {
			return b;
		}
		if( b == 0) {
			return a;
		}
		return findGcd(b, a%b);
	}

}
