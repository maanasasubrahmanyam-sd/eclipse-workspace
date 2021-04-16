package com.home.test.array;

public class RemoveElement {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2,3};
		//int val = removeDuplicates(a);
		reverse3(a);
	}

	public static int removeDuplicates(int[] nums) {

		int length = nums.length;
		int j = 0;
		int[] temp = new int [nums.length];
		
		for(int i = 0; i< length -1 ; i++) {
			if(nums[i]!=nums[i+1]) {
				temp[j++] = nums[i];
			}
		}
		
		temp[j++] = nums[length -1	];
		
		for(int k =0 ; k < j; k ++) {
			System.out.println(temp[k]);
		}
		System.out.println(temp.length);
		return temp.length;
		
	}
	
	public static int[] reverse3(int[] nums) {
		int res [] = new int [nums.length];
		int len = nums.length;
		for(int i =0 ; i < nums.length; i++) {
			res[len -1] = nums[i];
			len = len -1;
		}
		
		for(int i =0 ; i < res.length; i++) {
			System.out.println(res[i]);
		}
		return res;
		
	}


}
