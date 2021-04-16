package com.home.prerp.string;

import java.util.regex.Pattern;

public class ReverseString {

	public static void main(String[] args) {

		String s = "I love java";
		String res = reverseWord(s);
		System.out.println(res);
	}

	private static String reverseWord(String s) {
        Pattern pattern = Pattern.compile("\\s"); 
   
        String[] temp = pattern.split(s); 
        String result = ""; 
  
 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
	}

}
