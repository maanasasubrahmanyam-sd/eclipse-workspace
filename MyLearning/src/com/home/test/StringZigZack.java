package com.home.test;

public class StringZigZack {

	public static void main(String[] args) {
		String s = "paypalishiring";
		StringBuilder top = new StringBuilder();
		StringBuilder middle = new StringBuilder();
		StringBuilder bottom = new StringBuilder();
		StringBuilder placeHolder = new StringBuilder();

		//p   a   h   n
		//a p l s i i g
		//y   i   r
		
		for(int i =0; i<=s.length()-1; i++) {
			if (i % 2 != 0 ) {
				middle.append(s.charAt(i));
			}
			if(i % 2 ==0) {
				placeHolder.append(s.charAt(i));
			}
		}
		for(int i =0; i <placeHolder.toString().length(); i++) {
			if(i % 2==0) {
				top.append(placeHolder.toString().charAt(i));
				top.append(" ");
			}else {
				bottom.append(placeHolder.toString().charAt(i));
				bottom.append(" ");
			}
		}
		System.out.println(top.toString());
		System.out.println(middle.toString());
		System.out.println(bottom.toString());


	}

}
