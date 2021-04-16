package com.home.prerp.string;

public class Palindrome {

	public static void main(String[] args) {
		//Input: nums = [1,1,2]
		//Output: 2, nums = [1,2]
		
		String s = "A man, a plan, a canal: Panama";
		boolean result = isPalindrom(s);
		System.out.println(result);
		
	}

	private static boolean isPalindrom(String s) {
		s = s.replaceAll("[^A-Za-z0-9]","").replaceAll("//s", "").toLowerCase();
		if(s.length() == 0 || s.length() == 1 || s.isEmpty()) {
			return true;
		}
		while(s.length()!=0) {
			if (s.substring(0,1).equals(s.substring(s.length()-1))) {
				s = s.substring(1, s.length()-1);
				if(s.length() == 1 || s.length() == 0) {
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}

}
