package com.home.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> listB = new ArrayList<>(Arrays.asList(4, 1, 1, 9, 6));
		List<Integer> listC = new ArrayList<>();
		listC.addAll(listA);
		listC.addAll(listB);
				
		System.out.println("All elements present in both lists are : "+Arrays.toString(listC.toArray()));
		System.out.println("All elements present in exactly one list only are : "+new Test().intersection(listA, listB));
		System.out.println("All elements present in either list, but discarding duplicates are: "+new Test().union(listA, listB));

	}

	public <T> List<T> union(List<T> list1, List<T> list2) {
		Set<T> set = new HashSet<T>();

		set.addAll(list1);
		set.addAll(list2);

		return new ArrayList<T>(set);
	}

	public <T> List<T> intersection(List<T> list1, List<T> list2) {
		List<T> list = new ArrayList<T>();

		for (T t : list1) {
			if (list2.contains(t)) {
				list.add(t);
			}
		}
		return list;
	}

}
