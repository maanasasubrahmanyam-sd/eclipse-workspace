package com.home.test;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = new int[] {7,8,5,4,2};
		//System.out.println(list.length);
		int[] res = selectionSort(list);
		for(int i : res) {
			System.out.println(i);
		}
	}

	private static int[] selectionSort(int[] list) {
		
		int minVal = 0;
		int minIndex = 0;
		int temp =0;
		
		for(int i =0; i<list.length; i++) {
			System.out.println("Now i is"+i);
			minVal = list[i];
			minIndex = i;
			for(int j =i; j<list.length; j++) {
				System.out.println("j is"+j);
				if(list[j]<list[i]) {
					minVal = list[j];
					minIndex = j;
				}
				
				if(minVal < list[i]) {
					temp = list[i];
					list[i] = list[minIndex];
					list[minIndex] = temp;
				}
			}
		}
		return list;
	}

}
