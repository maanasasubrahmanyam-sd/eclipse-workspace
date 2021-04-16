package com.home.test;

import java.util.Arrays;

public class CountOfElementInSortedArray {

	public static void main(String[] args) {

		int[] sortedList = new int [] {2,3,4,10,10,10,10,18,20};
		
		Arrays.sort(sortedList);
		
		int target = 10;
		
		int first = firstOccu(sortedList, target);
		int last = lastOccu(sortedList, target);

		System.out.println(last - first + 1);
	}

	private static int firstOccu(int[] sortedList, int target) {

		int start = 0;
		int end = sortedList.length -1;
		int res = -1;
		while (start <=end) {
			int mid = start + (end - start/2);
			
			if(target == sortedList[mid]) {
				res = mid;
				end = mid -1;
			}
			if (target > sortedList[mid]) {
				start = mid + 1;
			}
			if(target < sortedList[mid]) {
				end = mid -1;
			}
		}
		return res;
	}
	
	private static int lastOccu(int[] sortedList, int target) {

		int start = 0;
		int end = sortedList.length -1;
		int res = -1;
		while (start <=end) {
			int mid = start + (end - start/2);
			
			if(target == sortedList[mid]) {
				res = mid;
				start = mid +1 ;
			}
			if (target > sortedList[mid]) {
				start = mid + 1;
			}
			if(target < sortedList[mid]) {
				end = mid -1;
			}
		}
		return res;
	}

}
