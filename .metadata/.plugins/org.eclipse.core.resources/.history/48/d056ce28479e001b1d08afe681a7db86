package com.home.prerp.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class SubstringConcatenationofAllWords {

	public static void main(String[] args) {

		// Input: s = "barfoothefoobarman", words = ["foo","bar"]
		// Output: [0,9]

		String s = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
		String[] words = new String[] { "fooo","barr","wing","ding","wing"};
		System.out.println(s);
		List<Integer> res = subStringConcat(s, words);
		System.out.println(res.toString());

	}

	private static List<Integer> subStringConcat(String s, String[] words) {
		int size = 0;
		int noOfString = words.length;
		List<Integer> res = new ArrayList<>();

		Map<String, Integer> wordMap = new HashMap<>();		
		
		for (String s1 : words) {
			size = s1.length();
			if(wordMap.containsKey(s1)) {
				wordMap.put(s1, wordMap.get(s1)+1);
			}else {
				wordMap.put(s1, 1);
			}
		}
		System.out.println(
				wordMap.toString() + "size of each String is:" + size + " no. of string in arr: " + noOfString);

		int i = 0;
		int j = size * noOfString;
		Map<String, Integer>  map = new HashMap<>();
		while (j < s.length()) {

			String subStr = s.substring(i, j);
			System.out.println("i " + i + " j " + j + " subString:" + subStr);
			map = addToMap(subStr, size, noOfString);
			System.out.println(map.toString());
			
			boolean equal = map.equals(wordMap);

			if (equal) {
				System.out.println("map is equal got ans");
				res.add(i);
				j = j + size;
				i = i + size;
				map.clear();
			} else {
				i = i + size;
				j = j + size;
			}

			while (j == s.length() && i < s.length()) {
				subStr = s.substring(i, j);
				map = addToMap(subStr, size, noOfString);

				//values1 = new HashSet<>(map.values());
				equal = map.equals(wordMap);

				if (equal) {
					res.add(i);
					i = i + size;
					map.clear();
				} else {
					i = i + size;
				}
			}
		}

		return res;
	}

	public static List<String> splitEqually(String text, int size) {
		List<String> ret = new ArrayList<String>((text.length() + size - 1) / size);

		for (int start = 0; start < text.length(); start += size) {
			ret.add(text.substring(start, Math.min(text.length(), start + size)));
		}
		return ret;
	}

	private static Map<String, Integer> addToMap(String subStr, int size, int noOfString) {
		Map<String, Integer> map = new HashMap<>();
		List<String> s = splitEqually(subStr, size);

		Map<String, Integer> wordMap = new ConcurrentHashMap<>();
		for (String sub : s) {
			if(wordMap.containsKey(sub)) {
				wordMap.put(sub, wordMap.get(sub)+1);
			}else {
				wordMap.put(sub, 1);
			}
		}
		System.out.println("Map from string: " + map.toString());
		return wordMap;
	}

}
