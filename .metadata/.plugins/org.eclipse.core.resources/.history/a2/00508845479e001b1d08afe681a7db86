package com.home.test.map;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		try {
			int num1, num2, sum;
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter First Number: ");
			num1 = sc.nextInt();
			
			System.out.println("Enter Second Number: ");
			num2 = sc.nextInt();

			sum = num1 + num2;
			System.out.println("Sum of these numbers: " + sum);

		} catch (InputMismatchException nfe) {
			System.out.println("Please enter valid number");
		}
		
		/*
		 * Edge cases: 1. Summation of two large negative integer numbers causing an
		 * overflow 2. Summation of two large positive integer number causing an
		 * overflow
		 * 
		 * We can avoid this by using BigInteger
		 * 
		 * In future there can be a need of addition of decimal point numbers. We can
		 * accommodate this request by using BigDecimal.
		 */

	}

}
