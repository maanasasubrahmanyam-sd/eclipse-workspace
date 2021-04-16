package com.home.test;

import java.util.ArrayList;
import java.util.List;

public class MoreY {

	public static void main(String[] args) {

		//Given a list of strings, return a list where each string has "y" added at its start and end.


		//moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
		//moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
		//moreY(["yay"]) → ["yyayy"]
		
		List<String> strings = new ArrayList<>();
		strings.add("a");
		strings.add("b");
		
		for(int i =0; i < strings.size(); i++) {
			String s =  "y"+strings.get(i) + "y";
			strings.set(i, s);
		}
		
		for(String s: strings) {
			System.out.println(s);
		}
		
		
	}

}
