package com.home.test;

public class maxEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 1, 2,3};
		maxVal(a);
	}

	private static void maxVal(int[] nums) {
		if(nums[0] > nums[nums.length -1]){
			for(int i=0;i<nums.length ;i++) {
				nums[i] = nums[0];
			}
		}else {
			for(int i=0;i<nums.length -1;i++) {
				nums[i] = nums[nums.length-1];
			}
			
		}
	}

}
