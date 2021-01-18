package com.home.test;

import java.util.Arrays;

public class TwoSum {
	 static int [] output = new int[2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int [] {2,7,11,15};
		int target = 9;
		int[] res = twoSum(nums,target);
		for(int i =0; i< res.length ; i++) {
			System.out.println(res[i]);
		}
	}
	

	public static int[] twoSum(int[] nums, int target) {
	    int[] res = new int[2];
	    for(int i =0; i<= nums.length - 2; i++){
	            if(nums[i] + nums[i+1] == target){
	                res[0]= nums[i];
	                res[1]= nums[i +1];            		   
	            }
	        }
	        for (int i = 0; i < res.length; i++) {
				int j = findIndex(nums, res[i]);
				output[i] = j;
			}
	        
	        return output;
	    }
	    
	    // Function to find the index of an element 
	    public static int findIndex(int arr[], int t) 
	    { 
	       int index = Arrays.binarySearch(arr, t); 
	        return (index < 0) ? -1 : index; 
	    } 

}
