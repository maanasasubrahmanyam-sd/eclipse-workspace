package com.home.test;

public class ExtraEnd {

	public static void main(String[] args) {
		String str = "string";
		String s = "";
		for(int i=0; i< str.length()-1; i++) {
		    s = s + str.substring(str.length() -2);
		}
		System.out.println(s);
		  
		// return middle on without first and last char
		
		String j = str.substring(0, 1);
		String k = str.substring(str.length()-1);
		String p = str.substring(1, str.length()-1);
		System.out.println(j);
		System.out.println(k);
		System.out.println(p);
		
		System.out.println("///////");
		
		StringBuilder sb = new StringBuilder(str);
		if(str.length() % 2 !=0) {
			sb.deleteCharAt(str.length()/2);
			
		}else{
	        int middle = str.length()/2 - 1;
	        System.out.println(middle);
	        sb.deleteCharAt(middle);
	        sb.deleteCharAt(middle);
	    }
		
		System.out.println(sb.toString());
		System.out.println(str.substring(0,2));
		
	}

}
