package com.home.test;

import java.util.ArrayList;
import java.util.List;

public class No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
	//no9([1, 2, 19]) → [1, 2]
	//no9([9, 19, 29, 3]) → [3]
	//no9([1, 2, 3]) → [1, 2, 3] 
		
		List<Integer> nums= new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(19);
		
		nums.removeIf(n -> (n % 10) == 9 );
	
	}

}
