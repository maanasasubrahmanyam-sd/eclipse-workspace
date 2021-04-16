package com.home.prerp.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxArray {

	public static void main(String[] args) {

		int[] s = new int[] { 2, 3, 4, 1, 2 };

		int size = s.length - 3;
		int sum = 0;
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			for (int j = i; j < i + 4; j++) {
				System.out.println(s[j]);
				sum = sum + s[j];
				myList.add(sum);
			}
			System.out.println("sum is:" + sum);
			sum = 0;
			System.out.println();
		}

		Collections.sort(myList);
		System.out.println("max sum is: " + myList.get(myList.size() - 1));

	}

}
