package com.home.test;

import java.util.List;

public class SuperobjectCollection {

	private List<SuperHero> list;

	public void AddObj(SuperHero obj) {
		list.add(obj);
	}
	
	// and provide methods such as Add, Remove, Get etc to access the underlying List.
}
