package com.home.test.top.ques;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4};
		int [] b = new int[a.length];
		int length = 0;
		
		for(int i =1; i <a.length; i++) {
			b[a.length - i] = a[i];
			length = length -1;
		}
		
		for(int i =1; i <b.length; i++) {
			System.out.println(b[i]);
		}
		
	}

}