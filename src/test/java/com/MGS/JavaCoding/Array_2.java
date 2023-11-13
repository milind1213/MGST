package com.MGS.JavaCoding;

import java.util.Arrays;

public class Array_2 {

	public static void main(String[] args) {

//  1   Return the number of even  in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
		int arr[] = { 1, 5, 3, 6, 4, 8, 12 };
		System.out.println(countEvens(arr));

//  2   Given an array length 1 or more of , return the difference between the largest and smallest values in the array.
//	    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values		
		int arr1[] = { 1, 5, 3, 6, 4, 8, 12 };
		System.out.println(bigDiff(arr1));

//  3   Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
//	    except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. 
//	    Use int division to produce the final average. You may assume that the array is length 3 or more
		int[] cenArrat = { 23, 14, 16, 17, 16 };
		System.out.println(centeredAverage(cenArrat));

//  4   Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 
		int num[] = { 1, 2, 4, 13, 1, 13 };
		System.out.println(sum13(num));

//  5   Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 
//	    (every 6 will be followed by at least one 7). Return 0 for no numbers.   [1, 1, 6, 7, 2]-> 4 
		int[] ar = { 1, 6, 2, 2, 7, 1, 6, 99, 99, 7 };
		System.out.println(sum67(ar));
//  6   Given an array of ints, return true if the array contains a 2 next to a 2 somewhere. [1, 2, 2] → true	 
		int[] ars = {};
		System.out.println(has22(ars));

//  7   Given an array of ints, return true if the array contains No 1's and NO 3's. 
		int[] arf = { 2, 7, 2, 8 };
		System.out.println(lucky13(arf));

//  8   Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
		int[] sum2 = { 2, 3, 2, 2, 4, 2 };
		System.out.println(sum28(sum2));

//  9   Given an array of ints, return true if the number of 1's is greater than the number of 4's  ---[1, 4, 1]→ true , [1, 4, 4]) → false 		
		int[] n = { 1, 3, 5, 1, 4, 2, 4, 1 };
		System.out.println(more14(n));

//  10  Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length] 

		int[] nmore = { 0, 1, 2, 3 };
		System.out.println(more14(nmore));

// 11   Given an array of ints, return true if every element is a 1 or a 4.		
		System.out.println(only14(new int[] { 1, 4, 1, 4 })); // true

// 12   Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. 
//      N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. 
//	    The syntax to make a new string array is: new String[desired_length]
		String[] result2 = fizzArray2(10);
		System.out.println(Arrays.toString(result2));

//  13  Given an array of ints, return true if it contains no 1's or it contains no 4's.
		System.out.println(no14(new int[] { 1, 2, 3 })); // True
		System.out.println(no14(new int[] { 1, 2, 3, 4 })); // False

//  14  We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, 
//      at least one of the pair is that value. Return true if the given value is everywhere in the array.   
		System.out.println(isEverywhere(new int[] { 1, 2, 1, 3 }, 1)); // true
		System.out.println(isEverywhere(new int[] { 1, 2, 1, 3 }, 2)); // false

//  15  Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

		System.out.println(either24(new int[] { 4, 4, 1 })); // true
		System.out.println(either24(new int[] { 4, 4, 1, 2, 2 })); // false

//  16  Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). 
//      Return the count of the number of times that the two elements differ by 2 or less, but are not equal.      

		System.out.println(matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 10 })); // 2
		System.out.println(matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 5 })); // 3
		System.out.println(matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 3 })); // 2

//  17  Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
		System.out.println(has77(new int[] { 1, 7, 7 })); // true
		System.out.println(has77(new int[] { 1, 7, 1, 7 })); // true
		System.out.println(has77(new int[] { 1, 7, 1, 1, 7 })); // false

//  18  Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
		System.out.println(has12(new int[] { 1, 3, 2 })); // true
		System.out.println(has12(new int[] { 3, 1, 2 })); // true
		System.out.println(has12(new int[] { 3, 1, 4, 5 })); // false

//  19  Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
		System.out.println(modThree(new int[] { 2, 1, 3, 5 })); // true
		System.out.println(modThree(new int[] { 2, 1, 2, 5 })); // false
		System.out.println(modThree(new int[] { 2, 4, 2, 5 })); // true

