package com.home.test;

public class CountXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "xxxx";
		char c = 'x';
		int count = 0;
		for(int i =0 ; i< str.length()-1; i++) {
			    if (str.substring(i, i+2).equals("xx"))
			    	count++;
			}
		System.out.println(count);
		}
	}

