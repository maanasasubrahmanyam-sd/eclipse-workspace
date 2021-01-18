package com.home.test;

public class ExchangeLastAndFirstCharOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String s = "hello";
 	     int len = s.length();
//	 	 char first = s.charAt(0);
//		 char last = s.charAt(len-1);
//		 System.out.println(first);
//		 System.out.println(last);
//		 String f1 = Character.toString(first);
//		 String l1 = Character.toString(last);
//		 
//		 System.out.println(s.replace(f1, "").replace(l1, ""));
//		 
//		 System.out.println(l1 + s.replace(f1, "").replace(l1, "") + f1);
		 
		 ////////// OR This logic 
		 String results = findOutput(s);
		 
		 System.out.println(results);
		 
	}

	private static String findOutput(String s) {
		 if (s.length() <= 1) return s;
		  
		  String mid = s.substring(1, s.length()-1);
		  return s.charAt(s.length()-1) + mid + s.charAt(0);
	}

}
