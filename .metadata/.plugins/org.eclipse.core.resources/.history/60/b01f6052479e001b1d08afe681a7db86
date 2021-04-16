package com.home.test.top.ques;

import java.util.Calendar;
import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year");
		int year =  new Scanner (System.in).nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year, 01, 12);
		
		int days = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		if(days > 365) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year");
		}
		
		// any year this is / 4 is a leap year!
		
		if(year % 4 == 0) {
			System.out.println("LEAPPPP year");
		}else {
			System.out.println("NNOOOOOOOO");
		}
	}

}
