package com.home.test.array;

import java.util.Arrays;

public class SquareOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = new int[] {6,7,8,10};
		int[]  value = findSquare(nums);
		for(int i =0; i < value.length; i++) {
			System.out.println(value[i]);
		}
	}

	private static int[] findSquare(int[] nums) {
		int res [] = new int [nums.length];
		for(int i =0; i < nums.length; i++) {
			int val = Math.abs(nums[i]);
			res[i] = (val * val);
		}
		Arrays.sort(res);
		return res;
	}

}
