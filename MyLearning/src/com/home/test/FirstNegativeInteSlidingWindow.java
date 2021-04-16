package com.home.test;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInteSlidingWindow {

	public static void main(String[] args) {

		int[] nums = new int[] {0,-1,4,2,4,-2};
		int size = 3;
		
		List<Integer> result = firstNegativeInt(nums, size);
		System.out.println(result.toString());
	}

	private static List<Integer> firstNegativeInt(int[] nums, int size) {
		int i =0;
		int j =0;
		List<Integer>  res = new ArrayList<>();
		while(j < nums.length) {
			if(j - i + 1 < size) {
				j++;
				if(nums[j] < 0) {
					res.add(nums[j]);
				}
				if(nums[i] <0) {
					res.add(nums[i]);
				}
			}else if (j-i +1 == size) {
				if(nums[j] < 0) {
					res.add(nums[j]);
				}
				if(nums[i] <0) {
					res.add(nums[i]);
				}
				if(!res.isEmpty()) {
					System.out.println("first -ve in window is " +res.get(0));
					res.clear();
				}
				else {
					System.out.println(0);
				}
				i++;
				j++;			
			}
		}
		return res;	
	}
}
