package com.MGS.JavaCoding;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFunctional {

	public static void main(String[] args) {
// 1   Given a list of integers, return a list where each integer is multiplied by 2.
		List<Integer> originalList = new ArrayList<>();
		originalList.add(1);
		originalList.add(2);
		originalList.add(3);
		List<Integer> result = doubling(originalList);
		System.out.println(result); // Output: [2, 4, 6]

//  2  Given a list of integers, return a list where each integer is multiplied with itself.

		List<Integer> originalList1 = new ArrayList<>();
		originalList1.add(1);
		originalList1.add(2);
		originalList1.add(3);

		List<Integer> result1 = square(originalList);
		System.out.println(result1); // Output: [1, 4, 9]

//   3  Given a list of strings, return a list where each string has "*" added at its end.

		List<String> originalList2 = new ArrayList<>();
		originalList2.add("a");
		originalList2.add("bb");
		originalList2.add("ccc");

		List<String> result2 = addStar(originalList2);
		System.out.println(result2); // Output: ["a*", "bb*", "ccc*"]

//   4 	 Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
		List<String> originalList3 = new ArrayList<>();
		originalList3.add("a");
		originalList3.add("bb");
		originalList3.add("ccc");

		List<String> result3 = copies3(originalList3);
		System.out.println(result3); // Output: ["aaa", "bbbbbb", "ccccccccc"]

//   5   	Given a list of strings, return a list where each string has "y" added at its start and end.

		List<String> originalList4 = new ArrayList<>();
		originalList4.add("a");
		originalList4.add("b");
		originalList4.add("c");
		List<String> result4 = moreY(originalList4);
		System.out.println(result4); // Output: ["yay", "yby", "ycy"]
		
//  6 	Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
		List<Integer> originalList5 = new ArrayList<>();
		originalList5.add(1);
		originalList5.add(2);
		originalList5.add(3);
	    List<Integer> result5 = math1(originalList5);
	    System.out.println(result5);  // Output: [20, 30, 40]
	    
//  7  	Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
	    List<Integer> originalList6 = new ArrayList<>();
	    originalList6.add(1);
	    originalList6.add(22);
	    originalList6.add(93);
	    List<Integer> result6 = rightDigit(originalList6);
	    System.out.println(result6);  // Output: [1, 2, 3]
	    
//  8  Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
	    List<String> originalList7 = new ArrayList<>();
	    originalList7.add("Hello");
	    originalList7.add("Hi");
	    List<String> result7 = lower(originalList7);
	    System.out.println(result7);  // Output: ["hello", "hi"]
	    
//  9  Given a list of strings, return a list where each string has all its "x" removed.
	    List<String> originalList8 = new ArrayList<>();
	    originalList8.add("ax");
	    originalList8.add("bb");
	    originalList8.add("cx");

	    List<String> result8 = noX(originalList8);
	    System.out.println(result8);  // Output: ["a", "bb", "c"]
	    
//  10  Given a list of integers, return a list of the integers, omitting any that are less than 0.    
	    List<Integer> input1 = new ArrayList<>();
        input1.add(1);
        input1.add(-2);

        List<Integer> input2 = new ArrayList<>();
        input2.add(-3);
        input2.add(-3);
        input2.add(3);
        input2.add(3);

        List<Integer> input3 = new ArrayList<>();
        input3.add(-1);
        input3.add(-1);
        input3.add(-1);

        System.out.println(noNeg(input1)); // Output: [1]
        System.out.println(noNeg(input2)); // Output: [3, 3]
        System.out.println(noNeg(input3)); // Output: []
        
//  11  Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
        List<Integer> input4 = new ArrayList<>();
        input1.add(1);
        input1.add(2);
        input1.add(19);

        List<Integer> input5= new ArrayList<>();
        input2.add(9);
        input2.add(19);
        input2.add(29);
        input2.add(3);

        List<Integer> input6 = new ArrayList<>();
        input3.add(1);
        input3.add(2);
        input3.add(3);

        System.out.println(no9(input4)); // Output: [1, 2]
        System.out.println(no9(input5)); // Output: [3]
        System.out.println(no9(input6)); // Output: [1, 2, 3]
        
// 12  Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.  
        
        List<Integer> input7 = new ArrayList<>();
        input1.add(12);
        input1.add(13);
        input1.add(19);
        input1.add(20);

        List<Integer> input8 = new ArrayList<>();
        input2.add(1);
        input2.add(14);
        input2.add(1);

        List<Integer> input9 = new ArrayList<>();
        input3.add(15);

        System.out.println(noTeen(input7)); // Output: [12, 20]
        System.out.println(noTeen(input8)); // Output: [1, 1]
        System.out.println(noTeen(input9)); // Output: []
  
//  13 Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean) 
        List<String> input11 = new ArrayList<>();
        input11.add("aaa");
        input11.add("bbb");
        input11.add("aza");

        List<String> input12 = new ArrayList<>();
        input12.add("hziz");
        input12.add("hzello");
        input12.add("hi");

        List<String> input13 = new ArrayList<>();
        input13.add("hello");
        input13.add("howz");
        input13.add("are");
        input13.add("youz");

        System.out.println(noZ(input11)); // Output: ["aaa", "bbb"]
        System.out.println(noZ(input12)); // Output: ["hi"]
        System.out.println(noZ(input13)); // Output: ["hello", "are"]
        
//  14  Given a list of strings, return a list of the strings, omitting any string length 4 or more.
        List<String> input14 = new ArrayList<>();
        input14.add("this");
        input14.add("not");
        input14.add("too");
        input14.add("long");

        List<String> input15 = new ArrayList<>();
        input15.add("a");
        input15.add("bbb");
        input15.add("cccc");

        List<String> input16 = new ArrayList<>();
        input16.add("cccc");
        input16.add("cccc");
        input16.add("cccc");

        System.out.println(noLong(input14)); // Output: ["not", "too"]
        System.out.println(noLong(input15)); // Output: ["a", "bbb"]
        System.out.println(noLong(input16)); // Output: []
        
//  15  Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
        List<String> input21 = new ArrayList<>();
        input21.add("a");
        input21.add("bb");
        input21.add("ccc");

        List<String> input22 = new ArrayList<>();
        input22.add("a");
        input22.add("bb");
        input22.add("ccc");
        input22.add("dddd");

        List<String> input23 = new ArrayList<>();
        input23.add("ccc");
        input23.add("dddd");
        input23.add("apple");

        System.out.println(no34(input21)); // Output: ["a", "bb"]
        System.out.println(no34(input22)); // Output: ["a", "bb"]
        System.out.println(no34(input23)); // Output: ["apple"]
       
 // 16 Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.        
     
            List<String> input33 = new ArrayList<>();
            input33.add("a");
            input33.add("b");
            input33.add("c");

            List<String> input34 = new ArrayList<>();
            input34.add("a");
            input34.add("b");
            input34.add("cy");

            List<String> input35 = new ArrayList<>();
            input35.add("xx");
            input35.add("ya");
            input35.add("zz");

            System.out.println(noYY(input33)); // Output: ["ay", "by", "cy"]
            System.out.println(noYY(input34)); // Output: ["ay", "by"]
            System.out.println(noYY(input35)); // Output: ["xxy", "yay", "zzy"]
            
            
            
//  17   Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.          
            
            List<Integer> input44 = new ArrayList<>();
            input44.add(1);
            input44.add(2);
            input44.add(3);

            List<Integer> input45 = new ArrayList<>();
            input45.add(2);
            input45.add(6);
            input45.add(11);

            List<Integer> input46= new ArrayList<>();
            input46.add(0);

            System.out.println(two2(input44)); // Output: [4, 6]
            System.out.println(two2(input45)); // Output: [4]
            System.out.println(two2(input46)); // Output: [0]  
            
 //  18 Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
            List<Integer> input55= new ArrayList<>();
            input55.add(3);
            input55.add(1);
            input55.add(4);

            List<Integer> input56 = new ArrayList<>();
            input56.add(1);

            List<Integer> input57 = new ArrayList<>();
            input57.add(2);

            System.out.println(square56(input55)); // Output: [19, 11]
            System.out.println(square56(input56)); // Output: [11]
            System.out.println(square56(input57)); // Output: [14]
                      
	}
	

	  public static List<Integer> square56(List<Integer> nums) {
	        List<Integer> result = new ArrayList<>();
	        for (int num : nums) {
	            int squaredAndPlus10 = num * num + 10;
	            if (squaredAndPlus10 % 10 != 5 && squaredAndPlus10 % 10 != 6) {
	                result.add(squaredAndPlus10);
	            }
	        }
	        return result;
	    }
	  
	  
    public static  List<Integer> two2(List<Integer> nums) {
        // Create a new list to store the results.
        List<Integer> results = new ArrayList<>();

        // Iterate over the input list and multiply each number by 2.
        for (Integer num : nums) {
            int doubledNum = num * 2;

            // If the doubled number does not end in 2, then add it to the results list.
            if (doubledNum % 10 != 2) {
                results.add(doubledNum);
            }
        }

        // Return the results list.
        return results;
    }


	public static List<String> noYY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            String modifiedStr = str + "y";
            if (!modifiedStr.contains("yy")) {
                result.add(modifiedStr);
            }
        }
        return result;
    }
	 public static List<String> no34(List<String> strings) {
	        List<String> result = new ArrayList<>();
	        for (String str : strings) {
	            int length = str.length();
	            if (length != 3 && length != 4) {
	                result.add(str);
	            }
	        }
	        return result;
	    }
	public static List<String> noLong(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.length() < 4) {
                result.add(str);
            }
        }
        return result;
    }
	
	 public static List<String> noZ(List<String> strings) {
	        List<String> result = new ArrayList<>();
	        for (String str : strings) {
	            if (!str.contains("z")) {
	                result.add(str);
	            }
	        }
	        return result;
	    }
	 public static List<Integer> noTeen(List<Integer> nums) {
	        List<Integer> result = new ArrayList<>();
	        for (int num : nums) {
	            if (num < 13 || num > 19) {
	                result.add(num);
	            }
	        }
	        return result;
	    }
	
	public static List<Integer> no9(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num % 10 != 9) {
                result.add(num);
            }
        }
        return result;
    }
	
	 public static List<Integer> noNeg(List<Integer> nums) {
	        List<Integer> result = new ArrayList<>();
	        for (int num : nums) {
	            if (num >= 0) {
	                result.add(num);
	            }
	        }
	        return result;
	    }
	
	public static  List<String> noX(List<String> strings) {
	    List<String> result = new ArrayList<>();
	    for (String str : strings) {
	        result.add(str.replace("x", ""));
	    }
	    return result;
	}
	
	public static List<String> lower(List<String> strings) {
	    List<String> result = new ArrayList<>();
	    for (String str : strings) {
	        result.add(str.toLowerCase());
	    }
	    return result;
	}


	public static List<Integer> rightDigit(List<Integer> nums) {
	    List<Integer> result = new ArrayList<>();
	    for (int num : nums) {
	        int rightmostDigit = num % 10;
	        result.add(rightmostDigit);
	    }
	    return result;
	}
	
	public static List<Integer> math1(List<Integer> nums) {
	    List<Integer> result = new ArrayList<>();
	    for (int num : nums) {
	        int modifiedNum = (num + 1) * 10;
	        result.add(modifiedNum);
	    }
	    return result;
	}
	
	public static List<String> moreY(List<String> strings) {
		List<String> result = new ArrayList<>();
		for (String str : strings) {
			String modifiedStr = "y" + str + "y";
			result.add(modifiedStr);
		}
		return result;
	}

	public static List<String> copies3(List<String> strings) {
		List<String> result = new ArrayList<>();
		for (String str : strings) {
			String copy = str + str + str;
			result.add(copy);
		}
		return result;
	}

	public static List<String> addStar(List<String> strings) {
		List<String> result = new ArrayList<>();
		for (String str : strings) {
			result.add(str + "*");
		}
		return result;
	}

	public static List<Integer> square(List<Integer> nums) {
		List<Integer> squaredList = new ArrayList<>();
		for (int num : nums) {
			squaredList.add(num * num);
		}
		return squaredList;
	}

	public static List<Integer> doubling(List<Integer> nums) {
		List<Integer> doubledList = new ArrayList<>();
		for (int num : nums) {
			doubledList.add(num * 2);
		}
		return doubledList;
	}

}
