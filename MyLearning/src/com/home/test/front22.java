package com.home.test;

public class front22 {

	public static void main(String[] args) {
		//front22("kitten") → "kikittenki"

		String str = "h";
		
		//System.out.println(str.substring(0,2));
		
		//System.out.println(str.substring(0,2) +  str + str.substring(0,2)) ;
		
		if (str.length() < 2) {
			System.out.println(str + str + str);
		}
		
		int a = 100;
		int b = 100;
		  if (((a >= 13 && a <= 19)  && !(b >= 13 && b <= 19)) || ((b >= 13 && b <= 19)  && !(a >= 13 && a <= 19))) {
			  System.out.println("yes");
		  }else {
			  System.out.println("no");
		  }


	}

}
