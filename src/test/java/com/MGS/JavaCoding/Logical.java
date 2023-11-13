package com.MGS.JavaCoding;

import java.util.Arrays;

public class Logical {

	public static void main(String[] args) {
//  1  When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
//	   Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
		System.out.println(cigarParty(30, false)); // Output: false
		System.out.println(cigarParty(50, false)); // Output: true
		System.out.println(cigarParty(70, true)); // Output: true

//  2  You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). 
//	   With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
		System.out.println(dateFashion(5, 10)); // Output: 2
		System.out.println(dateFashion(5, 2)); // Output: 0
		System.out.println(dateFashion(5, 5)); // Output: 1

//  3  The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive).
//	   Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.		
		System.out.println(squirrelPlay(70, false)); // Output: true
		System.out.println(squirrelPlay(95, false)); // Output: false
		System.out.println(squirrelPlay(95, true)); // Output: true

//  4  You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
//     If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
		System.out.println(caughtSpeeding(60, false)); // Output: 0
		System.out.println(caughtSpeeding(65, false)); // Output: 1
		System.out.println(caughtSpeeding(65, true)); // Output: 0

//  5 Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.         
		System.out.println(sortaSum(3, 4)); // Output: 7
		System.out.println(sortaSum(9, 4)); // Output: 20
		System.out.println(sortaSum(10, 11)); // Output: 21

//  6  Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
//     Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".        
		System.out.println(alarmClock(1, false)); // Output: "7:00"
		System.out.println(alarmClock(5, false)); // Output: "7:00"
		System.out.println(alarmClock(0, false)); // Output: "10:00"

//  7  The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. 
//     Note: the function Math.abs(num) computes the absolute value of a number.
		System.out.println(love6(6, 4)); // Output: true
		System.out.println(love6(4, 5)); // Output: false
		System.out.println(love6(1, 5)); // Output: true

//  8   Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.       
		System.out.println(in1To10(5, false)); // Output: true
		System.out.println(in1To10(11, false)); // Output: false
		System.out.println(in1To10(11, true)); // Output: true

//  9   We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see
		System.out.println(specialEleven(22)); // Output: true
		System.out.println(specialEleven(23)); // Output: true
		System.out.println(specialEleven(24)); // Output: false

//  10  Return true if the given non-negative number is 1 or 2 more than a multiple of 20. 
		System.out.println(more20(20)); // Output: false
		System.out.println(more20(21)); // Output: true
		System.out.println(more20(22)); // Output: true

//  11  Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator   
		System.out.println(old35(3)); // Output: true
		System.out.println(old35(10)); // Output: true
		System.out.println(old35(15)); // Output: false

//  12  Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false    
		System.out.println(less20(18)); // Output: true
		System.out.println(less20(19)); // Output: true
		System.out.println(less20(20)); // Output: false

//  14  Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2
		System.out.println(nearTen(12)); // Output: true
		System.out.println(nearTen(17)); // Output: false
		System.out.println(nearTen(19)); // Output: true

//  15  Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.        
		System.out.println(teenSum(3, 4)); // Output: 7
		System.out.println(teenSum(10, 13)); // Output: 19
		System.out.println(teenSum(13, 2)); // Output: 19

//  16  Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.             
		System.out.println(answerCell(false, false, false)); // Output: true
		System.out.println(answerCell(false, false, true)); // Output: false
		System.out.println(answerCell(true, false, false)); // Output: false

// 17   We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. 
//      However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
		System.out.println(teaParty(6, 8)); // Output: 1
		System.out.println(teaParty(3, 8)); // Output: 0
		System.out.println(teaParty(20, 6)); // Output: 2

// 18   Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". 
//      In all other cases, return the string unchanged.        
		System.out.println(fizzString("fig")); // Output: "Fizz"
		System.out.println(fizzString("dib")); // Output: "Buzz"
		System.out.println(fizzString("fib")); // Output: "FizzBuzz"

// 19   Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". 
//      Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?
		System.out.println(fizzString2(1)); // Output: "1!"
		System.out.println(fizzString2(2)); // Output: "2!"
		System.out.println(fizzString2(3)); // Output: "Fizz!"

// 20   Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
		System.out.println(twoAsOne(1, 2, 3)); // Output: true
		System.out.println(twoAsOne(3, 1, 2)); // Output: true
		System.out.println(twoAsOne(1, 2, 4)); // Output: false

// 21   Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.        
		System.out.println(inOrder(1, 2, 4, false)); // Output: true
		System.out.println(inOrder(1, 2, 1, false)); // Output: false
		System.out.println(inOrder(1, 1, 2, true)); // Output: true

// 22   Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
		System.out.println(inOrderEqual(2, 5, 11, false)); // Output: true
		System.out.println(inOrderEqual(5, 7, 6, false)); // Output: false
		System.out.println(inOrderEqual(5, 5, 7, true)); // Output: true

// 23   Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. 
//      Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.       
		System.out.println(lastDigit(23, 19, 13)); // Output: true
		System.out.println(lastDigit(23, 19, 12)); // Output: false
		System.out.println(lastDigit(23, 19, 3)); // Output: true

// 24   Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
		System.out.println(lessBy10(1, 7, 11)); // Output: true
		System.out.println(lessBy10(1, 7, 10)); // Output: false
		System.out.println(lessBy10(11, 1, 7)); // Output: true

// 25   Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
		System.out.println(withoutDoubles(2, 3, true)); // Output: 5
		System.out.println(withoutDoubles(3, 3, true)); // Output: 7
		System.out.println(withoutDoubles(3, 3, false)); // Output: 6

// 26   Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. 
//      However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2. 
		System.out.println(maxMod5(2, 3)); // Output: 3
		System.out.println(maxMod5(6, 2)); // Output: 6
		System.out.println(maxMod5(3, 2)); // Output: 3

// 27   You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. 
//      Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.     
		System.out.println(redTicket(2, 2, 2)); // Output: 10
		System.out.println(redTicket(2, 2, 1)); // Output: 0
		System.out.println(redTicket(0, 0, 0)); // Output: 5

// 28   You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.        
		System.out.println(greenTicket(1, 2, 3)); // Output: 0
		System.out.println(greenTicket(2, 2, 2)); // Output: 20
		System.out.println(greenTicket(1, 1, 2)); // Output: 10

// 29  You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. 
//     If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.  
		System.out.println(blueTicket(9, 1, 0)); // Output: 10
		System.out.println(blueTicket(9, 2, 0)); // Output: 0
		System.out.println(blueTicket(6, 1, 4)); // Output: 10

// 30   Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
		System.out.println(shareDigit(12, 23)); // Output: true
		System.out.println(shareDigit(12, 43)); // Output: false
		System.out.println(shareDigit(12, 44)); // Output: false

//  31  Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. 
//      (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)      
		System.out.println(sumLimit(2, 3)); // Output: 5
		System.out.println(sumLimit(8, 3)); // Output: 8
		System.out.println(sumLimit(8, 1)); // Output: 9

//  32  We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
//      Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops         
		System.out.println(makeBricks(3, 1, 8)); // Output: true
		System.out.println(makeBricks(3, 1, 9)); // Output: false
		System.out.println(makeBricks(3, 2, 10)); // Output: true

//  33 Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
		System.out.println(loneSum(1, 2, 3)); // Output: 6
		System.out.println(loneSum(3, 2, 3)); // Output: 2
		System.out.println(loneSum(3, 3, 3)); // Output: 0

//  34  Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
		System.out.println(luckySum(1, 2, 3)); // Output: 6
		System.out.println(luckySum(1, 2, 13)); // Output: 3
		System.out.println(luckySum(1, 13, 3)); // Output: 1

//  35  Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. 
//      Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().       
		System.out.println(noTeenSum(1, 2, 3)); // Output: 6
		System.out.println(noTeenSum(2, 13, 1)); // Output: 3
		System.out.println(noTeenSum(2, 1, 14)); // Output: 3

//  36  For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
		System.out.println(roundSum(16, 17, 18)); // Output: 60
		System.out.println(roundSum(12, 13, 14)); // Output: 30
		System.out.println(roundSum(6, 4, 4)); // Output: 10

//  37  Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number. 		
		System.out.println(closeFar(1, 2, 10)); // Output: true
		System.out.println(closeFar(1, 2, 3)); // Output: false
		System.out.println(closeFar(4, 1, 3)); // Output: true

//  38  Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
		System.out.println(blackjack(19, 21)); // Output: 21
		System.out.println(blackjack(21, 19)); // Output: 21
		System.out.println(blackjack(19, 22)); // Output: 19

//  39  Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.		
		System.out.println(evenlySpaced(2, 4, 6)); // Output: true
		System.out.println(evenlySpaced(4, 6, 2)); // Output: true
		System.out.println(evenlySpaced(4, 6, 3)); // Output: false

//  40  We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
		System.out.println(makeChocolate(4, 1, 9)); // Output: 4
		System.out.println(makeChocolate(4, 1, 10)); // Output: -1
		System.out.println(makeChocolate(4, 1, 7)); // Output: 2
	}

