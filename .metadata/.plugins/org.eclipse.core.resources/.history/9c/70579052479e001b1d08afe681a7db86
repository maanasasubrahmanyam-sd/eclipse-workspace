package com.home.test.top.ques;

public class StringAnagram {

	public static void main(String[] args) {
		// A string is said to be an anagram if
		// it contains the same characters and same length,
		// but in a different order, e.g. army and Mary

		String a = "A mans";
		String b = "A mans";
		
		a = a.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().replaceAll("\\s", "");  
		b = b.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().replaceAll("\\s", "");

		System.out.println(a);
		System.out.println(b);
		
		int count = 0;
		if (a.length() == b.length()) {
			for(int i =0; i<a.length(); i++) {
				for( int j =0; j<b.length(); j++) {
					if (a.charAt(i) == b.charAt(j)) {
						count ++;
					}
				}
			}
		}
		
		if(count == a.length()) {
			System.out.println("String is anagram");
		}
		else {
			System.out.println("Not an anagram");
		}
	}
}
