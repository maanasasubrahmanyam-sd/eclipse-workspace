package com.home.test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {

		//3. Longest Substring Without Repeating Characters
		
		//Input: s = "abcabcbb"
		//		Output: 3
		
		String s = "abcabcbb";
		
		int result = findLongestIndex(s);
		System.out.println(result);
	}
	
	public static int findLongestIndex(String s) {
		int ans = 0;
		for(int i =0; i<s.length(); i++) {
			for(int j =i +1; j<=s.length(); j++) {
				if(fineUnique(s,i, j)) {
					ans = Math.max(ans, j-i);
				}
			}
		}
		return ans;
	}
	
	public static boolean fineUnique(String s, int start, int end) {
		Set<Character> uniqueString = new HashSet<>();	
		for(int i =start; i<end; i++) {
			if(uniqueString.contains(s.charAt(i))) {
				return false;
			}else {
				uniqueString.add(s.charAt(i));
				System.out.println(uniqueString.toString());
			}
		}
		return true;	
	}	

}
