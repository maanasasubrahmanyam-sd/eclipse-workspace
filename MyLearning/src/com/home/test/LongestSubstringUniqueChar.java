package com.home.test;
import java.util.*;
public class LongestSubstringUniqueChar {

	public static void main(String[] args) {
		
		//Input: s = "abcabcbb" 
		//Output: 3 
		//Explanation: The answer is "abc", with the length of 3. 

		String s = "-.-";
		
		Set<Character> result = longestSubString(s);
	}

	private static Set<Character> longestSubString(String s) {
		Set<Character> ans = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			if(ans.contains(s.charAt(i))) {
				
			}else {
				ans.add(s.charAt(i));
			}
		}
		
		for (char c : ans) {
		    System.out.println(c);
		}
		return ans;
	}
}
