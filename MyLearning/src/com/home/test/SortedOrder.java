package com.home.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class SortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input : bbccdefbbaa 
		//Output : aabbbbccdef
		
		String s = "bbccdefbbaa";
		
		char[] charArr = s.toCharArray();
	    //Arrays.sort(charArr);
	    List<char[]> ch = Arrays.asList(charArr);
	   
	    List<Character> c = new ArrayList<>();
	    for(char a : charArr) {
	    	c.add(a);
	    }
	    
	    Character[] arr = c.toArray(new Character[c.size()]);
	    List<Character> m = Arrays.asList(arr);
	    
	    
	    System.out.println(String.valueOf(charArr));
		
		
	}

}