package com.home.test;

public class Front3String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//front3("Java") → "JavJavJav"
		//front3("Chocolate") → "ChoChoCho"
		//front3("abc") → "abcabcabc"
		
		String s = "java";
     	System.out.println(s.substring(0, 3) + s.substring(0, 3) + s.substring(0, 3));
        // if length less than  3
     	//str.substring(0, str.length()) + str.substring(0, str.length()) + str.substring(0, str.length()));

	}

}