	public static int makeChocolate(int small, int big, int goal) {
		int bigBarsNeeded = goal / 5; // Calculate the number of big bars needed

		// If we have more big bars than needed, use only the necessary number of big
		// bars
		if (big >= bigBarsNeeded) {
			big = bigBarsNeeded;
		}

		int remainingGoal = goal - (big * 5); // Calculate the remaining goal in kilos
		int smallBarsNeeded = Math.min(small, remainingGoal); // Use small bars to reach the remaining goal

		if (remainingGoal == smallBarsNeeded) {
			return smallBarsNeeded;
		}

		return -1; // Return -1 if it's not possible to reach the goal
	}

	public static boolean evenlySpaced(int a, int b, int c) {
		int[] arr = { a, b, c };
		Arrays.sort(arr); // Sort the integers in ascending order

		int diff1 = arr[1] - arr[0]; // Difference between small and medium
		int diff2 = arr[2] - arr[1]; // Difference between medium and large

		return diff1 == diff2; // Check if the differences are the same
	}

	public static int blackjack(int a, int b) {
		// Check if both values are over 21.
		if (a > 21 && b > 21) {
			return 0;
		}
		// Calculate how far each value is from 21.
		int diffA = 21 - a;
		int diffB = 21 - b;
		// Determine the result based on the differences.
		if (diffA < 0) {
			return b;
		} else if (diffB < 0) {
			return a;
		} else {
			return (diffA < diffB) ? a : b;
		}
	}

