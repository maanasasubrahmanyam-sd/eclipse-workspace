package com.home.test.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {

	public static void main(String[] args) {

		//Given a list of integers, return a list of the integers, omitting any that are less than 0.

		//noNeg([1, -2]) → [1]
		//noNeg([-3, -3, 3, 3]) → [3, 3]
		//noNeg([-1, -1, -1]) → []
		
		List<Integer> nums= new ArrayList<>();
		nums.add(-5);
		nums.add(-4);
		nums.add(6);
		nums.add(7);
		
		 List<Integer> res = nums.stream()
		.filter(n -> n >= 0)
	    .collect(Collectors.toList());
		
		 //nums.removeIf(n -> n >=0);
		
		for(Integer s: res) {
			System.out.println(s);
		}
	}

}
