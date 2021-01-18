package com.home.test;

public class DoubleX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ab";
		
		/*
		 * for(int i =0; i <str.length()-1; i++) { if(str.substring(i,
		 * i+2).equals("xx")){ //System.out.println("true"); } }
		 */
		
		String s = "";
		for(int i =0; i< str.length(); i++){
		      s = s + str.substring(0, i+1);
		      System.out.println(s);
		  }
		 // System.out.println(s);
	}

}
