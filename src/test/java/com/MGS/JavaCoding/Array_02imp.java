package com.MGS.JavaCoding;

import java.util.*;


public class Array_02imp {

	public static void main(String[] args) {
		  // 35 . ISO GRAM STRING
        String str = "Milnd";
        System.out.println("IsoGram String :" + isIsogram(str));

        String name = "Milnd";
        System.out.println("IsoGram String :" + IsIsogram(name));

        // 36 .  FACTORIAL NUMBER
        System.out.println(factorialNumber());

        // 37.  GET ALL ALPHABETS
        allalphabet();

        //  38 . MULTIPLICATION OF INTEGER
        multiPlication(5, 6);

        // 39 .MULTIPLICATION TABLE
        multiPlicationTable(2, 2);

        // 40 . GENERATE RANDOM NUMBERS
        generateRandomNumber();

        //41 . SPLIT STRINGS
        splitstring();

        // 42 .  REMOVE DUPLICATE WORDS
        removeDuplicateWord();
        // 43. eEXTRACT CHARACTER
        extractChar();

        // 44. COUNT  CHARACTER OCCURENCES
        countCharacterOccurences();

        // 45. COUNT  CHARACTER OCCURENCES
        countCharecter();

        // 46. COUNT  WORD OCCURENCES
        countWordOccurrence();

        // 47 .  REVERSE WORD
        reverseWords();
        
        // 48.  PRINT ARRAY
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Actual Array : " + Arrays.toString(arr));

        //  49 REVERSE INT [] ARRAY
        int ar[] = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(ar);

        // 50  REVERSE INT [] ARRAY
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = 5;
        reverseArrays(arr1, start, end);

        // 51 HALF REVERSE ARRAY
        int arr2[] = {40, 30, 20, 10, 50, 60, 70};
        int startIndex = 0;
        int endIndex = 3;
        halfReverseArrays(arr2, startIndex, endIndex);

        //  52 MIDDLE REVERSE ARRAY
        int arr3[] = {10, 20, 50, 40, 30, 60, 70};
        int startMidIndex = 2;
        int endMidIndex = 4;
        midReverseArrays(arr3, startMidIndex, endMidIndex);

        // 53 SORTING ARRAY WITH SORT METHOD
        int arr4[] = {4, 3, 2, 9, 5, 6, 7, 1};
        Arrays.sort(arr4);
        System.out.println("Sorting Array Using Sort Method: " + Arrays.toString(arr4));

        // 54. SORTING WITH BUBBLE SORT ALGORITHM
        int arr5[] = {4, 3, 2, 9, 5, 6, 7, 1};
        sortArrayByloop(arr5);

        // 55.  SWAPPING AN ELEMENT IN [] ARRAY
        int aa[] = {1, 2, 3, 4, 5, 6, 7, 9};
        int ele1 = 7, ele2 = 3;
        int in1 = -1, in2 = -1;
        swapingElementArray(aa,ele1,ele2,in1,in2);

        //  56 MANIPULATING STRING ARRAY
        String input[] = {"Sunday","Monday","Tuestday","Wednesday","Thursday","Friday","Saturday"};
        manipulateArray(input);

        //  57  FACTORIAL NUMBER
        factorialNumbers(5);

        // 58 SUM ARRAY []
        int a[] = {2, 4, 5, 6, 6, 7, 8, 9};
        sumArray(a);
        // 59 COMPARE ARRAY 
        int a1[] = {2, 4, 6, 7, 8, 9};
        int b1[] = {3, 4, 5, 7, 2, 9};
        comparreArray(a1,b1);

        // 60 MULTIPLICATION
        multiplication();
	}
	
	 private static void multiplication() {
	        int a = 3;
	        int b = 3;
	        int m = 0;

	        for (int i = 0; i < a; i++) {
	            m = m+b;
	        }
	        System.out.println("Multiplication : " + m);
	    }


