package com.home.test;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -123;
		int result = reverse(x);
		System.out.println("final output"+result);
	}
	
	public static int reverse(int x) {
		boolean flag = false;
        if(x == 0){
            return 0;
        }
        String s = Integer.toString(x);
        if(s.startsWith("-")) {
        	flag = true;
        	StringBuilder sb = new StringBuilder(s); 
            //System.out.println("Rev" +sb.reverse());
            //System.out.println(sb.toString());
            sb.toString().substring(1,sb.toString().length());
            System.out.println("start "+sb.toString().substring(1,sb.toString().length()));
            String t = sb.toString().substring(1,sb.toString().length());
        	StringBuilder sb1 = new StringBuilder(t); 
            System.out.println("Rev" +"-" +sb1.reverse().toString());
            System.out.println("convert to int " + Integer.parseInt("-" +sb1.reverse().toString()));
            return Integer.parseInt("-" +sb1.reverse().toString());
        }else {
        	StringBuilder sb = new StringBuilder(s);
        	System.out.println("Rev" +sb.reverse());
        	System.out.println(sb.toString());
        
        	return Integer.parseInt(sb.toString());
        }
    }

}
