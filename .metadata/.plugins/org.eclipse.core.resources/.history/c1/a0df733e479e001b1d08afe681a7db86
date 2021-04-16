package com.home.test.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class No34 {

	public static void main(String[] args) {
		
		//Given a list of strings, return a list of the strings,
		//omitting any string length 3 or 4.
		
		//no34(["a", "bb", "ccc"]) → ["a", "bb"]
		//no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
		//no34(["ccc", "dddd", "apple"]) → ["apple"]
		
		List<String> nums= new ArrayList<>();
		nums.add("a");
		nums.add("bb");
		nums.add("ccc");
		nums.add("hzello");
		
		List<String> res = nums.
                stream().
                filter(n -> n.length() != 3 && n.length() !=4).
                collect(Collectors.toList());
		
		System.out.println(res.toString());

	}
}
