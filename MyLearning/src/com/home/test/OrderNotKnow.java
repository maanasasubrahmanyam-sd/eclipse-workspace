package com.home.test;

import java.util.Arrays;

public class OrderNotKnow {

	public static void main(String[] args) {

		int[] sortedList = new int [] {90,80,66,77,21,2,1};
		
		Arrays.sort(sortedList);
		
		int target = 66;
		
		int result = orderNotKnown(sortedList, target);
		System.out.println(result);
	}

	private static int orderNotKnown(int[] sortedList, int target) {
		if(sortedList.length == 1) {
			return sortedList[0];
		}
		
		// logic to see if it is ascending or decending
		if (sortedList[0] < sortedList[1]) { // ascending
			int res = sortedSerach(sortedList, target);
			return res;
			
		}
		if( sortedList[0] > sortedList[1]) {
			int res = descSorted(sortedList, target);
			return res;
		}
		return -1;
	}

	private static int descSorted(int[] sortedList, int target) {
		int start = 0;
		int end = sortedList.length -1;
		
		while(start <= end) {
			int mid = start + (end-start/2);
			
			if(sortedList[mid] == target) {
				return mid;
			}
			if(sortedList[mid] > target) {
				end = mid -1;
			}
			if (sortedList[mid] < target) {
				start = mid + 1;
			}
		}
		return -1;
	}

	private static int sortedSerach(int[] sortedList, int target) {
			
			int start = 0;
			int end = sortedList.length -1;
			
			while (start <= end) {
				int mid = start + (end - start/2);

				if(target == sortedList[mid]) {
					return mid;
				}
				if (target < sortedList[mid]) {
					end = mid -1;
				}
				if (target > sortedList[mid]) {
					start = mid +1 ;
				}
			}
			return -1;
		}
}


