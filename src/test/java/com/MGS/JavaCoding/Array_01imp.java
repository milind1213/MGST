package com.MGS.JavaCoding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array_01imp {
	public static void main(String[] args) {
		// 1. Search An Element Present in [] Array or Not
		int arr[] = { 1, 2, 3, 4, 5 };
		int target = 5;
		boolean result = searchArray(arr, target);
		System.out.println("Is Element Found In Array = " + result);
		// 2 Search An Element Present in [] [] Array amd returm the index of ELement
		int ar[][] = { { 79, 30, 50 }, { 11, 33, 22, 44 }, { 10, 20, 30, 40 }, { 100, 200 } };
		int tr = 40;
		int[] ans = searchNumber(ar, tr);
		System.out.println(" Element Index : " + Arrays.toString(ans));

		// 3. Search An Index of Element in Array
		int arr1[] = { 1, 2, 3, 4, 5, 5, 7, 9 };
		int target1 = 3;
		System.out.println(target1 + " Element found at Index = " + searchInRange(arr1, target1, 0, 4));

		// 4. Verify Character present in String or Not
		String name = "Milind";
		System.out.println("Converting String in Char Array :" + Arrays.toString(name.toCharArray()));
		Character targetChar = 'M';
		System.out.println("Is Character Present in String ? : " + searchChar(name, targetChar));

		// 5. Minimum Number from Integer [] Array
		int arr2[] = { 11, 22, 33, 4, 55, 66 };
		int min = minimumNumber(arr2);
		System.out.println("Minimum Number From Array : " + min);

		// 6 .Maximum Number from Integer [] Array
		int max = maximumNumber(arr2);
		System.out.println("Maximum Number From Array : " + max);

		// 7 . Max Number from Integer [] [] Array
		int arr3[][] = { { 79, 30, 50 }, { 11, 33, 22, 44 }, { 10, 20, 30, 40 }, { 100, 200 } };
		int maxNum = searchMaxNumber(arr3);
		System.out.println("Maximum Value [][] Array:" + maxNum);

		// 8 . Min Number from Integer [] [] Array
		int minNum = searchMinNumber(arr3);
		System.out.println("Minimum Value [][] Array:" + minNum);

		// 9 . count Number of Digits
		int a = 12234;
		System.out.println("Number of Digits = " + digits(a));

		// 10 . Find Even or Odd Number
		int num = 13;
		evenOddNumber(num);

		// 11 . Find Even or Odd Number
		boolean even = isEvenNumber(num);
		System.out.println("Is Number is Even = " + even);

		// 12 . Find Even or Odd Number
		boolean odd = isOddNumber(num);
		System.out.println("Is Number is Odd = " + odd);

		// 13 . find the Number of even Numbers from [] Array
		int nums[] = { 12, 3, 2, 6 };
		System.out.println("Find Even Number counts : " + findNumbers(nums));

		// 14. Find Max Number from three
		int a1 = 10, b1 = 20, c1 = 30;
		System.out
				.println("Maximum Number from " + a1 + " ," + b1 + " ," + c1 + " is = " + maxMinNumfromInt(a1, b1, c1));

		// 15. Fibonacci Series
		System.out.println("Fibonacci Numbers :" + fibo(9));
		// 16. Fibonacci Series
		int n = 8;
		System.out.println("Fibonacci Numbers :" + fibonacciNUmber(n));

		// 17 Number of Occurrence in integer
		int num1 = 141424;
		int occurNumber = 4;
		System.out.println("Number of Occurrence = " + numberOccurrence(num1, occurNumber));

		// 18 Reverse NUmber
		int nums1 = 13579;
		System.out.println(nums1 + " Of Reverse = " + reverseNumber(nums1));

		// 19 Printing [] [] Array in console
		int aa1[][] = { { 2, 4, 6, }, { 3, 6, 9 }, { 4, 8, 1 } };
		printConsole(aa1);
		// 20 Check if the sum of the digits of x is divisible by 3
		sumOfDigitsDevisible();
		// 21 - Number Divisible number by (3 & 5), 3, 5
		int numb = 100;
		numberDevisible(numb);
		// 22 SWAP Element An [] Array
		int arr11[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int ele1 = 7, ele2 = 2;
		swapElementsArray(arr11, ele1, ele2);
		// 23 SWAP []
		int arr12[] = { 1, 3, 4, 9, 18 };
		System.out.println("Before SWAP  = " + Arrays.toString(arr12));
		swapArry(arr1, 0, 3);
		System.out.println("After SWAP  = " + Arrays.toString(arr12));

		// 24 Maximum Number []
		int arr21[] = { 1, 3, 4, 9, 18 };
		System.out.println("Maximum Number from Array [] = " + maximumNUmber(arr21));

		// 25 Reverse Words
		String str = "I am going";
		String[] strs = str.split("\\s");
		System.out.println(str + " = " + reverseWords(strs));

		// 26 Count of Word Occurrence
		String str1 = "I am learning learning java java programming language";
		String[] strr = str1.split(" ");
		countWordOccurrence(strr);

		// 27 count Characters
		String str2 = "Milind Ghongade from Pune living in Bangalore";
		System.out.println("Number of Characters: " + countCharacter(str2));

		// 28 duplicate Character
		String str3 = "Milind";
		char[] charArray = str3.toCharArray();
		duplicateCharacter(charArray);

		// 29 Extract Characters
		String str4 = "www.milind.com";
		extractChar(str4);

		// 30 Remove Duplicate words
		String str5 = "My Name Name is is Milind Milind";
		String mg[] = str5.split(" ");
		removeDuplicateWords(mg);
		// 31 Fetch Smallest NUmber from Array

		int ab[] = { 5, 2, 8, 3, 1 };
		fetchSecondSmaleestEleement(ab);

		// 32 Fetch Coomon ELement from Array

		int ar1[] = { 1, 2, 3, 4, 5, 10 };
		int ar2[] = { 4, 5, 6, 7, 8, 10 };
		fetchCommonElement(ar1, ar2);

		// 33 Reverse Array
		int arr33[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reversesArray(arr33);

		// 34 longest String
		String arr4[] = { "Banana", "Aaple", "Avacado", "Apricost", "Papaya" };
		logestString(arr4);

	}

	static void logestString(String[] arr4) {
		int MaxLength = Arrays.stream(arr4).mapToInt(string -> arr4.length).max().orElse(0);
		System.out.println("Reverse Arrray : " + MaxLength);

	}

	static void reversesArray(int[] arr3) {
		IntStream.range(0, arr3.length / 2).forEach(i -> {
			int temp = arr3[i];
			arr3[i] = arr3[arr3.length - i - 1];
			arr3[arr3.length - i - 1] = temp;
		});

		System.out.println("Reverse Arrray : " + Arrays.toString(arr3));
	}

	static void fetchCommonElement(int[] ar1, int[] ar2) {
		List<Integer> commonELement = Arrays.stream(ar1)
				.filter(number -> Arrays.stream(ar2).anyMatch(ar2Number -> ar2Number == number)).boxed()
				.collect(Collectors.toList());
		System.out.println("CommonELement : " + commonELement);

	}

	private static void fetchSecondSmaleestEleement(int[] a) {
		int SecondSmaleestEleement = Arrays.stream(a).sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Arrays Does Not have Second Smallest NUmber"));
		System.out.println("Second  Smallest Number in Given Array is : " + SecondSmaleestEleement);
	}

	private static void removeDuplicateWords(String[] mg) {
		Set<String> mySet = new LinkedHashSet<>();
		for (String m : mg) {
			mySet.add(m);
		}
		Iterator itr = mySet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		/*
		 * List<String> list = new ArrayList<>(); for(String ar : arr){
		 * if(!list.contains(ar)){ list.add(ar); } } for(String s :list){
		 * System.out.println(s); }
		 */
	}

	public static void extractChar(String str) {
		String chars = str.substring(4, 10);
		System.out.println("FirstFour :" + chars);
		String lastChar = str.substring(str.length() - 4, str.length());
		System.out.println("LastChar :" + lastChar);
	}

	private static void duplicateCharacter(char[] charArray) {
		Map<Character, Integer> mapChar = new HashMap<>();
		for (char chars : charArray) {
			if (mapChar.containsKey(chars)) {
				int count = mapChar.get(chars);
				mapChar.put(chars, count + 1);
			} else {
				mapChar.put(chars, 1);
			}
		}
		System.out.println("Count of Character Occurrence:");
		for (Character c : mapChar.keySet()) {
			System.out.println(c + ": " + mapChar.get(c));
		}
	}

	public static int countCharacter(String str2) {
		int count = str2.length() - str2.replaceAll("i", "").length();
		return count;
	}

	private static void countWordOccurrence(String[] str) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				int count = map.get(str[i]);
				map.put(str[i], count + 1);
			} else {
				map.put(str[i], 1);
			}
		}
		System.out.println("Count of Word Occurrence :");
		for (String word : map.keySet()) {
			System.out.println(word + " : " + map.get(word));
		}
	}

	private static String reverseWords(String[] strs) {
		String rev = " ";
		for (int i = strs.length - 1; i >= 0; i--) {
			rev = rev + strs[i] + " ";
		}
		return rev;
	}

	private static int maximumNUmber(int[] arr) {
		int maxValue = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	static void swapArry(int arr1[], int index1, int index2) {
		int temp = arr1[index1];
		arr1[index1] = arr1[index2];
		arr1[index2] = temp;
	}

	private static void swapElementsArray(int[] arr, int ele1, int ele2) {
		int ind1 = -1, ind2 = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele1) {
				ind1 = i;
			} else if (arr[i] == ele2) {
				ind2 = i;
			}
		}
		if (ind1 != -1 && ind2 != -1) {
			// Swap the elements
			int temp = arr[ind1];
			arr[ind1] = arr[ind2];
			arr[ind2] = temp;
		}
		System.out.println("Array Swapping (" + ele1 + " & " + ele2 + "): " + Arrays.toString(arr));
	}

	private static void numberDevisible(int numb) {
		for (int i = 1; i <= numb; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " Number Divisible by 3 & 5 ");
			} else if (i % 3 == 0) {
				System.out.println(i + " Number Divisible by 3 ");
			}
			if (i % 5 == 0) {
				System.out.println(i + " Number Divisible by 5 ");
			} else {
				System.out.println(i);
			}
		}

	}

	private static void sumOfDigitsDevisible() {
		int num = 22;
		int sumOfDigits = 0;

		while (num != 0) {
			sumOfDigits = sumOfDigits + num % 10;
			num = num / 10;
		}
		if (sumOfDigits % 3 == 0) {
			System.out.println("The sum of the digits of X is Divisible by 3");
		} else {
			System.out.println("Not Divisible by 3");
		}
	}

	private static void printConsole(int a[][]) {
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}

	protected static int reverseNumber(int nums) {
		int rev = 0;
		while (nums != 0) {
			rev = rev * 10;
			rev = rev + nums % 10;
			nums = nums / 10;
		}
		return rev;
	}

	private static int numberOccurrence(int num, int occurNumber) {
		int count = 0;
		int rem;

		while (num > 0) {
			rem = num % 10;
			if (rem == occurNumber) {
				count++;
			}
			num = num / 10;
		}
		return count;
	}

	static int fibo(int n) {
		if (n < 2) {
			return n;
		}
		return fibo(n - 1) + fibo(n - 2);
	}

	private static int fibonacciNUmber(int n) {
		int a = 0;
		int b = 1;
		int fibo = 0;
		for (int i = 1; i <= n; i++) {
			fibo = a + b;
			b = a;
			a = fibo;
			// System.out.println(fibo);
		}
		/*
		 * while(i<=n){ fibo=a+b; b=a; a=fibo; i++; }
		 */
		return fibo;
	}

	private static int maxMinNumfromInt(int a1, int b1, int c1) {
		// 1 Using Math Method
		int ma = Math.max(c1, Math.max(a1, b1));
		System.out.println("Max Value :" + ma);
		int mi = Math.min(c1, Math.min(a1, b1));
		System.out.println("Min Value :" + mi);

		// 2 Assigning Value of Variable
		int max = a1;
		int min = a1;
		/*
		 * if (b1 > max) { max = b1; } if (c1 > max) { max = c1; } return max;
		 */

		if (b1 < min) {
			min = b1;
		}
		if (c1 < min) {
			min = c1;
		}
		return min;

		// 3 Using other Variable
		/*
		 * int max = 0; if (a1 > b1) { max = a1; } else { max = b1; } if (c1 > a1) { max
		 * = c1; } return max;
		 */
	}

	static int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	static boolean isEvenNumber(int num) {
		return num % 2 == 0;
	}

	static boolean isOddNumber(int num) {
		return num % 2 != 0;
	}

	private static void evenOddNumber(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " Number is Even");
		} else {
			System.out.println(num + " Number is Odd");
		}
	}

	static int digits(int num) {
		int counts = 0;
		while (num > 0) {
			counts++;
			num = num / 10;
		}
		return counts;
	}

	static int searchMaxNumber(int arr3[][]) {
		int max = arr3[0][0];
		for (int row = 0; row < arr3.length; row++) {
			for (int col = 0; col < arr3[row].length; col++) { // Iterate through all columns
				if (arr3[row][col] > max) {
					max = arr3[row][col];
				}
			}
		}
		return max;
	}

	static int searchMinNumber(int arr3[][]) {
		int min = arr3[0][0];
		for (int row = 0; row < arr3.length; row++) {
			for (int col = 0; col < arr3[row].length; col++) { // Iterate through all columns
				if (arr3[row][col] < min) {
					min = arr3[row][col];
				}
			}
		}
		return min;
	}

	/*
	 * private static int searchMaxNumber(int[][] arr3) { int maXNum =
	 * Integer.MIN_VALUE; for (int[] ele : arr3) { for (int element : ele) { if
	 * (element > maXNum) { maXNum = element; } } } return maXNum; }
	 */

	static int maximumNumber(int[] arr2) {
		int max = arr2[0];
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] > max) {
				max = arr2[i];
			}
		}
		return max;
	}

	static int minimumNumber(int[] arr2) {
		int min = arr2[0];
		for (int i = 1; i < arr2.length; i++) { // Start from index 1
			if (arr2[i] < min) {
				min = arr2[i];
			}
		}
		return min;
	}

	static int[] searchNumber(int ar[][], int tr) {
		for (int row = 0; row < ar.length; row++) {
			for (int col = 1; col < ar[row].length; col++) {
				if (ar[row][col] == tr) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	static boolean searchChar(String name, char target) {
		if (name.length() == 0) {
			return false;
		}
		for (int i = 0; i < name.length(); i++) {
			if (target == name.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	static int searchInRange(int[] arr1, int target1, int start, int end) {
		if (start < 0 || end >= arr1.length || start > end) {
			return -1; // Invalid indices
		}
		for (int i = start; i <= end; i++) {
			if (arr1[i] == target1) {
				return i; // Index of target found
			}
		}
		return -1; // If target is not found in the specified range
	}

	static boolean searchArray(int[] arr, int target) {
		if (arr.length == 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			if (ele == target) {
				return true;
			}
		}
		return false;
	}
}
