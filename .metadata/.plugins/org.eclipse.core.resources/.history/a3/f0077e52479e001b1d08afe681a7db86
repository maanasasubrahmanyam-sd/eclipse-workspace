package com.home.test.top.ques;

public class GCDOfArray {

	public static void main(String[] args) {
		int a [] = new int[] {9, 27,54,81,108};
		
		int res = findGcd(a); 
		System.out.println(res);
		
	}

	private static int findGcd(int[] a) {
		int temp = a[0];
		for(int i =0; i< a.length; i++) {
			temp = gcd(temp, a[i]);
		}
		return temp;
	}

	private static int gcd(int temp, int i) {
		if(temp ==0) {
			return i;
		}
		if(i ==0) {
			return temp;
		}
		 return gcd(i, temp % i);
	}

}
