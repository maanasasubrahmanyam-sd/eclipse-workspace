package com.home.prerp.string;

public class ClimbingStairs {

	public static void main(String[] args) {

	   int res = type(7);
	   System.out.println(res);
		
	}


	public static int type(int n) {
		int sum = 0;
		int next = 0;
		int pre = 1;
		
		for(int i =0; i <= n ; i++) {
			sum = pre + next;
			pre = next;
			next = sum;
		}
		return sum;
	}
	
}
