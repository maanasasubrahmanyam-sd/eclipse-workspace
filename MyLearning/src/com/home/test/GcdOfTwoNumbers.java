package com.home.test;

public class GcdOfTwoNumbers {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		int gcd = 1;
		
		for(int i =1 ; i<= a && i<= b ; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
        System.out.printf("GCD of %d and %d is: %d", a, b, gcd);

	}

}