//  20  Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
		System.out.println(haveThree(new int[] { 3, 1, 3, 1, 3 })); // true
		System.out.println(haveThree(new int[] { 3, 1, 3, 3 })); // false
		System.out.println(haveThree(new int[] { 3, 4, 3, 3, 4 })); // false

//  21  Given an array of ints, return true if every 2 that appears in the array is next to another 2.
		System.out.println(twoTwo(new int[] { 4, 2, 2, 3 })); // true
		System.out.println(twoTwo(new int[] { 2, 2, 4 })); // true
		System.out.println(twoTwo(new int[] { 2, 2, 4, 2 })); // false

//  22  Return true if the group of N numbers at the start and end of the array are the same. 
//      For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
//      You may assume that n is in the range 0..nums.length inclusive.    
		System.out.println(sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 1)); // false
		System.out.println(sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 2)); // true
		System.out.println(sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 3)); // false

//  23  Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.       
		System.out.println(tripleUp(new int[] { 1, 4, 5, 6, 2 })); // true
		System.out.println(tripleUp(new int[] { 1, 2, 3 })); // true
		System.out.println(tripleUp(new int[] { 1, 2, 4 })); // false

//  24  Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, 
//    	so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid.
		int[] result11 = fizzArray3(5, 10);
		System.out.println(Arrays.toString(result11)); // [5, 6, 7, 8, 9]

//  25  Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
		int[] array1 = { 6, 2, 5, 3 };
		int[] array3 = { 1 };
		int[] res1 = shiftLeft(array1);
		int[] res3 = shiftLeft(array3);
		System.out.println(Arrays.toString(res1));
		System.out.println(Arrays.toString(res3));

//  26  For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.    
		int[] input1 = { 2, 10, 3, 4, 20, 5 };
		int[] result1 = tenRun(input1);
		System.out.println(Arrays.toString(result1)); // Output: [2, 10, 10, 10, 20, 20]

//  27  Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. 
//    	Note that it is valid in java to create an array of length 0. eg.[1, 2, 4, 1] → [1, 2]
		pre4(new int[] { 1, 2, 4, 1 }); // Returns [1, 2]
		pre4(new int[] { 3, 1, 4 }); // Returns [3, 1]
		pre4(new int[] { 1, 4, 4 }); // Returns [1]

// 28   Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array.
//		The original array will contain at least one 4. Note that it is valid in java to create an array of length 0. 		
		post4(new int[] { 2, 4, 1, 2 }); // Returns [1, 2]
		post4(new int[] { 4, 1, 4, 2 }); // Returns [2]
		post4(new int[] { 4, 4, 1, 2, 3 }); // Returns [1, 2, 3]

// 29   We'll say that an element in an array is "alone" if there are values before and after it, 
//		and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

		notAlone(new int[] { 1, 2, 3 }, 2); // Returns [1, 3, 3]
		notAlone(new int[] { 1, 2, 3, 2, 5, 2 }, 2); // Returns [1, 3, 3, 5, 5, 2]
		notAlone(new int[] { 3, 4 }, 3); // Returns [3, 4]
// 30   Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. 
//		So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.	
		zeroFront(new int[] { 1, 0, 0, 1 }); // Returns [0, 0, 1, 1]
		zeroFront(new int[] { 0, 1, 1, 0, 1 }); // Returns [0, 0, 1, 1, 1]
		zeroFront(new int[] { 1, 0 }); // Returns [0, 1]

// 31   Return a version of the given array where all the 10's have been removed. 
//		The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
		withoutTen(new int[] { 1, 10, 10, 2 }); // Returns [1, 2, 0, 0]
		withoutTen(new int[] { 10, 2, 10 }); // Returns [2, 0, 0]
		withoutTen(new int[] { 1, 99, 10 }); // Returns [1, 99, 0]

// 32   Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.		
		zeroMax(new int[] { 0, 5, 0, 3 }); // Returns [5, 5, 3, 3]
		zeroMax(new int[] { 0, 4, 0, 3 }); // Returns [3, 4, 3, 3]
		zeroMax(new int[] { 0, 1, 0 }); // Returns [1, 1, 0]

//  33  Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. 
//		You may modify and return the given array, or make a new array.		
		evenOdd(new int[] { 1, 0, 1, 0, 0, 1, 1 }); // Returns [0, 0, 0, 1, 1, 1, 1]
		evenOdd(new int[] { 3, 3, 2 }); // Returns [2, 3, 3]
		evenOdd(new int[] { 2, 2, 2 }); // Returns [2, 2, 2]

