package com.home.test;

import junit.framework.TestCase;

public class StringAnagramTest extends TestCase {

	public void testWithKnownAnagram() {
		AnagramStrings str1 = new AnagramStrings();
		boolean result = str1.isAnagram("mary", "army");
		assertTrue(result);
	}

}
