package com.home.prerp.string;

public class MaxSubArraySlidingWindow {

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 3, 4, 1, 2 };

		// find max value of sub array of size 3 
		int size = 5;
		int result = findMax(nums, size );
		System.out.println(result);
	}

	private static int findMax(int[] nums, int size) {
		int start = 0;
		int end = 0; 
		int sum =0;
		int max = Integer.MIN_VALUE;
		
		// formula is end-start +1 = window size 
		
		while(end < nums.length) {		
			sum = sum + nums[end];
			
			if( end - start + 1 < size ) {
				end ++;
			}else if (end - start + 1 == size){
				max = Math.max(sum, max);
				end ++;
				start ++;
				sum = sum - nums[start];			
			}	
		}		
		return max;
	}
}
