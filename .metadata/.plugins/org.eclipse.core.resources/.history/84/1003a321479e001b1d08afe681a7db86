package com.home.prerp.binarySerach;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

        int[] sortedList = new int [] {10,20,30,40,50,60,70,80,90};
		
		Arrays.sort(sortedList);
		
		int target = 80;
		
		int result = SortArray(sortedList, target);
		System.out.println(result);

	}

	private static int SortArray(int[] sortedList, int target) {
		
		int start = 0;
		int end = sortedList.length -1;
		
		while (start <= end) {
			int mid = start + ((end - start)/2);

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
