package com.home.test;

import java.util.ArrayList;
import java.util.List;

public class MondaySum {

	public static void main(String[] args) {
		int res= totalMoney(20);
		System.out.println(res);
		
		boolean val = isPalindrome(10);
		System.out.println(val);
		
		System.out.println("*****");
		int res1 = romanToInt("IV");
		System.out.println(res1);
		
	}
	
	//(1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37.
	//(1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 6  + 7 + 8 + 9)  + (3 + 4 +5 + 6 + 7 +8) = 96.

	
	public static int totalMoney(int n) {
        int sum = 0;
        int count = 0;
        int mondaySum = 1;
        int j = 1;
        int i =1;
        
       while(i <= n) {
    	  
          if(count != 7) {
        	   sum = sum + j;
        	   System.out.println("sum is "+ sum +  "+"+j );
        	   j++;
           }
           if(count == 7)
           {
	       	   mondaySum++;
	       	   sum = sum + mondaySum;
	       	   count = 1;
	       	   System.out.println("Now sum is" + sum);
	       	   j = mondaySum +1;
	       	   
          }
           i++;
           count ++;
       } 
        
        return sum ;
    }
	
	public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        System.out.println(s);
        
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.toString());
        
        if(s.equals(sb.toString())){
            return true;
        }else 
        {
            return false;
        }
    }
	
    public static int romanToInt(String s) {
    	int total = 0;
    	
    	for(int i =0; i <=s.length(); i++) {   

    		
    		if((i <= s.length()-1) && (s.charAt(i)<s.charAt(i+1))) {
    			total = total - charToInt(s.charAt(i));
        		
    		}else {
    			total = total + charToInt(s.charAt(i));
        		
    		}
    		return total;
    	}
		return total;
    }
    
    public static int charToInt(char cha){
        switch(cha){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
        
    }
}
