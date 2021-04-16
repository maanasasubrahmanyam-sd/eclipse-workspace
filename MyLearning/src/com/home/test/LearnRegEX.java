package com.home.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegEX {

	// regex -> . any char
	// /d -> 0-9 any digit
	// /D -> non digit
	// /s -> matches space
	// /S -> non space
	// /w -> any word A-Z, a-z, 0-9 _
	// /W -> Non Word
	// * -> 0 or more
	
	public static void main(String[] args) {

		String reg = "^\\d+";
		String seq= "97"; 
				
		Pattern pt = Pattern.compile(reg);
		Matcher mt = pt.matcher(seq);
		
		boolean result = mt.matches();
		System.out.println(result);
	}

}
