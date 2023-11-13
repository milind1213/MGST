package com.MGS.JavaCoding;

public class String_3 {

	public static void main(String[] args) {
//   1  Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
// 	    Note: Character.isLetter(char) tests if a char is an alphabetic letter.)	    
		System.out.println(countYZ("fez day")); // Output: 2
		System.out.println(countYZ("day fez")); // Output: 2
		System.out.println(countYZ("day fyyyz")); // Output: 2

//  2   Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
// 		You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x" 	
		System.out.println(withoutString("Hello there", "llo")); // Output: "He there"
		System.out.println(withoutString("Hello there", "e")); // Output: "Hllo thr"
		System.out.println(withoutString("Hello there", "x")); // Output: "Hello there"

//  3  	Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).	
		System.out.println(equalIsNot("This is not")); // Output: false
		System.out.println(equalIsNot("This is notnot")); // Output: true
		System.out.println(equalIsNot("noisxxnotyynotxisi")); // Output: true

//  4   We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
		System.out.println(gHappy("xxggxx")); // Output: true
		System.out.println(gHappy("xxgxx")); // Output: false
		System.out.println(gHappy("xxggyygxx")); // Output: false

//  5 We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.		
		System.out.println(countTriple("abcXXXabc")); // Output: 1
		System.out.println(countTriple("xxxabyyyycd")); // Output: 3
		System.out.println(countTriple("a")); // Output: 0

// 6   Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. 
//		Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)		
		System.out.println(sumDigits("aa1bc2d3")); // Output: 6
		System.out.println(sumDigits("aa11b33")); // Output: 8
		System.out.println(sumDigits("Chocolate")); // Output: 0

//  7  Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
		System.out.println(sameEnds("abXYab")); // Output: "ab"
		System.out.println(sameEnds("xx")); // Output: "x"
		System.out.println(sameEnds("xxx")); // Output: "x"

//  8  Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping).
//		For example, the string "abXYZba" has the mirror end "ab".
		System.out.println(mirrorEnds("abXYZba")); // Output: "ab"
		System.out.println(mirrorEnds("abca")); // Output: "a"
		System.out.println(mirrorEnds("aba")); // Output: "aba"

//  9 	Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.	
		System.out.println(maxBlock("hoopla")); // Output: 2
		System.out.println(maxBlock("abbCCCddBBBxx")); // Output: 3
		System.out.println(maxBlock("")); // Output: 0

//  10  Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
//		Integer.parseInt(string) converts a string to an int.)
		System.out.println(sumNumbers("abc123xyz")); // Output: 123
		System.out.println(sumNumbers("aa11b33")); // Output: 44
		System.out.println(sumNumbers("7 11")); // Output: 18

//  11 Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. 
//		Note: Character.isLetter(char) tests if a char is a letter.)
		System.out.println(notReplace("is test")); // Output: "is not test"
		System.out.println(notReplace("is-is")); // Output: "is not-is not"
		System.out.println(notReplace("This is right")); // Output: "This is not right"

	}

	public static String notReplace(String str) {
		StringBuilder result = new StringBuilder();
		int strLength = str.length();

		for (int i = 0; i < strLength; i++) {
			if (i + 1 < strLength && str.substring(i, i + 2).equals("is")) {
				if ((i == 0 || !Character.isLetter(str.charAt(i - 1)))
						&& (i + 2 == strLength || !Character.isLetter(str.charAt(i + 2)))) {
					result.append("is not");
					i++; // Skip the second character of "is" to avoid duplicates
				} else {
					result.append("is");
				}
			} else {
				result.append(str.charAt(i));
			}
		}

		return result.toString();
	}

	public static int sumNumbers(String str) {
		int sum = 0;
		int numberStart = -1;
		int strLength = str.length();

		for (int i = 0; i < strLength; i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (numberStart == -1) {
					numberStart = i;
				}
			} else {
				if (numberStart != -1) {
					String numberStr = str.substring(numberStart, i);
					int number = Integer.parseInt(numberStr);
					sum += number;
					numberStart = -1;
				}
			}
		}

		// Check if there's a number at the end of the string.
		if (numberStart != -1) {
			String numberStr = str.substring(numberStart);
			int number = Integer.parseInt(numberStr);
			sum += number;
		}

		return sum;
	}

	public static int maxBlock(String str) {
		int maxBlockLength = 0;
		int currentBlockLength = 1;

		if (str.length() == 0) {
			return 0;
		}

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				currentBlockLength++;
			} else {
				maxBlockLength = Math.max(maxBlockLength, currentBlockLength);
				currentBlockLength = 1;
			}
		}

		return Math.max(maxBlockLength, currentBlockLength);
	}

	public static String mirrorEnds(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
				result.append(str.charAt(i));
			} else {
				break;
			}
		}
		return result.toString();
	}

	public static String sameEnds(String str) {
		int strLength = str.length();
		int maxLength = strLength / 2;

		for (int i = maxLength; i > 0; i--) {
			String start = str.substring(0, i);
			String end = str.substring(strLength - i, strLength);

			if (start.equals(end)) {
				return start;
			}
		}

		return "";
	}

	static int sumDigits(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			if (Character.isDigit(currentChar)) {
				int digitValue = Integer.parseInt(String.valueOf(currentChar));
				sum += digitValue;
			}
		}

		return sum;
	}

	public static int countTriple(String str) {
		int count = 0;
		int strLength = str.length();

		for (int i = 0; i < strLength - 2; i++) {
			char currentChar = str.charAt(i);
			if (currentChar == str.charAt(i + 1) && currentChar == str.charAt(i + 2)) {
				count++;
			}
		}

		return count;
	}

	public static boolean gHappy(String str) {
		int strLength = str.length();

		for (int i = 0; i < strLength; i++) {
			if (str.charAt(i) == 'g') {
				if ((i > 0 && str.charAt(i - 1) == 'g') || (i < strLength - 1 && str.charAt(i + 1) == 'g')) {
					// This 'g' is happy.
				} else {
					return false; // This 'g' is not happy.
				}
			}
		}

		return true;
	}

	public static boolean equalIsNot(String str) {
		int countIs = 0;
		int countNot = 0;
		int strLength = str.length();

		for (int i = 0; i < strLength - 1; i++) {
			if (str.charAt(i) == 'i' && i + 1 < strLength && str.charAt(i + 1) == 's') {
				countIs++;
				i++;
			}
		}

		for (int i = 0; i < strLength - 2; i++) {
			if (str.charAt(i) == 'n' && i + 2 < strLength && str.substring(i, i + 3).equals("not")) {
				countNot++;
				i += 2;
			}
		}

		return countIs == countNot;
	}

	public static String withoutString(String base, String remove) {
		int baseLength = base.length();
		int removeLength = remove.length();
		StringBuilder result = new StringBuilder();
		int i = 0;

		while (i < baseLength) {
			if (i + removeLength <= baseLength && base.substring(i, i + removeLength).equalsIgnoreCase(remove)) {
				i += removeLength;
			} else {
				result.append(base.charAt(i));
				i++;
			}
		}

		return result.toString();
	}

	public static int countYZ(String str) {
		int count = 0;
		str = str.toLowerCase() + " "; // Convert to lowercase and add a space to handle the last word.

		for (int i = 0; i < str.length() - 1; i++) {
			char currentChar = str.charAt(i);
			char nextChar = str.charAt(i + 1);

			if ((currentChar == 'y' || currentChar == 'z') && !Character.isLetter(nextChar)) {
				count++;
			}
		}

		return count;
	}

}
