package com.home.test;

public class SpecialString {

	public static void main(String[] args) {
		
		String s = notString("NotJi");
		System.out.println(s);
		
	}
	
	public static String notString(String str) {
		   StringBuilder sb = new StringBuilder(str);
		   if ((str.startsWith("not") || (str.startsWith("NOT")))){
		     return "unchanged";
		   }else{
		     return sb.insert(0,"not").toString();
		   }
		}

}
