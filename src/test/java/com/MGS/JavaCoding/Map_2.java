package com.MGS.JavaCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map_2 {

	public static void main(String[] args) {
//  1  Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.
		String[] test1 = { "a", "b", "a", "b" };
		System.out.println(word0(test1)); // Output: {"a": 0, "b": 0}

		String[] test2 = { "a", "b", "a", "c", "b" };
		System.out.println(word0(test2)); // Output: {"a": 0, "b": 0, "c": 0}

// 2   Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.	
		String[] test3 = { "a", "bb", "a", "bb" };
		System.out.println(wordLen(test3)); // Output: {"bb": 2, "a": 1}

// 3    Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
		String[] test4 = { "code", "bug" };
		System.out.println(pairs(test4)); // Output: {"b": "g", "c": "e"}

//  4   The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
		String[] test5 = { "a", "b", "a", "c", "b" };
		System.out.println(wordCount(test5)); // Output: {"a": 2, "b": 2, "c": 1}

//  5   Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
		String[] test6 = { "salt", "tea", "soda", "toast" };
		System.out.println(firstChar(test6)); // Output: {"s": "saltsoda", "t": "teatoast"}

		String[] test7 = { "aa", "bb", "cc", "aAA", "cCC", "d" };
		System.out.println(firstChar(test7)); // Output: {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}

		String[] test8 = {};
		System.out.println(firstChar(test8)); // Output: {}

//  6  Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
		String[] test11 = { "a", "b", "a" };
		System.out.println(wordAppend(test11)); // Output: "a"

		String[] test12 = { "a", "b", "a", "c", "a", "d", "a" };
		System.out.println(wordAppend(test12)); // Output: "aa"

//  7  	Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array. 
		String[] test13 = { "a", "b", "a", "c", "b" };
		System.out.println(wordMultiple(test13)); // Output: {"a": true, "b": true, "c": false}

//  8  We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
		String[] test14 = { "ab", "ac" };
		System.out.println(Arrays.toString(allSwap(test14))); // Output: ["ac", "ab"]

//  9  We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, 
//	   swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
		String[] test15 = { "ab", "ac" };
		System.out.println(Arrays.toString(firstSwap(test15))); // Output: ["ac", "ab"]
	}

	public static String[] firstSwap(String[] strings) {
		Map<Character, Integer> firstCharIndex = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			char firstChar = strings[i].charAt(0);

			if (firstCharIndex.containsKey(firstChar)) {
				int swapIndex = firstCharIndex.get(firstChar);
				if (swapIndex != -1) {
					String temp = strings[i];
					strings[i] = strings[swapIndex];
					strings[swapIndex] = temp;
					firstCharIndex.put(firstChar, -1); // Disable further swaps for this character
				}
			} else {
				firstCharIndex.put(firstChar, i);
			}
		}

		return strings;
	}

	public static String[] allSwap(String[] strings) {
		Map<Character, Integer> firstCharIndex = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			char firstChar = strings[i].charAt(0);

			if (firstCharIndex.containsKey(firstChar)) {
				int swapIndex = firstCharIndex.get(firstChar);
				String temp = strings[i];
				strings[i] = strings[swapIndex];
				strings[swapIndex] = temp;
				firstCharIndex.remove(firstChar);
			} else {
				firstCharIndex.put(firstChar, i);
			}
		}

		return strings;
	}

	public static Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> result = new HashMap<>();
		Map<String, Integer> countMap = new HashMap<>();

		for (String str : strings) {
			countMap.put(str, countMap.getOrDefault(str, 0) + 1);
		}

		for (String str : countMap.keySet()) {
			result.put(str, countMap.get(str) >= 2);
		}

		return result;
	}

	public static String wordAppend(String[] strings) {
		StringBuilder result = new StringBuilder();
		Map<String, Integer> countMap = new HashMap<>();

		for (String str : strings) {
			if (countMap.containsKey(str)) {
				int count = countMap.get(str);
				if (count % 2 == 1) {
					result.append(str);
				}
				countMap.put(str, count + 1);
			} else {
				countMap.put(str, 1);
			}
		}

		return result.toString();
	}

	public static Map<String, String> firstChar(String[] strings) {
		Map<String, String> result = new HashMap<>();

		for (String str : strings) {
			String firstChar = str.substring(0, 1);
			if (result.containsKey(firstChar)) {
				result.put(firstChar, result.get(firstChar) + str);
			} else {
				result.put(firstChar, str);
			}
		}

		return result;
	}

	public static Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> result = new HashMap<>();

		for (String str : strings) {
			if (result.containsKey(str)) {
				result.put(str, result.get(str) + 1);
			} else {
				result.put(str, 1);
			}
		}

		return result;
	}

	public static Map<String, String> pairs(String[] strings) {
		Map<String, String> result = new HashMap<>();

		for (String str : strings) {
			if (str.length() > 0) {
				result.put(str.substring(0, 1), str.substring(str.length() - 1));
			}
		}

		return result;
	}

	public static Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> result = new HashMap<>();

		for (String str : strings) {
			result.put(str, str.length());
		}

		return result;
	}

	public static Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> result = new HashMap<>();

		for (String str : strings) {
			result.put(str, 0);
		}

		return result;
	}

}
