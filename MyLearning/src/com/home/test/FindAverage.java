package com.home.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FindAverage {

	public static void main(String[] args) throws Exception {

		List<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(10);
		myList.add(10);

		BigInteger sum = new BigInteger("0");

		if (!myList.isEmpty()) {
			for (int i : myList) {
				BigInteger currentInt = BigInteger.valueOf(i);
				sum = sum.add(currentInt);
			}
		} else {
			throw new Exception("List is empty please enter some numbers");
		}

		System.out.println("Average of myList is: " + sum.doubleValue() / (myList.size()));

	}

}