package com.MGS.JavaCoding;

public class String_1 {

	public static void main(String[] args) {

// 1 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
		System.out.println(helloName("bob"));

// 2 Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
		System.out.println(makeAbba("Hi", "Bye"));

// 3 The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, 
//	 create the HTML string with tags around the word, e.g. "<i>Yay</i>".
		System.out.println(makeTags("i", "Yay"));

// 4  Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.		
		String a = "<<>>", b = "Yay";
		System.out.println(makeOutWord(a, b));

// 5  Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.		
		String a1 = "MilindGM";
		System.out.println(extraEnd(a1));

// 6  Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
//	    Note that str.length() returns the length of a string.
		System.out.println(firstTwo("MIlind"));

// 7  Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
		System.out.println(firstHalf("Milind Ghongde"));

// 8  Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
		System.out.println(withoutEnd("AMilindB"));

// 9  Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
		System.out.println(comboString("123", "ABCD"));

// 10  Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
		System.out.println(nonStart("Hello", "There")); // output : ellohere

// 11  Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.    
		System.out.println(left2("Hello")); // Output → "lloHe"

// 12  Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
		System.out.println(right2("Hello")); // Output → "loHel"

// 13  Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
		System.out.println(theEnd("Hello", true)); // Output → H

// 14   Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
		System.out.println(withouEnd2("Hello")); // Output → ello

// 15  Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
		System.out.println(middleTwo("MiLInd"));// Output → "LI"

// 16  Given a string, return true if it ends in "ly".
		System.out.println(endsnd("MiLInd")); // → true

// 17   Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n
		System.out.println(nTwice("Hello", 2)); // OutPut : → "Helo" Front char-2 & Back Char-2
		
// 18   Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars.
//		The string length will be at least 2.
		System.out.println(twoChar("MiLInd",0)); // → twoChar("java", 0) → "MI"
		System.out.println(twoChar("MiLInd",2)); // → twoChar("java", 2) → "LI"
		
// 19   Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.		
		System.out.println(middleThree("Candy"));    // Output: "and"
		System.out.println(middleThree("and"));      // Output: "and"

// 20   Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
		System.out.println(hasBad("badxx"));   // Output: true
		System.out.println(hasBad("xbadxx"));  // Output: true

//  21  Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
		System.out.println(atFirst("h"));  // Output: he 
		
//  22  Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
		System.out.println(lastChars("last", "chars")); // Output: "ls"
		System.out.println(lastChars("yo", "java")); // Output: "ya"
		System.out.println(lastChars("hi", "")); // Output: "h@"
		
// 23   Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat"
	    System.out.println(conCat("abc", "cat"));	// conCat("abc", "cat") → "abcat"
		
	    
// 24   Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".  	    
	    System.out.println(lastTwo("coding"));	//lastTwo("coding") → "codign
	    
	    
//  25 	Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string. 
	    System.out.println(seeColor("redxx")); // seeColor("redxx") → "red"
	    System.out.println(seeColor("xxred")); //  seeColor("xxred") → ""

//  26  Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".	   
	    System.out.println(frontAgain("edited")); //  frontAgain("edited") → true
	    System.out.println(frontAgain("edit")); //  frontAgain("edit") → false

//  27  Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.	    
	    System.out.println(minCat("Hello","Hi"));  // minCat("Hello", "Hi") returns "loHi"
	    
//  28  Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
        System.out.println(extraFront("Hello")); //extraFront("Hello") returns "HeHeHe"
	
//  29  Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
        System.out.println(without2("HelloHe"));  // without2("HelloHe") returns "lloHe"
        
//  30  Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
        System.out.println(deFront("HelloHe")); // deFront("Hello") returns "llo"

//  31 Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or
//      otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
        System.out.println(startWord("hippo", "hi")); //startWord("hippo", "hi") returns "hi"
        
//  32 Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.       
        System.out.println(withoutX("xHix")); //   withoutX("xHix") → "Hi"
        System.out.println(withoutX("xHi"));  // withoutX("xHi")    → "Hi"
        System.out.println(withoutX("Hxix")); // withoutX("Hxix")   → "Hxi"

//  33 Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.      
        System.out.println(withoutX2("Hxix")) ;// withoutX2("xHi") → "Hi"
        
// 
        
        
	}  
	
