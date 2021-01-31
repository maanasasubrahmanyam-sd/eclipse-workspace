package com.home.prerp.binarySerach;

public class FloorOfSortedArray {

	public static void main(String[] args) {

		int[] sortedList = new int [] {5,10,20,30,40};
			
		int target = 30;
			
		int result = findFloor(sortedList, target);
		System.out.println(result);
		int celing = findCeling(sortedList, target);
		System.out.println(celing);
	}

	private static int findFloor(int[] sortedList, int target) {
		int start = 0;
		int end = sortedList.length-1;
		int res = -1;
		
		while(start <=end) {
			int mid = start + (end - start)/2;
			
			if(sortedList[mid]==target) {
				return sortedList[mid];
			}
			else if( sortedList[mid] > target) {
				end = mid - 1;
			}
			else if( sortedList[mid] < target) {
				res = sortedList[mid];
				start = mid +1;
			}
		}
		
		return res;
	}
	
	private static int findCeling(int[] sortedList, int target) {
		int start = 0;
		int end = sortedList.length-1;
		int res = -1;
		
		while(start <=end) {
			int mid = start + (end - start)/2;
			
			if(sortedList[mid]==target) {
				return sortedList[mid];
			}
			else if( sortedList[mid] > target) {
				res = sortedList[mid];
				end = mid - 1;
			}
			else if( sortedList[mid] < target) {
				start = mid +1;
			}
		}
		
		return res;
	}

}
