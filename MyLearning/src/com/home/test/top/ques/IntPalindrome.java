package com.home.test.top.ques;

public class IntPalindrome {

	public static void main(String[] args) {
		int num = 989;
		String s = Integer.toString(num);
		
		StringBuilder sb = new StringBuilder(s);
		if(sb.reverse().toString().equals(s)) {
			System.out.println("Int is palindrome");
		}else {
			System.out.println("Int is not palindrome");

		}
		
	}

}
