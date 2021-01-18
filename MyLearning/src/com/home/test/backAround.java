package com.home.test;

public class backAround {

	public static void main(String[] args) {
		//backAround("cat") → "tcatt"
		//backAround("Hello") → "oHelloo"
		//backAround("a") → "aaa"
		
		           // 012345
		String str = "helloA";
		System.out.println("Maanasa: " + str.substring(2,6));
		String mid = str.substring(1, str.length()-1);
		System.out.println(mid);
		System.out.println(str.substring(str.length() -1));
		
		System.out.println(str.substring(str.length() -1) + str  + str.substring(str.length() -1));
		
		int n = 100;
		if ( n % 3 == 0 || n % 5 == 0){
		    System.out.println( "true");
		  }else
	    System.out.println( "false");
	}

}
