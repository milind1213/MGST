package com.MGS.JavaCoding;

import java.util.Arrays;

public class Array_1 {

	public static void main(String[] args) {
//   1) Given an array of , return true if 6 appears as either the first or last element in the array. The array will be length 1 or more. 
		int[] nums = { 3, 2, 7, 4, 6 };
		System.out.print(firstOrLast6(nums));

//   2) Given an array of , return true if the array is length 1 or more, and the first element and the last element are equal. 
		int[] arr = { 1, 4, 6, 3, 1 };
		System.out.println(sameFirstLast(arr));

//   3) Return an  array length 3 containing the first 3 digits of pi, {3, 1, 4}.
		System.out.println(makeArray());

//   4) Given 2 arrays of a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.     
		int a[] = { 1, 3, 4, 5, 9 };
		int[] b = { 1, 4, 2, 6, 9 };
		System.out.println(commonEnd(a, b));

//    5)  Given an array  length 3, return the sum of all the elements.
		int[] a1 = { 2, 4, 6 };
		System.out.println(sumElements(a1));

//    6) Given an array of  length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
		int[] a2 = { 30, 10, 20 };
		System.out.println(Arrays.toString(rotatedLeft(a2)));

//    7) Given an array of length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
		int[] a3 = { 30, 20, 10 };
		String ans = Arrays.toString(reverseArray(a3));
		System.out.println(ans);

//     8) Given array of length 3,figure out which is larger,the first or last element in the array, and set all the other elements to be that value. Return the changed array.
		int[] a4 = { 12, 22, 30 };
		System.out.println(Arrays.toString(maxEnd(a4)));

//	   9) Given an array , return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
		int[] a5 = { 11, 11, 32 };
		System.out.println(sum2(a5));

//     10) Given 2 arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
		int[] a6 = { 2, 4, 6 };
		int[] a7 = { 3, 6, 9 };
		System.out.println(Arrays.toString(middleWay(a6, a7)));

//     11) Given an array , return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
		int[] a8 = { 200, 400, 600 };
		System.out.println(Arrays.toString(makeEnds(a8)));

//     12)  Given an int array length 2, return true if it contains a 22 or a 3.	
		int a11[] = { 11, 22 };
		System.out.println(has23(a11));

//     13) 	Given an  array length 2, return true if it does not contain a 2 or 3.
		System.out.println(hasNot23(a11));

//     14  Given an array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. 
//		Note: by default, a new int array contains all 0's. makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
		int[] a12 = { 12, 24, 42 };
		System.out.println(Arrays.toString(makeLast(a12)));

//     15 Given an  array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
		int[] ar1 = { 2, 2 };
		System.out.println(double23(ar1));

//     16 Given an array length 3, if there is a 2 in the array immediately followed
//      by a 3, set the 3 element to 0. Return the changed array. fix23([1, 2, 3]) → [1, 2, 0]
		int[] ar2 = { 2, 2, 3 };
		System.out.println(Arrays.toString(fix23(ar2)));

//     17  Start with 2  arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
		int[] ar3 = { 1, 3, 4, 6, 7 };
		int[] ar4 = { 4, 6, 78, 9, 0 };
		int ans1 = start1(ar3, ar4);
		System.out.println(ans1);

//      18  Start with 2 arrays, a and b, each length 2. Consider the sum of the values in each array.
//	    Return the array which has the largest sum. In event of a tie, return a.
		int[] x = { 10, 10 };
		int[] y = { 15, 15 };
		System.out.print(Arrays.toString(biggerTwo(x, y)));

//		19 Given an array of even length, return a new array length 2 containing the middle two elements from the original array.
//		The original array will be length 2 or more.
		int[] x1 = { 12, 24, 36, 48, 60, 34 };
		System.out.println(Arrays.toString(makeMiddleArray(x1)));

//      20 Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
		int[] ab = { 12, 22 };
		int[] ba = { 12, 45 };
		System.out.println(Arrays.toString(plusTwo(ab, ba)));

//      21 Given an array, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
		int[] num = { 2, 4, 7, 5, 3, 3 };
		System.out.println(Arrays.toString(swapEnds(num)));

//	 	22 Given an array  of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
		int[] mid = { 1, 3, 4, 6, 8, 9, 6 };
		System.out.println(Arrays.toString(midThree(mid)));

//      23 Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.       
		int[] tr = { 1, 7, 3, 1, 5 };
		System.out.print(maxTriple(tr));
//      24  Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.     
		int trs[] = { 3, 1, 4, 1, 5 };
		System.out.println(Arrays.toString(frontPiece(trs)));

//      25  Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, 
//       but there will be 2 or more elements available between the 2 arrays.    
		int[] str1 = { 4, 5 };
		int[] str2 = { 1, 2, 3 };
		System.out.println(Arrays.toString(make2(str1, str2)));

//      26  Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
		int[] er = { 2, 4, 7 };
		int[] rt = { 5, 6, 7, 9, 6 };
		System.out.println(Arrays.toString(front11(er, rt)));
	}

	public static int[] front11(int[] a, int[] b) {
		// Check if both arrays are non-empty
		if (a.length > 0 && b.length > 0) {
			return new int[] { a[0], b[0] };
		}
		// Check if only the first array is non-empty
		else if (a.length > 0) {
			return new int[] { a[0] };
		}
		// Check if only the second array is non-empty
		else if (b.length > 0) {
			return new int[] { b[0] };
		}
		// Both arrays are empty, return an empty array
		return new int[] {};
	}

