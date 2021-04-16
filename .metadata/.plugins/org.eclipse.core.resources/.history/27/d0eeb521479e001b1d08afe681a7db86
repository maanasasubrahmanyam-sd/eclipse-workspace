package com.home.prerp.binarySerach;

import java.util.Arrays;

public class BinarySearchReveseSortedArray {

	public static void main(String[] args) {
		int[] sortedList = new int [] {90,80,66,77,21,2,1};
		
		Arrays.sort(sortedList);
		
		int target = 66;
		
		int result = revSortArray(sortedList, target);
		System.out.println(result);

	}

	private static int revSortArray(int[] sortedList, int target) {
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


}
