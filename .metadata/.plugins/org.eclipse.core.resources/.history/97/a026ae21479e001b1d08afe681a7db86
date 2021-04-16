package com.home.prerp.binarySerach;


public class NoOfTimeSortedArrayIsRotated {

	public static void main(String[] args) {

		int[] A = { 4,5,6,7,0,1,2 };
		
        System.out.println("The array is rotated " + findRotationCount(A) + " times");
        System.out.println("The array is rotated " + countTimes(A) + " times");

    }



	private static int countTimes(int[] sortedList) {
		int start = 0;
		int end = sortedList.length -1;
		int n = sortedList.length;
		
		while(start <= end) {
			
			if(sortedList[start] <= sortedList[end]) {
     			return start;
     		}
			 int mid = (start + end) / 2;
	         int next = (mid + 1) % sortedList.length;
	         int prev = (mid - 1 + sortedList.length) % sortedList.length;
	 
		
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

	public static int findRotationCount(int[] A)
    {
        // search space is A[left..right]
        int left = 0;
        int right = A.length - 1;
 
        while (left <= right)
        {
            if (A[left] <= A[right]) {
                return left;
            }
 
            int mid = (left + right) / 2;
            int next = (mid + 1) % A.length;
            int prev = (mid - 1 + A.length) % A.length;
 
            if (A[mid] <= A[next] && A[mid] <= A[prev]) {
                return mid;
            }
            else if (A[mid] <= A[right]) {
                right = mid - 1;
            }
 
            else if (A[mid] >= A[left]) {
                left = mid + 1;
            }
        }
 
        // invalid input
        return -1;
    }
}
