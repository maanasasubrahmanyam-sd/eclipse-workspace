package com.home.test;

public class EvenOdd {

	public static void main(String[] args) {

	//   8 4 2 1
	//1  0 0 0 1
    //2  0 0 1 0
	//3  0 0 1 1
	//4  0 1 0 0
	//5  0 1 0 1
	// pattern is odd numbers 1's are 1 even number 1's are 0
		
		int n = 8;
		
		int result = n & 1;
		
		if ( result == 0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}

}
