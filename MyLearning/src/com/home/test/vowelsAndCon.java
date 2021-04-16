package com.home.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class vowelsAndCon {

	public static void main(String[] args) {
		String s = "Are";
		int vovel =0;
		int cont = 0;
		//^[a-zA-Z]+$
		String pattern = "^[a-zA-z]+";
		
		Pattern ptn = Pattern.compile(pattern);
		Matcher mtc = ptn.matcher(s);
		
		boolean res = mtc.matches();
		System.out.println(res);
		
		if(res) {
		
		for(int i =0; i< s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'  
					|| s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' 
					|| s.charAt(i) == 'I'  
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				
				vovel ++;
				
			}	else {
				cont++;
			}
		}
		System.out.println( vovel+" vowels and " + cont+" consonants");
		}else {
			System.out.println("Enter valid string");
		}
	}

}
