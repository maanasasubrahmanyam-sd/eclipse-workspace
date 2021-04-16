package com.home.test;

import java.util.Arrays;


public class SortCharInString {

	public static void main(String[] args) {

		//Input : bbccdefbbaa
		//Output : aabbbbccdef
		String s = ".-1";
		
		char[] c = s.toCharArray();
		
		Arrays.sort(c);		
		
		System.out.println(c);
		
	}

}
