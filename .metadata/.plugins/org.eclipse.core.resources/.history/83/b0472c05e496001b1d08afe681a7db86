package com.home.test.top.ques;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibbo {

	//Fibonacci number is sum of previous two Fibonacci numbers 
	//fn= fn-1+ fn-2 * first 10 
	//Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

	public static void main(String[] args) {

		System.out.println("Enter number upto which Fibonacci series to print: "); 
		int number = new Scanner(System.in).nextInt();
		int sum = 0;
		int previ = 1;
		int oneMorePrev = 0;
		List<Integer> res = new ArrayList<>();
		
		
		for( int i =0; i<=number; i++) {
			sum = oneMorePrev + previ;
			oneMorePrev = previ;
			previ = sum;
			
			System.out.println(sum);
			//res.add(sum);
		}
		
	}

}
