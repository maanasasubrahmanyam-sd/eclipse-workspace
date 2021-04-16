package com.home.test;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int i = 370;
		int n = i;
		int sum =0;
		int r = 0;
		
		while (n >0) {
			r = n % 10;
			n = n /10;
			sum = sum + r*r*r;
		}
		
		System.out.println(sum);
		if(sum == i) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not armstrong");
		}
	}

}
