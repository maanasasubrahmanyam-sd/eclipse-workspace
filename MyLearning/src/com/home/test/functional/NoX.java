package com.home.test.functional;

import java.util.ArrayList;
import java.util.List;

public class NoX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Given a list of strings, return a list where each string has all its "x" removed.
		
		//noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
		//noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
		//noX(["x"]) → [""]
		
		List<String> strings = new ArrayList<>();
		strings.add("Hxllo");
		strings.add("BxB");
		
		for(int i =0; i < strings.size(); i++) {
			String s = strings.get(i);
			strings.set(i, s.replace("x", ""));
		}
		
		for(String s: strings) {
			System.out.println(s);
		}
		
	}

}
