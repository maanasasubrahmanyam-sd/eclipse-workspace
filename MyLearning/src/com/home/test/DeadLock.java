package com.home.test;

public class DeadLock {

	
	  public void method1() {
	  synchronized (String.class) {
		  System.out.println(Thread.currentThread());
		  System.out.println(" method 1 String lock"); } 
	  synchronized (Integer.class) {
		  System.out.println(Thread.currentThread());
	  	  System.out.println("method 1 Integer lock"); } }
	  
	  public void method2() { synchronized (Integer.class) {
	  System.out.println(Thread.currentThread());
	  System.out.println(" method 2 Integer lock"); } synchronized (String.class) {
	  System.out.println(Thread.currentThread());
	  System.out.println("method 2 String lock"); } }
	 
	
	
	// fix deadlock
	
	/*
	 * public void method1() { synchronized (String.class) {
	 * System.out.println(Thread.currentThread());
	 * System.out.println(" method 1 String lock"); } synchronized (Integer.class) {
	 * System.out.println(Thread.currentThread());
	 * System.out.println("method 1 Integer lock"); } }
	 * 
	 * public void method2() { synchronized (String.class) {
	 * System.out.println(Thread.currentThread());
	 * System.out.println("method 2 String lock"); } synchronized (Integer.class) {
	 * System.out.println(Thread.currentThread());
	 * System.out.println(" method 2 Integer lock"); }
	 * 
	 * }
	 */

}