//  34  This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews. (See also: FizzBuzz Code.) 
//	    Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". 
//		In Java, String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
		fizzBuzz(1, 6); // Returns ["1", "2", "Fizz", "4", "Buzz"]
		fizzBuzz(1, 8); // Returns ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
		fizzBuzz(1, 11); // Returns ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

//  35  Consider the leftmost and rightmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. 
//		A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
		maxSpan(new int[] { 1, 2, 1, 1, 3 }); // Returns 4
		maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4 }); // Returns 6
		maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4 }); // Returns 6

//  36  Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. 
//	    Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
		fix34(new int[] { 1, 3, 1, 4 }); // Returns [1, 3, 4, 1]
		fix34(new int[] { 1, 3, 1, 4, 4, 3, 1 }); // Returns [1, 3, 4, 1, 1, 3, 4]
		fix34(new int[] { 3, 2, 2, 4 }); // Returns [3, 4, 2, 2]
		
//  37  This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. 
//	    Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. 
//	    In this version, 5's may appear anywhere in the original array.
		
		fix45(new int[]{5, 4, 9, 4, 9, 5});          // Returns [9, 4, 5, 4, 5, 9]
		fix45(new int[]{1, 4, 1, 5});                // Returns [1, 4, 5, 1]
		fix45(new int[]{1, 4, 1, 5, 5, 4, 1});       // Returns [1, 4, 5, 1, 1, 4, 5]

//  38  Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.  	
		canBalance(new int[]{1, 1, 1, 2, 1});  // Returns true
		canBalance(new int[]{2, 1, 1, 2, 1});  // Returns false
		canBalance(new int[]{10, 10});         // Returns true
		
//  39  Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. 
//      best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
		linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4});       // Returns true
		linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4});    // Returns false
		linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4});  // Returns true

//  40  Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
		squareUp(3);  // Returns [0, 0, 1, 0, 2, 1, 3, 2, 1]
		squareUp(2);  // Returns [0, 1, 2, 1]
		squareUp(4);  // Returns [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
		
//  41  Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.	
		seriesUp(3);  // Returns [1, 1, 2, 1, 2, 3]
		seriesUp(4);  // Returns [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
		seriesUp(2);  // Returns [1, 1, 2]

//  42  We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example,
//		the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.		
		maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1});  // Returns 3
		maxMirror(new int[]{1, 2, 1, 4});              // Returns 3
		maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1});     // Returns 2

