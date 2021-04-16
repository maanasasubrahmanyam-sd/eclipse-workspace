package com.home.prep.sorting;

public class BubbleSort {

	public static void main(String[] args) {
	

		int[] list = new int[] {7,8,5,4,2};
		//System.out.println(list.length);
		int[] res = bubbleSort(list);
		for(int i : res) {
			System.out.println(i);
		}
	}

	private static int[] bubbleSort(int[] arr) {
		int n = arr.length; 
		
        for (int i = 0; i < n-1; i++) {
        	System.out.println(arr[i]);
            for (int j = 0; j < n-i-1; j++) { 
            	System.out.println("j"+arr[j]);
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
            }
        }
		return arr;
	}

}
