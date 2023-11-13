package com.MGS.JavaCoding;

public class String_2 {
	public static void main(String[] args) {
//  1   Given a string, return a string where for every char in the original, there are two chars.	   
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));

// 2   Return the number of times that the string "hi" appears anywhere in the given string
		System.out.println(countHi("abc hi ho")); // Output: 1
		System.out.println(countHi("ABChi hi")); // Output: 2
		System.out.println(countHi("hihi")); // Output: 2

//  3 Return true if the string "cat" and "dog" appear the same number of times in the given string.
		System.out.println(catDog("catdog")); // Output: true
		System.out.println(catDog("catcat")); // Output: false
		System.out.println(catDog("1cat1cadodog")); // Output: true

// 4 Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
		System.out.println(countCode("aaacodebbb")); // Output: 1
		System.out.println(countCode("codexxcode")); // Output: 2
		System.out.println(countCode("cozexxcope")); // Output: 2

// 5  Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.		
		System.out.println(endOther("Hiabc", "abc")); // Output: true
		System.out.println(endOther("AbC", "HiaBc")); // Output: true
		System.out.println(endOther("abc", "abXabc")); // Output: true
// 6  Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
		System.out.println(xyzThere("abcxyz")); // Output: true
		System.out.println(xyzThere("abc.xyz")); // Output: false
		System.out.println(xyzThere("xyz.abc")); // Output: true

//  7  Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
		System.out.println(bobThere("abcbob")); // Output: true
		System.out.println(bobThere("b9b")); // Output: true
		System.out.println(bobThere("bac")); // Output: false

//  8  We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
//	   there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
		System.out.println(xyBalance("aaxbby")); // Output: true
		System.out.println(xyBalance("aaxbb")); // Output: false
		System.out.println(xyBalance("yaaxbb")); // Output: false

// 9  Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
		System.out.println(mixString("abc", "xyz")); // Output: "axbycz"
		System.out.println(mixString("Hi", "There")); // Output: "HTihere"
		System.out.println(mixString("xxxx", "There")); // Output: "xTxhxexre"

// 10  Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive	
		System.out.println(repeatEnd("Hello", 3)); // Output: "llollollo"
		System.out.println(repeatEnd("Hello", 2)); // Output: "lolo"
		System.out.println(repeatEnd("Hello", 1)); // Output: "o"
// 11  Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, 
//		and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
		System.out.println(repeatFront("Chocolate", 4)); // Output: "ChocChoChC"
		System.out.println(repeatFront("Chocolate", 3)); // Output: "ChoChC"
		System.out.println(repeatFront("Ice Cream", 2)); // Output: "IcI"

// 12 Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
		System.out.println(repeatSeparator("Word", "X", 3)); // Output: "WordXWordXWord"
		System.out.println(repeatSeparator("This", "And", 2)); // Output: "ThisAndThis"
		System.out.println(repeatSeparator("This", "And", 1)); // Output: "This"

// 13  Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
		System.out.println(prefixAgain("abXYabc", 1)); // Output: true
		System.out.println(prefixAgain("abXYabc", 2)); // Output: true
		System.out.println(prefixAgain("abXYabc", 3)); // Output: false

//  14 Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks. 		
		System.out.println(xyzMiddle("AAxyzBB")); // Output: true
		System.out.println(xyzMiddle("AxyzBB")); // Output: true
		System.out.println(xyzMiddle("AxyzBBB")); // Output: false

//  15 A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
		System.out.println(getSandwich("breadjambread")); // Output: "jam"
		System.out.println(getSandwich("xxbreadjambreadyy")); // Output: "jam"
		System.out.println(getSandwich("xxbreadyy")); // Output: ""

//  16 Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
		System.out.println(sameStarChar("xy*yzz")); // Output: true
		System.out.println(sameStarChar("xy*zzz")); // Output: false
		System.out.println(sameStarChar("*xa*az")); // Output: true

//  17  Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
//		Ignore any group of fewer than 3 chars at the end.
		System.out.println(oneTwo("abc")); // Output: "bca"
		System.out.println(oneTwo("tca")); // Output: "cat"
		System.out.println(oneTwo("tcagdo")); // Output: "catdog"

//  18 	Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
		System.out.println(zipZap("zipXzap")); // Output: "zpXzp"
		System.out.println(zipZap("zopzop")); // Output: "zpzp"
		System.out.println(zipZap("zzzopzop")); // Output: "zzzpzp"

//  19  Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

		System.out.println(starOut("ab*cd")); // Output: "ad"
		System.out.println(starOut("ab**cd")); // Output: "ad"
		System.out.println(starOut("sm*eilly")); // Output: "silly"

//  20 Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.		
		System.out.println(plusOut("12xy34", "xy")); // Output: "++xy++"
		System.out.println(plusOut("12xy34", "1")); // Output: "1+++++"
		System.out.println(plusOut("12xy34xyabcxy", "xy")); // Output: "++xy++xy+++xy"

