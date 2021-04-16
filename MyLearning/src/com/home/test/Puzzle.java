package com.home.test;

public class Puzzle {

	public static void main(String[] args) {
	//	x1 5 5 5 5 5
	//	x2 5 4 4 4 4
	//	x3 5 4 3 3 3
	//	x4 5 4 3 2 2
	//	x5 5 4 3 2 1
	//	 y=1 2 3 4 5
		
		String num = "";
		for(int i = 5; i>=1; i--){
		num += i;
		//System.out.print(i);
		for(int j = 1; j<=i; j++){
		System.out.print(i);
		}
		if(i != 1){
		System.out.print("\n"+num);
		}
		}

	}

}
