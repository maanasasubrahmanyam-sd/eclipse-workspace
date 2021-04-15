package com.home.test.top.ques;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatCharOfString {

	public static void main(String[] args) {
		String s = "swiss";
		

        Map<Character,Integer> scoreboard = new HashMap<>();
        for(int i=0; i<s.length()-1; i++) { 
        	char c = s.charAt(i);
        	if(scoreboard.containsKey(c)) {
        		scoreboard.put(c, scoreboard.get(c)+1);
        	}else {
        		scoreboard.put(c,1);
        	}
        }
        
		/*
		 * for(int i =0; i < s.length()-1; i ++) { char c = s.charAt(i); if
		 * (scoreboard.get(c) == 1) { System.out.println("Non repeated char is: "+ c);
		 * break; } }
		 */
        
        for(Map.Entry<Character,Integer> m: scoreboard.entrySet()) {
        	if(m.getValue() == 1) {
        		char c= m.getKey();
        		System.out.println(c);
        		break;
        	}
        }
        
	}
}
