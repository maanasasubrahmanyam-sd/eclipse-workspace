package com.home.test.functional;

import java.util.ArrayList;
import java.util.List;

public class Copies3 {

	public static void main(String[] args) {

	//Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


	//copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
	//copies3(["24", "a", ""]) → ["242424", "aaa", ""]
	//copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
		

		List<String> strings = new ArrayList<>();
		strings.add("a");
		strings.add("b");
		
		for(int i =0; i < strings.size(); i++) {
			String s = strings.get(i) +  strings.get(i) + strings.get(i);
			strings.set(i, s);
		}
		
		for(String s: strings) {
			System.out.println(s);
		}
		
	
	}

}
