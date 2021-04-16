package com.home.prerp.string;

public class Anagram {

	public static void main(String[] args) {

		boolean[] charSet = new boolean[256];
		
		//Input: s = "anagram", t = "nagaram"
		//		Output: true
		
		// converting character to ASCII value in Java
		char A = 'A'; 
		int ascii = A;
		System.out.println("ASCII value of 'A' is : " + ascii); 
		
		// you can explicitly cast also 
		char a = 'a'; 
		int value = (int) a; 
		System.out.println("ASCII value of 'a' is : " + value);

		String s1 = "mary";
		String s2 = "army";
		boolean r = isAnagram(s1,s2);
		System.out.println(r);
	}
	
	 public static boolean isAnagram(String s1, String s2) {
		int range = 256;
		int[] count = new int[range];
		if(s1.length() != s2.length()) {
			return false;
		}
		for(int i =0; i<s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int i =0; i< range; i ++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
	        
	    }
}
