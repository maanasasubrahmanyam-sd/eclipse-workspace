package com.home.test;

import java.util.Arrays;

public class BinarySearch {
 
	 //
	public static void main(String[] args) {
		int[] sortedList = new int [] {10,20,30,40,50,60,70,80,90};
		
		Arrays.sort(sortedList);
		
		int target = 30;
		
		int result = SortArray(sortedList, target);
		System.out.println(result);

}

	private static int SortArray(int[] sortedList, int target) {
		int left =0;
		int right = sortedList.length-1;
		
		while (left <=right) {
			int middle = (left + right) / 2;
			System.out.println("Middle is "+ middle);

			if(target < sortedList[middle]) {
				right = middle -1;
				System.out.println("Now right is " + right);
			}else if( target > sortedList[middle]) {
				left = middle + 1;
				System.out.println("Now left is " + left);
			}else {
				target = middle;
				System.out.println("Found target at :" +middle);
				return middle; 
			}
		}
		return -1;
	}
}
