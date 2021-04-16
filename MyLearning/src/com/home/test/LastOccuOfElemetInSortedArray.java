package com.home.test;

import java.util.Arrays;

public class LastOccuOfElemetInSortedArray {

	public static void main(String[] args) {

		int[] sortedList = new int [] {2,3,4,10,10,10,10,18,20};
		
		Arrays.sort(sortedList);
		
		int target = 10;
		
		int result = lastOccur(sortedList, target);
		System.out.println(result);
	}

	private static int lastOccur(int[] sortedList, int target) {
		int start = 0;
		int end = sortedList.length-1;
		int res = -1;
				
		while(start <= end) {
			int mid = start + (end -start/2);
			
			if(target == sortedList[mid]) {
				res = mid;
				start = mid +1;
				
			}if(target < sortedList[mid]) {
				end = mid -1;
			}if(target > sortedList[mid]) {
				start = mid + 1;
			}
		}
		return res;
	}
	
}
