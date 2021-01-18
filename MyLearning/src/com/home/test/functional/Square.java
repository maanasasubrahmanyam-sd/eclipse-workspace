package com.home.test.functional;

import java.util.ArrayList;
import java.util.List;

public class Square {

	public static void main(String[] args) {
		//Given a list of integers, return a list where each integer is multiplied with itself.
		
		//square([1, 2, 3]) → [1, 4, 9]
		//square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
		//square([]) → []
		
		List<Integer> nums= new ArrayList<>();
		nums.add(-5);
		
		for(int i =0; i < nums.size(); i++) {
			int j = Math.abs(nums.get(i));
			int sq = j * j;
			nums.set(i, sq);
		}
		
		for(int i : nums) {
			System.out.println(i);
		}
	}

}