	    private static void comparreArray(int[] a, int[] b) {
	        List<Integer> al = new ArrayList<>();

	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == b[i]) {
	                al.add(a[i]);
	            }
	        }
	        Object arr[] = al.toArray();
	        for (Object ar : arr) {
	            System.out.println(ar);
	        }
	        System.out.println("Printing Common Values : " + Arrays.toString(arr));
	    }

	    private static void sumArray(int[] a) {
	        int sum = 0;
	        for (int i = 0; i < a.length; i++) {
	            sum = sum + a[i];
	        }
	        System.out.println("Sum Of Arrays : " + sum);
	    }


	    private static void factorialNumbers(int n) {
	      int  fact = 1;
	        for(int i=1;i<=n;i++){
	          fact = fact*i;
	        }
	        System.out.println("The Factorial of "+ n +" is = "+fact);
	    }

	    private static void manipulateArray(String[] input) {
	        String[] output = new String[input.length];
	        for(int i=0;i<input.length;i++){
	            output[i]=input[i].substring(0,3);
	        }
	        System.out.println(Arrays.toString(output));
	        for(String day:output) {
	            System.out.println(day);
	        }
	    }

	    private static void swapingElementArray(int[] aa, int ele1, int ele2, int in1, int in2) {
	        for (int i = 0; i < aa.length; i++) {
	            if (aa[i] == ele1) {
	                in1 = i;
	            } else if (aa[i] == ele2) {
	                in2 = i;
	            }
	            if (in1 != -1 && in2 != -1) {
	                break; // Both elements found, no need to continue searching
	            }
	        }
	        if (in1 != -1 && in2 != -1) {
	            int temp = aa[in1];
	            aa[in1] = aa[in2];
	            aa[in2] = temp;
	        }
	        System.out.println("Array Swapping (3 & 7) : " + Arrays.toString(aa));
	    }


	    private static void sortArrayByloop(int[] arr5) {
	        for (int i = 0; i < arr5.length - 1; i++) {
	            for (int j = 1; j < arr5.length - i - 1; j++) {
	                if (arr5[j] > arr5[j + 1]) {
	                    int tem = arr5[j];
	                    arr5[j] = arr5[j + 1];
	                    arr5[j + 1] = tem;
	                }
	            }
	        }
	        System.out.println("Sorting Array With Bubble Sort Algorithm  : " + Arrays.toString(arr5));
	    }

	    private static void midReverseArrays(int[] arr3, int startMidIndex, int endMidIndex) {
	        int rev;
	        for (int i = startMidIndex, j = endMidIndex; i < j; i++, j--) {
	            rev = arr3[i];
	            arr3[i] = arr3[j];
	            arr3[j] = rev;
	        }
	        System.out.println("Mid Reverse [] Array = " + Arrays.toString(arr3));
	    }

	    private static void halfReverseArrays(int[] arr2, int startIndex, int endIndex) {
	        int rev;
	        for (int i = startIndex, j = endIndex; i < j; i++, j--) {
	            rev = arr2[i];
	            arr2[i] = arr2[j];
	            arr2[j] = rev;
	        }
	        System.out.println("Half Reverse [] Array = " + Arrays.toString(arr2));
	    }

	    private static void reverseArrays(int[] arr1, int start, int end) {
	        int rev, a, b;
	        for (a = start, b = end; a < b; a++, b--) {
	            rev = arr1[a];
	            arr1[a] = arr1[b];
	            arr1[b] = rev;
	        }
	        System.out.println("Reverse []  Array :" + Arrays.toString(arr1));
	    }


	    static void Multidimentinal() {

	        int arr[][] = {{60, 80, 90}, {10, 34, 22}, {22, 45, 99}};
	        for (int row = 0; row < arr.length; row++) {
	            for (int col = 0; col < arr[row].length; col++) {
	                System.out.print(arr[row][col] + " ");
	            }
	            System.out.println();
	        }
	        for (int[] ar : arr) {
	            System.out.println(Arrays.toString(ar));
	        }
	    }


	    private static void reverseArray(int[] ar) {
	        for (int i = ar.length - 1; i >= 0; i--) {
	            System.out.print(ar[i] + " ");
	        }
	    }

	 public static void reverseWords() {
	        String str = "I am going";
	        String[] strs = str.split("\\s");
	        String rev = " ";

	        for (int i = strs.length - 1; i >= 0; i--) {
	            rev = rev + strs[i] + " ";
	        }

	        System.out.println(str + " (Reverse of this) " + rev);
	    }

	    private static void countWordOccurrence() {
	        String str = "I am learning learning java java programming language";
	        String[] str1 = str.split(" ");
	        Map<String, Integer> map = new HashMap<>();
	        for (int i = 0; i < str1.length; i++) {
	            if (map.containsKey(str1[i])) {
	                int count = map.get(str1[i]);
	                map.put(str1[i], count + 1);
	            } else {
	                map.put(str1[i], 1);
	            }
	        }
	        System.out.println("Count of Word Occurrence :");
	        for (String x : map.keySet()) {
	            System.out.println(x + ": " + map.get(x));
	        }
	    }

	    public static void countCharecter() {
	        String str = "Milind Ghongade from Pune living in Bangalore";
	        int count = str.length() - str.replaceAll("i", "").length();
	        System.out.println(" Number of Charecters : " + count);
	    }

	    public static void countCharacterOccurences() {
	        String str = "Milind";
	        char[] charArray = str.toCharArray();
	        Map<Character, Integer> mapChar = new HashMap<>();

	        for (char c : charArray) {
	            if (mapChar.containsKey(c)) {
	                int count = mapChar.get(c);
	                mapChar.put(c, count + 1);
	            } else {
	                mapChar.put(c, 1);
	            }
	        }
	        System.out.println("Count of Character Occurrence:");
	        for (Character c : mapChar.keySet()) {
	            System.out.println(c + ": " + mapChar.get(c));
	        }
	    }


	    public static void extractChar() {
	        String str = "www.milind.com";
	        String chars = str.substring(4, 10);
	        System.out.println("FirstFour :" + chars);

	        String lastChar = str.substring(str.length() - 4, str.length());
	        System.out.println("LastChar :" + lastChar);

	    }

	    private static void removeDuplicateWord() {
	        String str = "My Name Name is is Milind Milind";
	        String mg[] = str.split(" ");
	        Set<String> mySet = new LinkedHashSet<>();
	        for (String m : mg) {
	            mySet.add(m);
	        }
	        Iterator itr = mySet.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next() + " ");
	        }
	    }


	    private static void splitstring() {
	        String s1 = "java string split method by Technolamror";
	        String[] words = s1.split("\\s");
	        for (String w : words) {
	            System.out.println(w);
	        }
	    }

	    private static void generateRandomNumber() {
	        int c;
	        Random t = new Random();
	        // random integers in [0, 100]
	        for (c = 1; c <= 10; c++) {
	            System.out.println(t.nextInt(1000));
	        }
	    }

	    static void multiPlicationTable(int n1, int n2) {
	        int j = 0;
	        for (int i = n1; j <= n2; i++) {
	            System.out.println("Multiplication table of " + i);
	            for (j = 1; j <= 10; j++) {
	                System.out.println(i + "*" + j + "=" + (i * j));
	            }
	        }
	    }

	    static void multiPlication(int a, int b) {
	        int Mul = 0;
	        for (int i = 0; i < a; i++) {
	            Mul += b;
	        }
	        System.out.println(Mul);
	    }

	    static void allalphabet() {
	        System.out.println("All Alphabets : ");
	        {
	            char ch;
	            for (ch = 'A'; ch <= 'Z'; ch++)
	                System.out.print(ch);
	        }
	    }


	    private static int factorialNumber() {
	        int  n= 5;
	        int factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial = factorial * i;
	        }
	        return factorial;
	    }

	    private static boolean IsIsogram(String str) {
	        boolean isIsogram = true;
	        str = str.toUpperCase();
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            // if (Character.isLetter(currentChar)) {
	            for (int j = i + 1; j < str.length(); j++) {
	                char nextChar = str.charAt(j);

	                if (currentChar == nextChar) {
	                    return false;

	                }
	            }
	        }

	        return isIsogram;
	    }

	    static boolean isIsogram(String str) {
	        boolean isogram = true;
	        char[] ch = str.toCharArray();
	        Set<Character> chSet = new HashSet<>();

	        for (Character c : ch) {
	            if (chSet.contains(c)) {
	                isogram = false;
	            } else {
	                chSet.add(c);
	            }
	        }
	        return isogram;
	    }

	   /* char ch[] = str.toCharArray();
	    List<Character> list = new ArrayList<>();
	        for(char c : ch){
	        if(list.contains(c)) {
	            return false;
	        } else
	        {
	            list.add(c);
	        }
	    }
	        return true;*/
}
