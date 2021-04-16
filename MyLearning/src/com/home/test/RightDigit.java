package com.home.test;

import java.util.ArrayList;
import java.util.List;

public class RightDigit {

	public static void main(String[] args) {

		//Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
		//rightDigit([1, 22, 93]) → [1, 2, 3]
		//rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
		//rightDigit([10, 0]) → [0, 0]
		
		List<Integer> nums = new ArrayList<>();
		nums.add(19);
		nums.add(28);

				
		for(int i =0; i < nums.size(); i++) {
			int left = nums.get(i) % 10;
			nums.set(i, left);
		}
		
		for(Integer s: nums) {
			System.out.println(s);
		}
	}

}
