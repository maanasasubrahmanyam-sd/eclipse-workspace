package com.home.test.top.ques;

import java.util.HashSet;
import java.util.Set;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aa";
		String magazine = "aab";

		int length = ransomNote.length();
		int count = 0;
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < magazine.length(); i++) {
			char c = magazine.charAt(i);
			if (ransomNote.contains(Character.toString(c))) {
				count++;
				set.add(c);
			}
		}
		System.out.println(count);
		System.out.println(length);

		if (set.size() == length && stringToCharacterSet(magazine).containsAll(stringToCharacterSet(ransomNote))) {
			System.out.println("true");
		} else {

			System.out.println("false");
		}

	}

	public static Set<Character> stringToCharacterSet(String s) {
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			set.add(c);
		}
		return set;
	}

	public static boolean containsAllChars(String container, String containee) {
		return stringToCharacterSet(container).containsAll(stringToCharacterSet(containee));
	}

}
