package com.home.test;

public class FindElementInRotateeSortedArray {

	public static void main(String[] args) {

		int[] A = { 4,5,6,7,0,1,2 };

		int index = findIndexOfMinElem(A);
		//System.out.println(index);
		int num = 2;
		
		int front = sortArray(A, 0, index-1, num);
		int back = sortArray(A, index, A.length -1, num);
		
		//System.out.println(front);
		//System.out.println(back);
		
		if(front > 0) {
			System.out.println("Answer is at index " + front);
		}
		else if (back > 0) {
			System.out.println("Answer is at index " + back);
		}


	}
	
	private static int findIndexOfMinElem(int[] sortedList) {
		int start = 0;
		int end = sortedList.length -1;
		int n = sortedList.length;
		
		while(start <= end) {
			
			if(sortedList[start] <= sortedList[end]) {
     			return start;
     		}
     	   	int mid = end + start / 2;
     	   	int next = (mid + 1) % n;
     	   	int prev = (mid - 1 + n) % n;
		
			if(sortedList[mid]<= sortedList[next] && sortedList[mid]<= sortedList[prev]) {
				return mid;
			}
			
			else if(sortedList[mid] <= sortedList[start]) { // unsorted we array we are looking 
				start = mid - 1;
			}
			else if(sortedList[mid] >= sortedList[end]) { // unsorted array we are looking because our answer is there.
				end = mid +1;
			}
		}
		return -1;
	}
	//		int[] A = { 4,5,6,7,0,1,2 };
	private static int sortArray(int[] sortedList, int start, int end, int target) {
		
		while (start <= end) {
			int mid = (end + start)/2;

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
