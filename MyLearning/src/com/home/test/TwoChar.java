package com.home.test;

public class TwoChar {

	public static void main(String[] args) {
		String str = "java";
		int index = 2; 
		if(str.length() >= index + 2) // 4 > 5
			System.out.println(str.substring(index , index + 2));
		else
			System.out.println(str.substring(0,2));

	}

}
