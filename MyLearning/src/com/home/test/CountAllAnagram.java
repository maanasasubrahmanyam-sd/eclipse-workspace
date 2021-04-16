package com.home.test;

public class CountAllAnagram {

	public static void main(String[] args) {

		String s= "cbaebabacd" ;
		String s1 = "abc";
		int[]count = countAnagarm(s, s1);
		
	}

	private static int[] countAnagarm(String s, String s1) {
		int k = s1.length();
		int i =0;
		int j = 0;
		int range = 256;
		int[] res = new int[range];
		while( j< s.length()) {

			if(j -i +1 < k) {
				j++;
			}else if (j - i  + 1 == k) {
				String sub = s.substring(i, j +1);
				System.out.println(sub);
				boolean ans = isAnagarm(sub,s1);
				if(ans) {
					res[i]=i;
				}
				j++;
				i++;
			}	
		}		
		return res;
	}
	
	private static boolean isAnagarm(String s, String s1) {
		int range = 256;
		int[] count = new int[range];
		if(s.length() != s1.length()) {
			return false;
		}
		
		for(int i =0; i< s.length(); i++) {
			count[s.charAt(i)]++;
			count[s1.charAt(i)]--;
		}
		
		for(int i =0; i<count.length; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
		
	}

}