	public static int[] make2(int[] a, int[] b) {
		int[] newArray = new int[2];

		if (a.length >= 2) {
			newArray[0] = a[0];
			newArray[1] = a[1];
		} else if (a.length == 1) {
			newArray[0] = a[0];
			newArray[1] = b[0];
		} else {
			newArray[0] = b[0];
			newArray[1] = b[1];
		}

		return newArray;
	}

	public static int[] frontPiece(int[] nums) {
		if (nums.length < 2) {
			return nums;
		}

		int[] NewArray = new int[2];
		NewArray[0] = nums[0];
		NewArray[1] = nums[1];

		return NewArray;
	}

	public static int maxTriple(int[] nums) {
		int first = nums[0];
		int middle = nums[nums.length / 2];
		int last = nums[nums.length - 1];
		int max = Math.max(Math.max(first, middle), last);
		return max;
	}

	public static int[] midThree(int[] nums) {
		int[] newArray = new int[3];
		newArray[0] = nums[nums.length / 2 - 1];
		newArray[1] = nums[nums.length / 2];
		newArray[2] = nums[nums.length / 2 + 1];
		return newArray;
	}

	private static int[] swapEnds(int[] nums) {
		if (nums.length >= 1) {
			int firstElement = nums[0];
			int lastElement = nums[nums.length - 1];
			nums[0] = lastElement;
			nums[nums.length - 1] = firstElement;
		}
		return nums;
	}

	public static int[] plusTwo(int[] a, int[] b) {
		int[] newArray = new int[4];
		newArray[0] = a[0];
		newArray[1] = a[1];
		newArray[2] = b[0];
		newArray[3] = b[1];
		return newArray;
	}

	private static int[] makeMiddleArray(int[] nums) {
		int middle = nums.length / 2;
		int[] result = { nums[middle - 1], nums[middle] };
		return result;
	}

	public static int[] biggerTwo(int[] a, int[] b) {
		int sumA = a[0] + a[1];
		int sumB = b[0] + b[1];

		if (sumB > sumA) {
			return b;
		} else {
			return a;
		}
	}

	public static int start1(int[] a, int[] b) {
		int count = 0;
		for (int[] array : new int[][] { a, b }) {
			if (array.length > 0 && array[0] == 1) {
				count++;
			}
		}
		return count;

		/*
		 * if (a.length > 0 && a[0] == 1) { count++; } if (b.length > 0 && b[0] == 1) {
		 * count++; } return count;
		 */
	}

	public static int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
		}
		if (nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
		}
		return nums;
	}

	public static boolean double23(int[] nums) {
		if (nums.length == 2 && (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3)) {
			return true;
		}
		return false;
	}

	private static int[] makeLast(int[] num) {
		int[] newArray = new int[num.length * 2]; // Create a new array with double the length
		if (num.length > 0) {
			newArray[newArray.length - 1] = num[num.length - 1]; // Set the last element
		}
		return newArray;
	}

	private static boolean hasNot23(int[] num) {
		if (num.length == 2) {
			for (int i = 0; i < num.length; i++) {
				if (num[i] == 3 || num[i] == 2) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean has23(int[] num) {
		if (num.length == 2) {
			for (int i = 0; i < num.length; i++) {
				if (num[i] == 22 || num[i] == 3) {
					return true;
				}
			}
		}
		return false;
	}

	private static int[] makeEnds(int[] num) {
		int[] newArray = new int[2];
		if (num.length >= 1) {
			newArray[0] = num[0];
			newArray[1] = num[num.length - 1];
		}
		return newArray;
	}

	private static int[] middleWay(int[] a, int[] b) {
		int[] newArray = new int[2];
		newArray[0] = a[1];
		newArray[1] = b[1];
		return newArray;
	}

	public static int sum2(int[] nums) {
		if (nums.length >= 2) {
			return nums[0] + nums[1];
		} else if (nums.length == 1) {
			return nums[0];
		} else {
			return 0;
		}
	}

	private static int[] maxEnd(int[] num) {
		int max = Math.max(num[0], num[2]);
		for (int i = 0; i < 3; i++) {
			num[i] = max;
		}
		return num;

		// 2 Approach
		/*
		 * public int[] maxEnd3(int[] nums) { int max = Math.max(nums[0], nums[2]); //
		 * Compare the first and last elements nums[0] = max; nums[1] = max; nums[2] =
		 * max; return nums;
		 */

	}

	private static int[] reverseArray(int[] num) {
		int[] reverseArrays = new int[3];
		reverseArrays[0] = num[2];
		reverseArrays[1] = num[1];
		reverseArrays[2] = num[0];
		return reverseArrays;
	}

	private static int[] rotatedLeft(int[] num) {
		int[] rotatedArray = new int[3];
		rotatedArray[0] = num[1];
		rotatedArray[1] = num[2];
		rotatedArray[2] = num[0];
		return rotatedArray;
	}

	private static int sumElements(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}

	private static boolean commonEnd(int[] a, int[] b) {
		if (a.length >= 1 && b.length >= 1) {
			if (a[0] == b[0] && a[a.length - 1] == b[b.length - 1]) {
				return true;
			}
		}
		return true;
	}

	private static int[] makeArray() {
		int[] piArray = { 3, 4, 2 };
		return piArray;
	}

	private static boolean sameFirstLast(int[] arr) {
		if (arr.length > 1) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[0] == arr[i] && arr[arr.length - 1] == arr[i]) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean firstOrLast6(int[] nums) {
		if (nums.length > 0) {
			if (nums[0] == 6 || nums[nums.length - 1] == 6) {
				return true;
			}
		}
		return false;
	}
	
	

}
