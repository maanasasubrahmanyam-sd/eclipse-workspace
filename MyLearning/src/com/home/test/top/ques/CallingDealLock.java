package com.home.test.top.ques;

public class CallingDealLock implements Runnable{

	public static void main(String[] args) {
		CallingDealLock dk = new CallingDealLock();

		Thread t1 = new Thread(dk);
		t1.setName("maanasa");
		t1.start();
		
		Thread t2 = new Thread(dk);
		t2.setName("rohit");
		t2.start();
		
		
	}

	@Override
	public void run() {
		System.out.println("Thread running");
		DeadLock lock1 = new DeadLock();
		
		lock1.method1();
		lock1.method2();
	}

}
