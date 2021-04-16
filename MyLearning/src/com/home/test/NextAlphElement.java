package com.home.test;

public class NextAlphElement {

	public static void main(String[] args) {

		char[] c = new char[] {'a','b','c','f','h','k'};
		
		char target = 'f';
		
		char res = findNextChar(c, target);
		System.out.println(res);
	}

	private static char findNextChar(char[] c, char target) {
		
		int start = 0;
		int end = c.length -1;
		char res = 0;
		while(start <= end) {
			int mid = start + (( end - start)/2);
			
			if(target == c[mid]) {
				start = mid +1;
			}else if(target > c[mid]) {
				start = mid + 1;
			}else if (target < c[mid]) {
				res = c[mid];
				end = mid -1;
			}	
		}
		
		return res;
	}

}
