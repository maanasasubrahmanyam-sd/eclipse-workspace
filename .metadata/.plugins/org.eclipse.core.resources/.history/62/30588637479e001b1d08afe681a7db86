package com.home.test.array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		/*
		 * Input: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6], n = 3
		 * 
		 * nums1.length == m + n nums2.length == n Output: [1,2,2,3,5,6]
		 */

		int a[] = new int[] { 1, 2, 3, 0, 0, 0 };
		int b[] = new int[] { 2, 5, 6 };

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums1.length == m + n) {
			for (int i = 0; i < nums2.length; i++) {
				for (int j = 0; j < nums1.length; j++) {
					if (nums1[j] == 0) {
						nums1[j] = nums2[i];
						break;
					}
				}
			}
			Arrays.sort(nums1);
			for (int i = 0; i < nums1.length; i++) {
				System.out.println(nums1[i]);
			}
		}
	}

}
