package com.home.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubStringWithoutRepeatChar {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bbbb";
		int count =0;
		boolean res = checkAllCharSame(s);
		if(!res) {
			count = lengthOfLongestSubstring(s);
		}else {
			count = count + 1;
		}
		System.out.println("final count " +count);
	}
	
	 private static boolean checkAllCharSame(String s) {
		 for(int i = 0; i <s.length()-1; i ++) {
				
				if(s.charAt(i) != s.charAt(i+1)) {
				   return false;
				}
			}
		 return true;
	}
	

	public static int lengthOfLongestSubstring(String s) {
		int count = 0;
		boolean res = checkAllCharSame(s);
		if(!res) {
		 Set<Character> res1 = new HashSet<>();
		for(int i = 0; i <s.length()-1; i ++) {
			
			if(s.charAt(i) == s.charAt(i+1)) {
				System.out.println("found" +s.charAt(i));
				System.out.println("found + 1" +s.charAt(i+1));
				res1.clear();
				System.out.println(res1.size());
			}
			if (!res1.contains(s.charAt(i)) && s.charAt(i) != s.charAt(i+1)){
				System.out.println(s.charAt(i));
	            char c = s.charAt(i);
				res1.add(c);
				}

			}
		for(Character s1 : res1) {
			System.out.println("***"+s1);
		}
		return res1.size();

	}else {
		return (count + 1);
	}
	        
}

}