	public static String withoutX2(String str) {
	    if (str.length() >= 2) {
	        if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
	            return str.substring(2);
	        } else if (str.charAt(0) == 'x') {
	            return str.substring(1);
	        } else if (str.charAt(1) == 'x') {
	            return str.charAt(0) + str.substring(2);
	        }
	    } else if (str.length() == 1 && str.charAt(0) == 'x') {
	        return "";
	    }
	    return str;
	}

	public static String withoutX(String str) {
	    if (str.length() > 0 && str.charAt(0) == 'x') {
	        str = str.substring(1);
	    }
	    if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
	        str = str.substring(0, str.length() - 1);
	    }
	    return str;
	}
 
	public static  String startWord(String str, String word) {
	    if (str.length() == 0) {
	        return "";
	    }
	    if (str.length() < word.length()) {
	        return "";
	    }

	    if (str.substring(1, word.length()).equals(word.substring(1))) {
	        return str.substring(0, word.length());
	    }

	    return "";
	}
	
	public  static String deFront(String str) {
	    if (str.length() < 2) {
	        return "";
	    }
	    
	    StringBuilder result = new StringBuilder();
	    
	    if (str.charAt(0) == 'a') {
	        result.append('a');
	    }
	    
	    if (str.charAt(1) == 'b') {
	        result.append('b');
	    }
	    
	    result.append(str.substring(2));
	    
	    return result.toString();
	}

	
	public static  String without2(String str) {
	    int length = str.length();
	    
	    if (length >= 2 && str.substring(0, 2).equals(str.substring(length - 2))) {
	        return str.substring(2);
	    } else {
	        return str;
	    }
	}

	
	
	
	public static  String extraFront(String str) {
	    if (str.length() < 2) {
	        return str + str + str;
	    } else {
	        String firstTwo = str.substring(0, 2);
	        return firstTwo + firstTwo + firstTwo;
	    }
	}

	public static String minCat(String a, String b) {
	    int aLength = a.length();
	    int bLength = b.length();
	    
	    // Determine the minimum length between the two strings
	    int minLength = Math.min(aLength, bLength);
	    
	    // Return the concatenation of the substrings with the minimum length
	    return a.substring(aLength - minLength) + b.substring(bLength - minLength);
	}

	
	public static boolean frontAgain(String str) {
	    int length = str.length();
	    
	    if (length >= 2) {
	        String firstTwo = str.substring(0, 2);
	        String lastTwo = str.substring(length - 2);
	        return firstTwo.equals(lastTwo);
	    }
	    
	    return false;
	}

	public static  String seeColor(String str) {
	    if (str.startsWith("red")) {
	        return "red";
	    } else if (str.startsWith("blue")) {
	        return "blue";
	    }
	    return "";
	}

	
	public static String lastTwo(String str) {
	    int length = str.length();
	    
	    if (length < 2) {
	        return str; // Return the string as is if it has 0 or 1 characters
	    }
	    
	    char secondToLastChar = str.charAt(length - 2);
	    char lastChar = str.charAt(length - 1);
	    
	    // Swap the last two characters
	    return str.substring(0, length - 2) + lastChar + secondToLastChar;
	}

	public static String conCat(String a, String b) {
	    if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
	        return a + b.substring(1);
	    }
	    return a + b;
	}

	public static  String lastChars(String a, String b) {
	    char first = (a.length() > 0) ? a.charAt(0) : '@';
	    char last = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';
	    
	    return Character.toString(first) + Character.toString(last);
	}

	
	public static String atFirst(String str) {
	    int length = str.length();
	    if (length >= 2) {
	        return str.substring(0, 2);
	    } else if (length == 1) {
	        return str + "@";
	    } else {
	        return "@@";
	    }
	}

	
	public static  boolean hasBad(String str) {
		  if (str == null || str.length() < 3) {
		    return false;
		  }
		  return str.startsWith("bad") || (str.length() >= 4 && str.substring(1, 4).equals("bad"));
		}


	
	public static  String middleThree(String str) {
	    int length = str.length();
	    int middleIndex = length / 2;
	    // Use the middleIndex as the starting point and get the next 3 characters
	    return str.substring(middleIndex-1, middleIndex + 2);
	}

	public static String twoChar(String str,int index ) {
	    if (index >= 0 && index + 2 <= str.length()) {
	        return str.substring(index, index + 2);
	    } else {
	        return str.substring(0, 2); // Use the first 2 characters if the index is too big or too small
	    }
	}

	public static String nTwice(String str, int n) {
		int length = str.length();
		// Check if the string length is at least n
		if (length >= n) {
			String firstNChars = str.substring(0, n);
			String lastNChars = str.substring(length - n);
			return firstNChars + lastNChars;
		} else {
			return str; // Return the entire string if its length is less than n
		}
	}

	private static boolean endsnd(String str) {
		return str.endsWith("nd");
	}

	private static String middleTwo(String str) {
		int len = str.length();
		int midIndex = len / 2;
		return str.substring(midIndex - 1, midIndex + 1);
	}

	private static String withouEnd2(String str) {
		if (str.length() <= 2) {
			return "";
		}
		return str.substring(1, str.length() - 1);
	}

	public static String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1); // Return the first character if front is true
		} else {
			return str.substring(str.length() - 1); // Return the last character if front is false
		}
	}

	private static String right2(String str) {
		String l = str.substring(str.length() - 2);
		String f = str.substring(0, str.length() - 2);
		return l + f;
	}

	private static String left2(String str) {
		if (str.length() > 2) {
			String a = str.substring(0, 2);
			String b = str.substring(2, str.length());
			return b + a;
		}
		return str;
	}

	private static String nonStart(String a, String b) {
		String x = a.substring(1);
		String y = b.substring(1);
		return x.concat(y);
		// return x+y;
	}

	public static String comboString(String a, String b) {
		if (a.length() > b.length()) {
			return b + a + b;
		} else {
			return a + b + a;
		}
	}

	public static String withoutEnd(String str) {
		int len = str.length();
		if (len >= 2) {
			return str.substring(1, len - 1);
		}

		return str;
	}

	public static String firstHalf(String str) {
		int length = str.length();
		int halfLength = length / 2;
		return str.substring(0, halfLength);
	}

	public static String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		} else {
			return str.substring(0, 2);
		}
	}

	public static String extraEnd(String str) {
		String st = str.substring(str.length() - 2, str.length());
		return st + st + st;
	}

	public static String makeOutWord(String out, String word) {
		String f = out.substring(0, 2);
		String l = out.substring(2, 4);
		return f + word + l;
	}

	public static String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public static String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public static String helloName(String name) {
		String a = "Hello ";
		return a + name + "!";
	}

}
