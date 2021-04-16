package com.home.test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		System.out.println("Enter a number to see if it is a prime number or not");
		int num =  new Scanner(System.in).nextInt();
		boolean flag = false;
		
		for(int i =2; i <= num -1; i++) {
			
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Give Number is a Prime Number");
		}else {
			System.out.println("Not A Prime Number");
		}
	}
}
