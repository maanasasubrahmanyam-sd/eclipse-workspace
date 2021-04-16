package com.home.prerp.string;



public class MaxSubArrayLeetCode {

	public static void main(String[] args) {

		int[] nums = new int[] {3,9,1,7};
		
		int result = maxSubArray(nums);
		System.out.println(result);
		
	}

	private static int maxSubArray(int[] nums) {
		int sum = nums[0];
		int maxsum = nums[0];
		
		for(int i =1; i< nums.length; i++) {	
			if( sum < 0) {
				sum = nums[i];
				System.out.println("1) sum "+sum+ "+" + nums[i]+ "=" + sum );

			}else {
				System.out.println("sum "+sum+ "+" + nums[i]+ "=" + sum );
				sum = sum + nums[i];
			}
			maxsum = Math.max(sum, maxsum);
		}
		return maxsum;
	}	
	

}
