package com.MGS.JavaCoding;

public class A001Problems {

	public static void main(String[] args) {

		  for (int i = 1; i <= 10; i++) {
	            // Add spaces before the numbers to align them
	            for (int k = 10; k > i; k--) {
	                System.out.print(" ");
	            }

	            // Print the numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
     }
}