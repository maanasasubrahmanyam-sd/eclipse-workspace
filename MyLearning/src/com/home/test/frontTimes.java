package com.home.test;

public class frontTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//frontTimes("Chocolate", 2) → "ChoCho"
		//frontTimes("Chocolate", 3) → "ChoChoCho"
		//frontTimes("Abc", 3) → "AbcAbcAbc"
		
		String str = "A";
		int n = 4;
		//System.out.println(str.substring(0, 3));
		
		String s = "";
		
		if(str.length()< 3) {
			for(int i =0 ; i< n ; i++) {
				s = s + str;
			}
			System.out.println(s);
		}else {
		
		for(int i =0 ; i< n ; i++) {
			s = s + str.substring(0,3);
		}
		}
		
		System.out.println(s);
		
	}

}
