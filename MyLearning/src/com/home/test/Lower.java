package com.home.test;

import java.util.ArrayList;
import java.util.List;

public class Lower {

	public static void main(String[] args) {

		//Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


		//lower(["Hello", "Hi"]) → ["hello", "hi"]
		//lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
		//lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
		
		List<String> strings = new ArrayList<>();
		strings.add("Hello");
		strings.add("BBB");
		
		for(int i =0; i < strings.size(); i++) {
			String s = strings.get(i).toLowerCase();
			strings.set(i, s);
		}
		
		for(String s: strings) {
			System.out.println(s);
		}
		
		
		
		
	}

}
