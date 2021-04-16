package com.home.prep.recursion;

import java.util.ArrayList;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {

		List<Integer>arr = new ArrayList<>();
		arr.add(11);
		arr.add(0);
		arr.add(5);
		arr.add(2);
		
		arr = sort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}


	private static List<Integer> sort(List<Integer> l) {
		if(l.size() == 1)
			return l;
		//hypothesis
		int temp = l.get(l.size()-1);
		l.remove(l.size()-1);
		l = sort(l);
		//induction
		return l = insert(l, temp);
	}

	private static List<Integer> insert(List<Integer> l, int i) {
		if(l.size() == 0 || i >= l.get(l.size()-1))
		{
			l.add(i);
			return l;
		}
		//hypothesis
		int val = l.get(l.size() - 1);
		l.remove(l.size()-1);
		l = insert(l, i);
		//induction
		l.add(val);
		return l;
	}
	
}
