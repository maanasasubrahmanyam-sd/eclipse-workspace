package com.home.test;

public class ReverseString {

	public static void main(String[] args) {
		String str = "cat";
		int length = str.length() ;
		char [] ch =new char [length];
		
		
		for(int i =0; i < str.length(); i++) {
			ch[length - 1] = str.charAt(i); 
		    length= length - 1;
		}
		
		for(char c : ch) {
			System.out.println(c);
		}
		System.out.println("done");
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
	}

}
