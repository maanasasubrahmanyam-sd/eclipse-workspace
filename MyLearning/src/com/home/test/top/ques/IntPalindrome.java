package com.home.test.top.ques;

public class IntPalindrome {

	public static void main(String[] args) {
		int num = 787;
		String s = Integer.toString(num);
		
		StringBuilder sb = new StringBuilder(s);
		if(sb.reverse().toString().equals(s)) {
			System.out.println("Int is palindrome");
		}else {
			System.out.println("Int is not palindrome");

		}
		
		int r =0;
		int sum = 0;
		StringBuilder sb1 = new StringBuilder();
		int num1 = 111;
		int num2  = num1;
		while(num1 >0) {
			r = num1 % 10;
			num1 = num1 /10;
			sb1.append(r);
			System.out.println("r is "+r);
			System.out.println("num is "+num1);
		}
		System.out.println("rev is "+ sb1.toString());
		int res = Integer.parseInt(sb1.toString());
		if(res == num2) {
			System.out.println("pal");
		}else {
			System.out.println("non pali");
		}
		
	}

}
