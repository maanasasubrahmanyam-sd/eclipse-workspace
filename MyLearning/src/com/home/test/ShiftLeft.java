package com.home.test;

public class ShiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
		//shiftLeft([1, 2]) → [2, 1]
		//shiftLeft([1]) → [1]
		int a[] = new int[] { 1, 2,3};
		
		shiftLeft(a);
	}
	
	public static int[] shiftLeft(int[] nums) {
		for(int i = nums.length; i <= 0 ; i --) {
			nums[i -1] = nums[i];
		}
		
		for(int j = 0 ; j < nums.length-1; j ++) {
			System.out.println(nums[j]);
		}
		return nums;
		  
	}


}
