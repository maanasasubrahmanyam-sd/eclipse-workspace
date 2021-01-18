package com.home.test;

public class ReturnMiddleOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "AbcA";
		String str = "AAAUXXUBBB";
		//System.out.println(str.substring(str.length()/2));
		//System.out.println(str.substring(str1.length()/2));
		
		int word = str.length();
		//String start = str.substring(word/2 -1);
		//String mid = str.substring(word/2);
		System.out.println(word);
		
		String end = str.substring((word/2), (word /2+1));//+ str.substring(word / 2);
		String end1 = str.substring((word/2-1 ), (word /2+1));
		//System.out.println(start);
		//System.out.println(mid);
		System.out.println(end);
		System.out.println(end1);

		
		 // Initializing String
                              // 1234
        String Str = new String("abcd"); // oh

  

        // using substring() to extract substring

        // returns geeks

        System.out.print("The extracted substring  is: ");

        System.out.println(Str.substring(1, 3));
		//System.out.println(start + end);
	}

}
