package com.home.test.map;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {

		boolean result = isAnagram("A man’s rag", "anagrams");
		
		if (result) {
			System.out.println("This is an anagram");
		} else {
			System.out.println("This is not an anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		if(str1.isEmpty() || str2.isEmpty()) {
			return false;
		}
		String s1 = str1.replaceAll("[^a-zA-Z0-9]", " ").replaceAll("\\s", "");  
		String s2 = str2.replaceAll("[^a-zA-Z0-9]", " ").replaceAll("\\s", "");  
		
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		
		return status;
	}
}

/*
 * package com.my.test;
 * 
 * import com.home.test.AnagramStrings; import static
 * org.junit.Assert.assertFalse; import static org.junit.Assert.assertTrue;
 * import org.junit.jupiter.api.Test;
 * 
 * public class AnagramTest {
 * 
 * @Test public void testWithKnownAnagram() { AnagramStrings str1 = new
 * AnagramStrings(); boolean result = str1.isAnagram("mary", "army");
 * assertTrue(result); }
 * 
 * @Test public void testWithKnownNonAnagram() { AnagramStrings str1 = new
 * AnagramStrings(); boolean result = str1.isAnagram("rohit", "Maanasa");
 * assertFalse(result); }
 * 
 * @Test public void testWithOneValidOneNull() { AnagramStrings str1 = new
 * AnagramStrings(); boolean result = str1.isAnagram("Army", "");
 * assertFalse(result); }
 * 
 * @Test public void testWithBothNull() { AnagramStrings str1 = new
 * AnagramStrings(); boolean result = str1.isAnagram("", "");
 * assertFalse(result); }
 * 
 * @Test public void testWithSpecialChars() { AnagramStrings str1 = new
 * AnagramStrings(); boolean result = str1.isAnagram("Army", "&^^&^*Army");
 * assertTrue(result); }
 * 
 * @Test public void testWithAlfaNumericStrings() { AnagramStrings str1 = new
 * AnagramStrings(); boolean result = str1.isAnagram("23Army", "Army23");
 * assertTrue(result); }
 * 
 * @Test public void testWithUpperAndLowerCase() { AnagramStrings str1 = new
 * AnagramStrings(); boolean result = str1.isAnagram("PolO", "oOlp");
 * assertTrue(result); } }
 */
