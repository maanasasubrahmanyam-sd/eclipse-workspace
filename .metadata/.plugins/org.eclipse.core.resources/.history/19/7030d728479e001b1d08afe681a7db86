package com.home.prerp.string;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a = new int [] {1,1,3};
		int result = removeDuplicates(a);
		System.out.println(result);
	}
	
    public static int removeDuplicates(int[] nums) {  
    	int index = 1;
    	
    	for(int i =0; i<nums.length -1 ; i++) {
    		if(nums[i] != nums[i+1]) {
    			System.out.println(i);
    			System.out.println(nums[i+1]);
    			nums[index++] = nums[i +1];
    		}
    	}
    	return index;
    }
}
