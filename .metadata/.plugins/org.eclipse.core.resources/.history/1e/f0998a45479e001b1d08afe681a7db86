package com.home.test.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapBully {

	public static void main(String[] args) {
		// mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
		// mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
		// mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy",
		// "c": "meh"}

		HashMap<String, String> map = new HashMap<>();
		map.put("a", "candy");
		map.put("b", "dirt");
		String aValue = "";

		/*
		 * for(Map.Entry<String, String> m : myMap.entrySet()) {
		 * if(m.getKey().equals("a")) { aValue = m.getValue(); m.setValue("");
		 * 
		 * } if(m.getKey().equals("b")) { m.setValue(aValue); } }
		 * 
		 * for(Map.Entry<String, String> m : myMap.entrySet()) {
		 * System.out.println("Key " +m.getKey()+ " Value "+ m.getValue()); }
		 */

		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");

		}
		// mapShare

		// mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
		// mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
		// mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d":
		// "hi"}

		HashMap<String, String> map1 = new HashMap<>();
		map1.put("a", "aaa");
		map1.put("b", "bbb");
		map1.put("c", "ccc");

		if (map1.containsKey("a")) {
			map1.put("b", map1.get("a"));
		}
		map1.remove("c");

		// toppings

		// topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream":
		// "cherry"}
		// topping1({}) → {"bread": "butter"}
		// topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

		HashMap<String, String> map2 = new HashMap<>();
		map2.put("ice cream", "peanuts");

		if (map2.containsKey("ice cream")) {
			map2.put("ice cream", "cherry");
			map2.put("bread", "butter");
		}

		// mapAB
		// mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
		// mapAB({"a": "Hi"}) → {"a": "Hi"}
		// mapAB({"b": "There"}) → {"b": "There"}

		HashMap<String, String> map3 = new HashMap<>();
		map3.put("a", "aaa");
		map3.put("b", "bbb");
		map3.put("c", "ccc");

		if (map3.containsKey("a") && map3.containsKey("b")) {
			map3.put("	ab", map3.get("a") + map3.get("b"));
		}

		// mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c":
		// "aaa"}
		// mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c":
		// "bbb"}
		// mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

		HashMap<String, String> map4 = new HashMap<>();
		map4.put("a", "aaa");
		map4.put("b", "bb");
		map4.put("c", "cake");

		if (map.get("a") != null && map4.get("b") != null) {
			if (map4.get("a").length() > map4.get("b").length()) {
				map4.put("c", map4.get("a"));
			} else if (map4.get("b").length() > map4.get("a").length()) {
				map4.put("c", map.get("b"));
			} else {
				map4.put("a", "");
				map4.put("b", "");

			}
		}

		// if exactly one of the keys "a" or "b" has a value in the map (but not both),
		// set the other to have that same value in the map.

		if (map4.get("a") != null && (map4.get("b").isEmpty())) {
			map.put("b", map.get("a"));
		} else if (map4.get("b") != null && (map4.get("a").isEmpty())) {
			map.put("a", map.get("b"));
		}
	
		//if the keys "a" and "b" are both in the map and have equal values, remove them both.
		//mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
		//mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
		//mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
		
		HashMap<String, String> map5 = new HashMap<>();
		map5.put("a", "aa");
		map5.put("b", "aa");
		
		if(map5.get("a")!= null &&  map5.get("b") != null){
			if(map5.get("a").equals(map5.get("b"))) {
				map5.remove("a");
				map5.remove("b");
			}
		}
		
		//if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
		//mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
		//mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
		//mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
		
		HashMap<String, String> map6 = new HashMap<>();
		map6.put("a", "aa");
		map6.put("b", "aa");
		
		if(map5.get("a")!= null ||  map5.get("b") == null){
			map5.put("b", map5.get("a"));
		}
		if(map5.get("b")!= null ||  map5.get("a") == null){
			map5.put("a", map5.get("b"));
		}
		
		
	}
	
}
