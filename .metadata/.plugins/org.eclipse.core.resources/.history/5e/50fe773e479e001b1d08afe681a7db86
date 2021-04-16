package com.home.test.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a list of strings, return a list of the strings, 
		//omitting any string that contains a "z". 
		//(Note: the str.contains(x) method returns a boolean)

		//noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
		//noZ(["hziz", "hzello", "hi"]) → ["hi"]
		//noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
		
		List<String> nums= new ArrayList<>();
		nums.add("aaa");
		nums.add("bbb");
		nums.add("aza");
		nums.add("hzello");
		
		String ourWord = "z";
		List<String> res = nums.
				stream().
				filter(n -> !n.contains(ourWord)).
				collect(Collectors.toList());
		
		System.out.println(res.toString());
		
		
		
		
	}

}
