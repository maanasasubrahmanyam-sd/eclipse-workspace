package com.home.test;

import java.util.ArrayList;
import java.util.List;

public class DupliacateZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
		DuplicateZeros(nums);

	}

	private static void  DuplicateZeros(int[] nums) {
		for(int i =0 ; i< nums.length; i++) {
			if(nums[i]== 0) {
				for(int j =nums.length- 2; j >= i; j--) {
					nums[j + 1]= nums[j];
					System.out.println("value is " + nums[i]);
				}
				i++;
			}
		}
		
		for(int i =0 ; i< nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	/*
	 * private static int[] DuplicateZeros(int[] nums) { List<Integer> index = new
	 * ArrayList<>(); int res[] = new int[nums.length]; for (int i = 0; i <
	 * nums.length; i++) { res[i] = nums[i]; } for (int i = 0; i < nums.length; i++)
	 * { if (nums[i] == 0) { index.add(i); } } for (int i : index) {
	 * System.out.println("found 0 at:" + i); } int size = index.size();
	 * 
	 * for (int j = res.length - 2; j >= index.get(0); j--) { // res[j + 1] =
	 * res[j]; }
	 * 
	 * for (int i = 0; i < res.length; i++) { System.out.println(res[i]); }
	 * 
	 * 
	 * 
	 * for (int i = 6; i >= 1; i--) { res[i + 1] = res[i]; } res[index.get(0) + 1] =
	 * 0; for (int i = 0; i < res.length; i++) { System.out.println(res[i]); }
	 * System.out.println("new");
	 * 
	 * for (int i = 6; i >= 4; i--) { res[i + 1] = res[i]; } res[5] = 0; for (int i
	 * = 0; i < res.length; i++) { System.out.println(res[i]); }
	 * 
	 * 
	 * return null; }
	 */

}
