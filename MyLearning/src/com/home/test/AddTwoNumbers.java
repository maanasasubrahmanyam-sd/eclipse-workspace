package com.home.test;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int [] {2,3,4,6};
		int target = 7;
		int [] result = sum(num, target);
		for(int i =0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public static int[] sum(int [] num, int target ) {	
		for(int i =0; i<num.length; i++) {
			for(int j = i +1; j < num.length; j++) {
				if(num[i] + num[j] == target) {
	                return new int[] { i, j };

				}
			}
		}
	    throw new IllegalArgumentException("No two sum solution");

	}
	
	
	

}
