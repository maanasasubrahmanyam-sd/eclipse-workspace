package com.home.prerp.binarySerach;

public class PositionOfElemtInInfinteArray {

	public static void main(String[] args) {

		int[] a = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int target = 7;
		
		int res = findElem(a, target);
		System.out.println(res);
	}

	private static int findElem(int[] a, int target) {
		int start =0;
		int end = 1; 
		while (target > a[end]) {
			start = end;
			end = end * 2;
		}
		int res = SortArray(a, target, start, end);
		return res;
	}
	
	private static int SortArray(int[] sortedList, int target, int start, int end) {
		
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
