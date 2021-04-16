package com.home.test;
import java.util.*;
import java.util.stream.Stream;

public class MinimumWindowSubstring {

	static List<String> ans = new ArrayList<>();

	public static void main(String[] args) {

		//Input: s = "ADOBECODEBANC", t = "ABC"
		//		Output: "BANC"
		
		String s = ".-.";
		String t = "-";
		
		
		String result1 = minWindow1(s, t);
		System.out.println(result1);
	}

	private static String minWindow1(String s, String t) {
		boolean hasUppercase = s.equals(s.toLowerCase());

		if(!hasUppercase) {
			s = s.toUpperCase();
			t = t.toUpperCase();
		}
		if(s.length() == 1 && t.length() == 1) {
			if(!s.equals(t))
				return "";
		}
		if(t.length()> s.length()) {
			return "";
		}
		if(s.equals(t)) {
			return t;
		}
		
		int i = 0;
		int j = 0;

		char[] arr = s.toCharArray();
		String[] split = t.split("");
		StringBuilder sb = new StringBuilder();
		String[] appendedString = null;
		boolean isMatch = false;

			while (j < arr.length) {

				if (!isMatch) {

					sb.append(s.charAt(j));
					appendedString = sb.toString().split("");
					//System.out.println("Now String " + sb.toString());
					isMatch = Arrays.asList(appendedString).containsAll(Arrays.asList(split));
					j++;
				} else if (isMatch) {
					//System.out.println("match " + sb.toString());
					ans.add(sb.toString());
					i++;
					isMatch = extracted(sb, split);
				}
				if (isMatch) {
					//System.out.println("now match " + sb.toString());
					ans.add(sb.toString());
					i++;
					isMatch = extracted(sb, split);
				}
				
				while(j == arr.length && i < arr.length) {
					//System.out.println("Now just increment i" +i+ "j is at" +j);
					i++;
					isMatch = extracted(sb, split);
				}
			}
			
		
		//System.out.println("In our list "+ ans);
		String shortest = "";
		if (!ans.isEmpty()) {
			shortest = ans.get(0);

			for (String str : ans) {
				if (str.length() < shortest.length()) {
					shortest = str;
				}
			}
		}

		return shortest;

	}

	private static boolean extracted(StringBuilder sb, String[] split) {
		sb.delete(0,1);
		//System.out.println("After deletion of first char "+sb.toString());
		String[] appendedString = sb.toString().split("");
		boolean isMatch = Arrays.asList(appendedString).containsAll(Arrays.asList(split));
		if(isMatch) {
		    ans.add(sb.toString()) ;       
			return true;	
		}else {
			return false;
		}
	}


	private static String minWindow(String s, String t) {
		boolean hasUppercase = s.equals(s.toLowerCase());

		if(!hasUppercase) {
			s = s.toUpperCase();
			t = t.toUpperCase();
		}
		if(s.length() == 1 && t.length() == 1) {
			if(!s.equals(t))
				return "";
		}
		if(t.length()> s.length()) {
			return "";
		}
		if(s.equals(t)) {
			return t;
		}
		int j =0;
		int i =0;
		StringBuilder sb = new StringBuilder();

		String[] split = t.split("");
		List<String> ans = new ArrayList<>();
		while(j < s.length()) {
			
			sb.append(s.charAt(j));
			String[] words2 = sb.toString().split("");
			
			boolean contain = Arrays.asList(words2).containsAll(Arrays.asList(split));

			if(contain) {
				ans.add(sb.toString());
				for(int k =0; k < sb.toString().length(); k++) {
					sb.delete(0,1);
					words2 = sb.toString().split("");
					contain = Arrays.asList(words2).containsAll(Arrays.asList(split));
					if(contain) {
						ans.add(sb.toString());
					}else {
						i = j;
						sb = new StringBuilder();
						sb.append(s.charAt(j));
						words2 = sb.toString().split("");
						contain = Arrays.asList(words2).containsAll(Arrays.asList(split));
						if(contain) {
							ans.add(sb.toString());
						}else {
							break;
						}
					}
				}
				sb.delete(0, sb.length());
			}
			j++;
		}
		String shortest = "";
		if(!ans.isEmpty()) {
		 shortest = ans.get(0);

		for(String str : ans) {
		    if (str.length() < shortest.length()) {
		        shortest = str;
		    }
		}
		}
		return shortest;
	}



}