	public static boolean closeFar(int a, int b, int c) {
		// Check if b is close to a and c is far from both a and b.
		if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
			return true;
		}

		// Check if c is close to a and b is far from both a and c.
		if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
			return true;
		}
		// Otherwise, neither b nor c is close to a and both are far.
		return false;
	}

	public static int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}

	public static int round10(int num) {
		int remainder = num % 10;
		if (remainder >= 5) {
			return num + (10 - remainder);
		} else {
			return num - remainder;
		}
	}

	public static int noTeenSum(int a, int b, int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	public static int fixTeen(int n) {
		if ((n >= 13 && n <= 14) || (n >= 17 && n <= 19)) {
			return 0;
		}
		return n;
	}

	public static int luckySum(int a, int b, int c) {
		if (a == 13) {
			return 0;
		}
		if (b == 13) {
			return a;
		}
		if (c == 13) {
			return a + b;
		}
		return a + b + c;
	}

	public static int loneSum(int a, int b, int c) {
		// Check if all three values are equal
		if (a == b && b == c) {
			return 0;
		}
		// Check if a and b are equal
		else if (a == b) {
			return c;
		}
		// Check if b and c are equal
		else if (b == c) {
			return a;
		}
		// Check if a and c are equal
		else if (a == c) {
			return b;
		}
		// If no values are equal, return the sum of all three
		else {
			return a + b + c;
		}
	}

	public static boolean makeBricks(int small, int big, int goal) {
		// If the goal is greater than the total number of bricks, then it is not
		// possible to make the goal.
		if (goal > small + 5 * big) {
			return false;
		}

		// If the goal is a multiple of 5, then we can use all of the big bricks.
		if (goal % 5 == 0) {
			return true;
		}

		// If the goal is not a multiple of 5, then we need to use some of the small
		// bricks.
		// The maximum number of small bricks that we can use is the remainder when the
		// goal is divided by 5.
		int maxSmallBricks = goal % 5;

		// If the number of small bricks is less than or equal to the maximum number of
		// small bricks that we can use, then it is possible to make the goal.
		return small >= maxSmallBricks;

	}

	public static int sumLimit(int a, int b) {
		// Calculate the sum of a and b
		int sum = a + b;

		// Check if the sum has more digits than a
		if (String.valueOf(sum).length() == String.valueOf(a).length()) {
			return sum;
		} else {
			return a;
		}
	}

	public static boolean shareDigit(int a, int b) {
		int aLeft = a / 10;
		int aRight = a % 10;
		int bLeft = b / 10;
		int bRight = b % 10;

		return (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight);
	}

	public static int blueTicket(int a, int b, int c) {
		int abSum = a + b;
		int bcSum = b + c;
		int acSum = a + c;

		if (abSum == 10 || bcSum == 10 || acSum == 10) {
			return 10;
		} else if (abSum - bcSum == 10 || abSum - acSum == 10) {
			return 5;
		} else {
			return 0;
		}
	}

	public static int greenTicket(int a, int b, int c) {
		if (a == b && b == c) {
			return 20;
		} else if (a == b || a == c || b == c) {
			return 10;
		} else {
			return 0;
		}
	}

	public static int redTicket(int a, int b, int c) {
		if (a == b && b == c) {
			if (a == 2) {
				return 10;
			}
			return 5;
		} else if (a != b && a != c) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int maxMod5(int a, int b) {
		if (a == b) {
			return 0;
		}

		int remainderA = a % 5;
		int remainderB = b % 5;

		if (remainderA == remainderB) {
			return Math.min(a, b);
		}

		return (a > b) ? a : b;
	}

	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (noDoubles && die1 == die2) {
			// If noDoubles is true and the dice values are the same, increment one of them
			die1 = (die1 % 6) + 1;
		}
		return die1 + die2;
	}

	public static boolean lessBy10(int a, int b, int c) {
		return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10;
	}

	public static boolean lastDigit(int a, int b, int c) {
		int lastDigitA = a % 10;
		int lastDigitB = b % 10;
		int lastDigitC = c % 10;

		return lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC;
	}

	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (equalOk) {
			return a <= b && b <= c;
		} else {
			return a < b && b < c;
		}
	}

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		if (bOk) {
			return c > b;
		} else {
			return b > a && c > b;
		}
	}

	public static boolean twoAsOne(int a, int b, int c) {
		return a + b == c || a + c == b || b + c == a;
	}

	public static String fizzString2(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return "FizzBuzz!";
		} else if (n % 3 == 0) {
			return "Fizz!";
		} else if (n % 5 == 0) {
			return "Buzz!";
		} else {
			return n + "!";
		}
	}

	public static String fizzString(String str) {
		boolean startsWithF = str.startsWith("f");
		boolean endsWithB = str.endsWith("b");

		if (startsWithF && endsWithB) {
			return "FizzBuzz";
		} else if (startsWithF) {
			return "Fizz";
		} else if (endsWithB) {
			return "Buzz";
		} else {
			return str;
		}
	}

	public static int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5) {
			return 0; // Party is bad if either tea or candy is less than 5.
		} else if (tea >= 2 * candy || candy >= 2 * tea) {
			return 2; // Party is great if either tea or candy is at least double the amount of the
						// other one.
		} else {
			return 1; // Party is good in all other cases.
		}
	}

	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		} else if (isMorning) {
			return isMom;
		}
		return true;
	}

	public static int teenSum(int a, int b) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			return 19;
		}
		return a + b;
	}

	public static boolean nearTen(int num) {
		return num % 10 <= 2 || num % 10 >= 8;
	}

	public static boolean less20(int n) {
		return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
	}

	public static boolean old35(int n) {
		boolean isMultipleOf3 = (n % 3 == 0);
		boolean isMultipleOf5 = (n % 5 == 0);

		return (isMultipleOf3 || isMultipleOf5) && !(isMultipleOf3 && isMultipleOf5);
	}

	public static boolean more20(int n) {
		return (n % 20 == 1) || (n % 20 == 2);
	}

	public static boolean specialEleven(int n) {
		return (n % 11 == 0) || (n % 11 == 1);
	}

	public static boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode) {
			return n <= 1 || n >= 10;
		} else {
			return n >= 1 && n <= 10;
		}
	}

	public static boolean love6(int a, int b) {
		return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
	}

	public static String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day >= 1 && day <= 5) { // Weekdays (Mon to Fri) on vacation
				return "10:00";
			} else { // Weekend (Sat or Sun) on vacation
				return "off";
			}
		} else {
			if (day >= 1 && day <= 5) { // Weekdays (Mon to Fri)
				return "7:00";
			} else { // Weekend (Sat or Sun)
				return "10:00";
			}
		}
	}

	public static int sortaSum(int a, int b) {
		int sum = a + b;
		if (sum >= 10 && sum <= 19) {
			return 20;
		}
		return sum;
	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday) {
			speed -= 5;
		}

		if (speed <= 60) {
			return 0;
		} else if (speed >= 61 && speed <= 80) {
			return 1;
		} else {
			return 2;
		}
	}

	public static boolean squirrelPlay(int temperature, boolean isSummer) {
		int upperLimit = isSummer ? 100 : 90;
		return temperature >= 60 && temperature <= upperLimit;
	}

	public static int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {
			return 0; // No table if either is not stylish (2 or less).
		} else if (you >= 8 || date >= 8) {
			return 2; // Yes, if either is very stylish (8 or more).
		} else {
			return 1; // Maybe, if both are moderately stylish (between 2 and 8).
		}
	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			return cigars >= 40;
		} else {
			return cigars >= 40 && cigars <= 60;
		}
	}

}