//  43  Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
		countClumps(new int[]{1, 2, 2, 3, 4, 4});  // Returns 2
		countClumps(new int[]{1, 1, 2, 1, 1});    // Returns 2
		countClumps(new int[]{1, 1, 1, 1, 1});    // Returns 1

	}
	
	public  static int countClumps(int[] nums) {
	    int clumpCount = 0;
	    boolean inClump = false;

	    for (int i = 0; i < nums.length - 1; i++) {
	        if (nums[i] == nums[i + 1]) {
	            if (!inClump) {
	                clumpCount++;
	                inClump = true;
	            }
	        } else {
	            inClump = false;
	        }
	    }

	    return clumpCount;
	}

	public static  int maxMirror(int[] nums) {
	    int maxMirrorSize = 0;

	    for (int i = 0; i < nums.length; i++) {
	        for (int j = nums.length - 1; j >= 0; j--) {
	            int count = 0;
	            int iTemp = i;
	            int jTemp = j;

	            while (iTemp < nums.length && jTemp >= 0 && nums[iTemp] == nums[jTemp]) {
	                count++;
	                iTemp++;
	                jTemp--;
	            }

	            maxMirrorSize = Math.max(maxMirrorSize, count);
	        }
	    }

	    return maxMirrorSize;
	}

	public static int[] seriesUp(int n) {
	    int[] result = new int[n * (n + 1) / 2];
	    int index = 0;

	    for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= i; j++) {
	            result[index] = j;
	            index++;
	        }
	    }

	    return result;
	}

	public static  int[] squareUp(int n) {
	    int[] result = new int[n * n];
	    int index = n * n - 1;

	    for (int i = n; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            result[index] = j;
	            index--;
	        }
	        index -= n - i; // Skip the remaining elements in the current row
	    }

	    return result;
	}

	public static boolean linearIn(int[] outer, int[] inner) {
	    int outerIndex = 0;
	    int innerIndex = 0;

	    while (outerIndex < outer.length && innerIndex < inner.length) {
	        if (outer[outerIndex] == inner[innerIndex]) {
	            innerIndex++;  // Move the inner pointer
	        }
	        outerIndex++;  // Always move the outer pointer
	    }

	    // If all elements in inner have been found in outer, innerIndex will be equal to inner.length
	    return innerIndex == inner.length;
	}

	public static boolean canBalance(int[] nums) {
	    int totalSum = 0;
	    int leftSum = 0;

	    // Calculate the total sum of the array
	    for (int num : nums) {
	        totalSum += num;
	    }

	    // Check if there is a place to split the array
	    for (int num : nums) {
	        leftSum += num;
	        if (leftSum == totalSum - leftSum) {
	            return true;
	        }
	    }

	    return false;
	}

	public static int[] fix45(int[] nums) {
	    int index4 = 0;
	    int index5 = 0;

	    while (index4 < nums.length && (nums[index4] != 4 || (index4 > 0 && nums[index4 - 1] == 5))) {
	        index4++;
	    }

	    while (index5 < nums.length && (nums[index5] != 5 || (index5 > 0 && nums[index5 - 1] == 4))) {
	        index5++;
	    }

	    while (index4 < nums.length) {
	        if (nums[index4 + 1] != 5) {
	            while (index5 < nums.length && (nums[index5] != 5 || (index5 > 0 && nums[index5 - 1] == 4))) {
	                index5++;
	            }

	            if (index5 < nums.length) {
	                int temp = nums[index4 + 1];
	                nums[index4 + 1] = nums[index5];
	                nums[index5] = temp;
	            }
	        }

	        index4++;

	        while (index4 < nums.length && (nums[index4] != 4 || (index4 > 0 && nums[index4 - 1] == 5))) {
	            index4++;
	        }
	    }

	    return nums;
	}

	
	

	public static int[] fix34(int[] nums) {
		int index3 = 0;
		int index4 = 0;

		while (index3 < nums.length && nums[index3] != 3) {
			index3++;
		}

		while (index4 < nums.length && nums[index4] != 4) {
			index4++;
		}

		while (index3 < nums.length) {
			while (index4 < nums.length && (nums[index4] != 4 || (index4 > 0 && nums[index4 - 1] == 3))) {
				index4++;
			}

			if (index4 < nums.length) {
				int temp = nums[index3 + 1];
				nums[index3 + 1] = nums[index4];
				nums[index4] = temp;
			}

			index3++;

			while (index3 < nums.length && nums[index3] != 3) {
				index3++;
			}
		}

		return nums;
	}

	public static int maxSpan(int[] nums) {
		int maxSpan = 0;

		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			int rightmost = i;

			// Find the rightmost appearance of the current value
			for (int j = nums.length - 1; j > i; j--) {
				if (nums[j] == value) {
					rightmost = j;
					break;
				}
			}

			int span = rightmost - i + 1;
			maxSpan = Math.max(maxSpan, span);
		}

		return maxSpan;
	}

	public static String[] fizzBuzz(int start, int end) {
		String[] result = new String[end - start];
		for (int i = start; i < end; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result[i - start] = "FizzBuzz";
			} else if (i % 3 == 0) {
				result[i - start] = "Fizz";
			} else if (i % 5 == 0) {
				result[i - start] = "Buzz";
			} else {
				result[i - start] = String.valueOf(i);
			}
		}
		return result;
	}

	public static int[] evenOdd(int[] nums) {
		int[] result = new int[nums.length];
		int evenIndex = 0;

		// Copy even numbers to the new array
		for (int num : nums) {
			if (num % 2 == 0) { // Check if the number is even
				result[evenIndex] = num;
				evenIndex++;
			}
		}

		// Copy odd numbers to the new array
		for (int num : nums) {
			if (num % 2 == 1) { // Check if the number is odd
				result[evenIndex] = num;
				evenIndex++;
			}
		}

		return result;
	}

	public static int[] zeroMax(int[] nums) {
		int maxOdd = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] % 2 != 0 && nums[i] > maxOdd) {
				maxOdd = nums[i];
			}
			if (nums[i] == 0) {
				nums[i] = maxOdd;
			}
		}

		return nums;
	}

	public static int[] withoutTen(int[] nums) {
		int[] result = new int[nums.length];
		int resultIndex = 0;

		for (int num : nums) {
			if (num != 10) {
				result[resultIndex] = num;
				resultIndex++;
			}
		}

		// Fill the remaining positions with zeros
		while (resultIndex < result.length) {
			result[resultIndex] = 0;
			resultIndex++;
		}

		return result;
	}

	public static int[] zeroFront(int[] nums) {
		int[] result = new int[nums.length];
		int zeroIndex = 0;
		// Insert zeros at the beginning
		for (int num : nums) {
			if (num == 0) {
				result[zeroIndex] = 0;
				zeroIndex++;
			}
		}
		// Append non-zero elements
		for (int num : nums) {
			if (num != 0) {
				result[zeroIndex] = num;
				zeroIndex++;
			}
		}
		return result;
	}

	public static int[] notAlone(int[] nums, int val) {
		if (nums.length < 3) {
			// There must be at least 3 elements to have a left and right neighbor.
			return nums;
		}

		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
				nums[i] = Math.max(nums[i - 1], nums[i + 1]);
			}
		}

		return nums;
	}

	public static int[] post4(int[] nums) {
		int indexOfLast4 = -1;

		// Find the index of the last occurrence of 4 in the array
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 4) {
				indexOfLast4 = i;
				break;
			}
		}

		// Calculate the length of the result array
		int resultLength = nums.length - indexOfLast4 - 1;

		// Create a new array to store elements after the last 4
		int[] result = new int[resultLength];

		// Copy elements to the result array
		for (int i = indexOfLast4 + 1, j = 0; i < nums.length; i++, j++) {
			result[j] = nums[i];
		}

		return result;
	}

	public static int[] pre4(int[] nums) {
		// Find the index of the first occurrence of 4 in the array
		int indexOf4 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				indexOf4 = i;
				break;
			}
		}

		// Create a new array to store elements before the first 4
		int[] result = new int[indexOf4];

		// Copy elements to the result array
		for (int i = 0; i < indexOf4; i++) {
			result[i] = nums[i];
		}

		return result;
	}

	public static int[] tenRun(int[] nums) {
		int multipleOfTen = -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0) {
				multipleOfTen = nums[i];
			} else if (multipleOfTen != -1) {
				nums[i] = multipleOfTen;
			}
		}

		return nums;
	}

	public static int[] shiftLeft(int[] nums) {
		if (nums.length > 1) {
			int[] shiftedArray = new int[nums.length];

			for (int i = 0; i < nums.length - 1; i++) {
				shiftedArray[i] = nums[i + 1];
			}

			shiftedArray[nums.length - 1] = nums[0];
			return shiftedArray;
		} else {
			// If the array has only one element, it remains unchanged
			return nums;
		}
	}

	public static int[] fizzArray3(int start, int end) {
		int[] result = new int[end - start];

		for (int i = 0; i < end - start; i++) {
			result[i] = start + i;
		}

		return result;
	}

	public static boolean tripleUp(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
				return true;
			}
		}

		return false;
	}

	public static boolean sameEnds(int[] nums, int n) {
		int length = nums.length;

		if (n == 0) {
			return true; // Both ends are considered the same when n is 0.
		}

		for (int i = 0; i < n; i++) {
			if (nums[i] != nums[length - n + i]) {
				return false;
			}
		}

		return true;
	}

	public static boolean twoTwo(int[] nums) {
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			if (nums[i] == 2) {
				boolean isNext2 = false;
				// Check if the previous and next elements are also 2.
				if (i > 0 && nums[i - 1] == 2) {
					isNext2 = true;
				}
				if (i < n - 1 && nums[i + 1] == 2) {
					isNext2 = true;
				}

				if (!isNext2) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean haveThree(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				count++;

				// Check if the next element is also 3; if so, return false.
				if (i < nums.length - 1 && nums[i + 1] == 3) {
					return false;
				}
			}
		}

		return count == 3;
	}

	public static boolean modThree(int[] nums) {
		int countEven = 0;
		int countOdd = 0;

		for (int num : nums) {
			if (num % 2 == 0) {
				countEven++;
				countOdd = 0; // Reset the odd count when an even number is encountered.
			} else {
				countOdd++;
				countEven = 0; // Reset the even count when an odd number is encountered.
			}

			if (countEven == 3 || countOdd == 3) {
				return true;
			}
		}

		return false;
	}

	public static boolean has12(int[] nums) {
		boolean found1 = false;

		for (int num : nums) {
			if (num == 1) {
				found1 = true;
			}
			if (found1 && num == 2) {
				return true;
			}
		}

		return false;
	}

	public static boolean has77(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7 && nums[i + 1] == 7) {
				return true;
			}

			if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) {
				return true;
			}
		}

		return false;
	}

	public static int matchUp(int[] nums1, int[] nums2) {
		int count = 0;

		for (int i = 0; i < nums1.length; i++) {
			int diff = Math.abs(nums1[i] - nums2[i]);
			if (diff <= 2 && nums1[i] != nums2[i]) {
				count++;
			}
		}

		return count;
	}

	public static boolean either24(int[] nums) {
		boolean hasTwoTwo = false;
		boolean hasFourFour = false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				hasTwoTwo = true;
			}
			if (nums[i] == 4 && nums[i + 1] == 4) {
				hasFourFour = true;
			}
		}

		return (hasTwoTwo || hasFourFour) && !(hasTwoTwo && hasFourFour);
	}

	public static boolean isEverywhere(int[] nums, int value) {
		if (nums.length < 2) {
			return true; // If the array has less than 2 elements, the value can be anywhere.
		}

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != value && nums[i + 1] != value) {
				return false;
			}
		}

		return true;
	}

	public static boolean no14(int[] nums) {
		boolean hasOne = false;
		boolean hasFour = false;

		for (int num : nums) {
			if (num == 1) {
				hasOne = true;
			}
			if (num == 4) {
				hasFour = true;
			}
		}

		return !(hasOne && hasFour);
	}

	public static String[] fizzArray2(int n) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = String.valueOf(i);
		}
		return result;
	}

	public static boolean only14(int[] nums) {
		for (int num : nums) {
			if (num != 1 && num != 4) {
				return false;
			}
		}
		return true;
	}

	public static boolean more14(int[] nums) {
		int count1 = 0;
		int count4 = 0;

		for (int num : nums) {
			if (num == 1) {
				count1++;
			} else if (num == 4) {
				count4++;
			}
		}

		return count1 > count4;
	}

	public static boolean sum28(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			if (num == 2) {
				sum += num;
			}
		}
		return sum == 8;
	}

	public static boolean lucky13(int[] nums) {
		for (int num : nums) {
			if (num == 1 || num == 3) {
				return false; // Found a 1 or 3, so it's not lucky
			}
		}
		return true; // No 1's or 3's were found, so it's lucky
	}

	public static boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				return true;
			}
		}
		return false;
	}

	public static int sum67(int[] nums) {
		int sum = 0;
		boolean inSection = false;

		for (int num : nums) {
			if (num == 6) {
				inSection = true;
			} else if (inSection && num == 7) {
				inSection = false;
			} else if (!inSection) {
				sum += num;
			}
		}

		return sum;
	}

	public static int sum13(int[] nums) {
		int sum = 0;
		boolean skipNext = false;

		for (int num : nums) {
			if (skipNext) {
				skipNext = false;
			} else if (num == 13) {
				skipNext = true;
			} else {
				sum += num;
			}
		}

		return sum;
	}

	public static int centeredAverage(int[] nums) {
		// Initialize min and max with the first element
		int min = nums[0];
		int max = nums[0];
		int sum = nums[0];

		// Iterate through the array to find min, max, and calculate the sum
		for (int i = 1; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
			sum += nums[i];
		}

		// Calculate the centered average
		int centeredAvg = (sum - min - max) / (nums.length - 2);

		return centeredAvg;
	}

	public static int bigDiff(int[] nums) {
		int min = nums[0]; // Initialize min with the first element
		int max = nums[0]; // Initialize max with the first element

		for (int num : nums) {
			min = Math.min(min, num); // Update min if a smaller value is found
			max = Math.max(max, num); // Update max if a larger value is found
		}
		int diff = max - min; // Calculate the difference between the largest and smallest values
		return diff;
	}

	public static int countEvens(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	

	



	
	


}
