package com.home.prerp.string;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringToInteger {

	public static void main(String[] args) {

		String s = "23a";
	    s = s.replaceAll("^\\s+", "");  // removes leading white space 
	    System.out.println(s);
	
		String regex = "^\\d+";
		Pattern pt = Pattern.compile(regex);
		Matcher mt = pt.matcher(s);
		
		boolean res = mt.matches();
		System.out.println(res);
		
       // s = s.replaceAll("\\s", ""); 
		//System.out.println(Integer.parseInt(s));
	}

}
