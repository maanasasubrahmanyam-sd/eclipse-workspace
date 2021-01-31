package com.home.prerp.binarySerach;


public class NearlySortedArray {

	public static void main(String[] args) {

		 int[] sortedList = new int [] {5,10,20,40,30};
			
			
			int target = 30;
			
			int result = SortArray(sortedList, target);
			System.out.println(result);
		
	}

	private static int SortArray(int[] sortedList, int target) {

		int start = 0;
		int end = sortedList.length -1;
		while( start <= end) {
			
		int	mid = start + ((end -start)/2);
		System.out.println("mid"+mid);
			
		if(sortedList[mid] == target) {
			return mid;
		}
		else if(mid >= start && sortedList[mid - 1] == target) {
			return mid -1;
		}
		else if(mid <= end && sortedList[mid + 1] == target) {
			return mid +1 ;
		}
		
		else if(target > sortedList[mid]) {
			start = mid + 2;
		}
		else if( target < sortedList[mid]) {
			end = mid -2;
		}
			
		}
		return -1;
	}

}
