package com.MGS.JavaCoding;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {

	public static void main(String[] args) {
// 1    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
		Map<String, String> testMap1 = new HashMap<>();
		testMap1.put("a", "candy");
		testMap1.put("b", "dirt");
		System.out.println(mapBully(testMap1)); // Output: {"a": "", "b": "candy"}

// 2   Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged
		Map<String, String> testMap2 = new HashMap<>();
		testMap2.put("a", "aaa");
		testMap2.put("b", "bbb");
		testMap2.put("c", "ccc");
		System.out.println(mapShare(testMap2)); // Output: {"a": "aaa", "b": "aaa"}

// 3   Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab"   
		Map<String, String> testMap3 = new HashMap<>();
		testMap3.put("a", "Hi");
		testMap3.put("b", "There");
		System.out.println(mapAB(testMap3)); // Output: {"a": "Hi", "ab": "HiThere", "b": "There"}

// 4   Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
		Map<String, String> testMap4 = new HashMap<>();
		testMap4.put("ice cream", "peanuts");
		System.out.println(topping1(testMap4)); // Output: {"bread": "butter", "ice cream": "cherry"}

// 5  Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
		Map<String, String> testMap5 = new HashMap<>();
		testMap5.put("ice cream", "cherry");
		System.out.println(topping2(testMap5)); // Output: {"yogurt": "cherry", "ice cream": "cherry"}

// 6  Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
		Map<String, String> testMap6 = new HashMap<>();
		testMap6.put("potato", "ketchup");
		System.out.println(topping3(testMap6)); // Output: {"potato": "ketchup", "fries": "ketchup"}

// 7  Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both. 
		Map<String, String> testMap7 = new HashMap<>();
		testMap7.put("a", "aaa");
		testMap7.put("b", "aaa");
		testMap7.put("c", "cake");
		System.out.println(mapAB2(testMap7)); // Output: {"c": "cake"}
		
//  8 Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.	
		Map<String, String> testMap8 = new HashMap<>();
		testMap8.put("a", "aaa");
		testMap8.put("c", "cake");
		System.out.println(mapAB3(testMap8)); // Output: {"a": "aaa", "b": "aaa", "c": "cake"}

//  9  Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
		Map<String, String> testMap9 = new HashMap<>();
	    testMap9.put("a", "aaa");
	    testMap9.put("b", "bb");
	    testMap9.put("c", "cake");
	    System.out.println(mapAB4(testMap9));  // Output: {"a": "aaa", "b": "bb", "c": "aaa"}
		
	}

	public static Map<String, String> mapAB4(Map<String, String> map) {
	    String valueA = map.get("a");
	    String valueB = map.get("b");

	    if (valueA != null && valueB != null) {
	        int lengthA = valueA.length();
	        int lengthB = valueB.length();

	        if (lengthA != lengthB) {
	            map.put("c", lengthA > lengthB ? valueA : valueB);
	        } else {
	            map.put("a", "");
	            map.put("b", "");
	        }
	    }

	    return map;
	}

	public static Map<String, String> mapAB3(Map<String, String> map) {
		if (map.containsKey("a") && !map.containsKey("b")) {
			map.put("b", map.get("a"));
		} else if (map.containsKey("b") && !map.containsKey("a")) {
			map.put("a", map.get("b"));
		}
		return map;
	}

	public static Map<String, String> mapAB2(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
			map.remove("a");
			map.remove("b");
		}
		return map;
	}

	public static Map<String, String> topping3(Map<String, String> map) {
		if (map.containsKey("potato")) {
			map.put("fries", map.get("potato"));
		}
		if (map.containsKey("salad")) {
			map.put("spinach", map.get("salad"));
		}
		return map;
	}

	public static Map<String, String> topping2(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		}
		if (map.containsKey("spinach")) {
			map.put("spinach", "nuts");
		}
		return map;
	}

	public static Map<String, String> topping1(Map<String, String> map) {
		map.put("bread", "butter");
		if (map.containsKey("ice cream")) {
			map.put("ice cream", "cherry");
		}
		return map;
	}

	public static Map<String, String> mapAB(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}
		return map;
	}

	public static Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		map.remove("c");
		return map;
	}

	public static Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}

}
