package com.home.prerp.string;

import java.util.Arrays;



public class SortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input : bbccdefbbaa 
		//Output : aabbbbccdef
		
		String s = "bbccdefbbaa";
		
		char[] charArr = s.toCharArray();
	    Arrays.sort(charArr);
	    
	    System.out.println(String.valueOf(charArr));
		
		
	}

}
