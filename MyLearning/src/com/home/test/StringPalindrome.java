package com.home.test;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		System.out.println("Enter a string to check if it is a palimdrome");
		String str = new Scanner(System.in).next();
		
		StringBuilder sb = new StringBuilder(str);
		String s = sb.reverse().toString();
		
		if(s.equals(str)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
		
	}

}
