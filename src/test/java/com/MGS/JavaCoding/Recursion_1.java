package com.MGS.JavaCoding;

 public class Recursion_1 {
    public static void main (String [] args) {
// 1   Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
       System.out.println(factorial(3));
 
// 2  We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
       System.out.println(bunnyEars(2));
  
// 3   The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.     
       System.out.println(fibonacci(8));

// 4   We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
       System.out.println(bunnyEars2(2));

//  5  We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.

//  6  
      
    }
    
    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return rows + triangle(rows - 1);
        }
    }

    
    public static  int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            // Even bunnies have 3 ears each.
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            // Odd bunnies have 2 ears each.
            return 2 + bunnyEars2(bunnies - 1);
        }
    }
    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: Fibonacci(0) is 0
        } else if (n == 1) {
            return 1; // Base case: Fibonacci(1) is 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        }
    }
    
    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0; // Base case: No bunnies, no ears
        } else {
            return 2 + bunnyEars(bunnies - 1); // Recursive case: Each bunny has 2 ears
        }
    }
      public static int factorial(int n) {
          if (n == 0 || n == 1) {
              return 1; // Base case: 0! and 1! are both 1
          } else {
              return n * factorial(n - 1); // Recursive case: n! = n * (n-1)!
          }
      }    
   }