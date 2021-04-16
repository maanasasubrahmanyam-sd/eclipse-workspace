package com.home.test;

import java.util.*;

public class MaxSubArraySecondApproach {

	public static void main(String[] args) {

		int[] nums = new int[] {-1,-9,3};
		
		int result = maxSubArray(nums);
		System.out.println(result);
	}

	private static int maxSubArray(int[] nums) {
		int j = 0;
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int i = 0;

	while (i < nums.length)
	{
		while (j < nums.length) 
		{
			sum = sum + nums[j];
			j++;
			maxSum = Math.max(maxSum, sum);
			
		}
		sum = 0;
		i++;
		j=i;
	}
	return maxSum;
	
}
	
}

	 
		
	
	 