//  21 Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
//	   Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.		

		System.out.println(wordEnds("abcXY123XYijk", "XY")); // Output: "c13i"
		System.out.println(wordEnds("XY123XY", "XY")); // Output: "13"
		System.out.println(wordEnds("XY1XY", "XY")); // Output: "11"
	}


	public static String wordEnds(String str, String word) {
		int strLength = str.length();
		int wordLength = word.length();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < strLength; i++) {
			if (i + wordLength <= strLength && str.substring(i, i + wordLength).equals(word)) {
				if (i > 0) {
					result.append(str.charAt(i - 1));
				}
				if (i + wordLength < strLength) {
					result.append(str.charAt(i + wordLength));
				}
				i += wordLength - 1;
			}
		}

		return result.toString();
	}

	public static String plusOut(String str, String word) {
		int wordLength = word.length();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (i + wordLength <= str.length() && str.substring(i, i + wordLength).equals(word)) {
				result.append(word);
				i += wordLength - 1;
			} else {
				result.append('+');
			}
		}

		return result.toString();
	}

		public static String starOut(String str) {
			StringBuilder result = new StringBuilder();
			int strLength = str.length();
	
			for (int i = 0; i < strLength; i++) {
				if (str.charAt(i) == '*') {
					continue; // Skip the star.
				}
	
				if (i > 0 && str.charAt(i - 1) == '*') {
					continue; // Skip the character to the left of the star.
				}
	
				if (i < strLength - 1 && str.charAt(i + 1) == '*') {
					continue; // Skip the character to the right of the star.
				}
	
				result.append(str.charAt(i));
			}
	
			return result.toString();
		}

	public static String zipZap(String str) {
		StringBuilder result = new StringBuilder();
		int strLength = str.length();

		for (int i = 0; i < strLength; i++) {
			if (i < strLength - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				result.append("zp");
				i += 2; // Skip the next two characters (i and p).
			} else {
				result.append(str.charAt(i));
			}
		}

		return result.toString();
	}

	public static String oneTwo(String str) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length() - 2; i += 3) {
			result.append(str.charAt(i + 1));
			result.append(str.charAt(i + 2));
			result.append(str.charAt(i));
		}

		return result.toString();
	}

	public static boolean sameStarChar(String str) {
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
				return false;
			}
		}

		return true;
	}

	public static String getSandwich(String str) {
		int firstBread = str.indexOf("bread");
		int lastBread = str.lastIndexOf("bread");

		if (firstBread != -1 && lastBread != -1 && firstBread != lastBread) {
			return str.substring(firstBread + 5, lastBread);
		} else {
			return "";
		}
	}

	public static boolean xyzMiddle(String str) {
		int strLength = str.length();

		if (strLength < 3) {
			return false;
		}

		int middle = strLength / 2;

		if (strLength % 2 == 0) {
			// If the string has an even length, check for "xyz" in the middle.
			return str.substring(middle - 2, middle + 1).equals("xyz")
					|| str.substring(middle - 1, middle + 2).equals("xyz");
		} else {
			// If the string has an odd length, check for "xyz" with one character on each
			// side.
			return str.substring(middle - 1, middle + 2).equals("xyz");
		}
	}

	public static boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		int strLength = str.length();

		for (int i = n; i <= strLength - n; i++) {
			if (str.substring(i, i + n).equals(prefix)) {
				return true;
			}
		}

		return false;
	}

	public static String repeatSeparator(String word, String sep, int count) {
		if (count == 0) {
			return "";
		}

		StringBuilder result = new StringBuilder(word);

		for (int i = 1; i < count; i++) {
			result.append(sep).append(word);
		}

		return result.toString();
	}

	public static String repeatFront(String str, int n) {
		StringBuilder result = new StringBuilder();

		for (int i = n; i > 0; i--) {
			result.append(str.substring(0, i));
		}

		return result.toString();
	}

	public static String repeatEnd(String str, int n) {
		int strLength = str.length();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			result.append(str.substring(strLength - n));
		}

		return result.toString();
	}

	public static String mixString(String a, String b) {
		int minLength = Math.min(a.length(), b.length());
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < minLength; i++) {
			result.append(a.charAt(i));
			result.append(b.charAt(i));
		}
		result.append(a.substring(minLength));
		result.append(b.substring(minLength));
		return result.toString();
	}

	public static boolean xyBalance(String str) {
		boolean y = false;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == 'y') {
				y = true;
			} else if (str.charAt(i) == 'x' && !y) {
				return false;
			}
		}
		return true;
	}

	public static boolean bobThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
				return true;
			}
		}
		return false;
	}

	public static boolean xyzThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("xyz")) {
				if (i == 0 || str.charAt(i - 1) != '.') {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean endOther(String a, String b) {
		// Convert both strings to lowercase for case-insensitive comparison
		a = a.toLowerCase();
		b = b.toLowerCase();
		// Check if either string appears at the end of the other
		return a.endsWith(b) || b.endsWith(a);
	}

	public static int countCode(String str) {
		int count = 0;

		for (int i = 0; i <= str.length() - 4; i++) {
			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
				count++;
			}
		}

		return count;
	}

	public static boolean catDog(String str) {
		int catCount = 0;
		int dogCount = 0;

		for (int i = 0; i <= str.length() - 3; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				catCount++;
			}
			if (str.substring(i, i + 3).equals("dog")) {
				dogCount++;
			}
		}

		return catCount == dogCount;
	}

	public static int countHi(String s) {
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.substring(i, i + 2).equals("hi")) {
				count++;
			}
		}
		return count;
	}

	public static String doubleChar(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			result.append(c).append(c);
		}
		return result.toString();
	}

}
