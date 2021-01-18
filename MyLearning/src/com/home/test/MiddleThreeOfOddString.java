package com.home.test;

public class MiddleThreeOfOddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "xba";
		// String str1 = "AAABBBAAA";

		// System.out.println(str.substring(1,4));
		// System.out.println(str1.substring(str.length()/2 -1, str.length()/2 + 2));

		boolean val = hasBad("xba");
		// System.out.println(str.substring(1,4));
		System.out.println(val);

		System.out.println("******");
		String r = lastTwo("cat");
		System.out.println(r);

	}

	public static boolean hasBad(String str) {
		System.out.println(str.length());
		if (str.length() <= 2) {
			return false;
		} else if (((str.startsWith("bad") || ((str.length() > 3) && str.substring(1, 4).equals("bad"))))) {
			return true;
		} else {
			return false;
		}
	}

	public static String atFirst(String str) {
		if (str.equals("")) {
			return "@@";
		}
		if (str.length() < 2) {
			return str + "@";
		}

		return str.substring(0, 2);
	}

	public String lastChars(String a, String b) {
		if (a.length() == 0) {
			return "@" + b.substring(b.length() - 1);
		}
		if (b.length() == 0) {
			return a.substring(0, 1) + "@";
		} else {
			return a.substring(0, 1) + b.substring(b.length() - 1);
		}
	}

	public String conCat(String a, String b) {
		if (b.equals("")) {
			return a;
		}
		if (a.equals("")) {
			return b;
		}
		if (b.equals("") && a.equals("")) {
			return "";
		}
		if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
			return a.substring(0, a.length() - 1) + b;
		}

		return a + b;
	}

	public static String lastTwo(String str) {
		// cat
		if (str.length() == 2) {
			return str.substring(1, 2) + str.substring(0, 1);
		}
		if (str.length() == 1) {
			return str;
		}
		if (str.equals("")) {
			return "";
		}
		String a = str.substring(str.length() - 1);
		String b = str.substring(str.length() - 2, str.length() - 1);
		System.out.println("last char: " + a);
		System.out.println("last but one: " + b);
		return str.substring(0, str.length() - 2) + a + b;
	}

	public boolean frontAgain(String str) {
		if(str.length() == 1){
			    return false;
		}
		if(str.length() == 2){
			return true;
		}
		if(str.equals("")){
			return false;
		}
		if(str.substring(0,2).equals(str.substring(str.length()-2))){
			return true;
		}
			return false;

	}
}
