package com.urdomain.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String str1 = "김승태";
		String str2 =  "김승태";
		String str3 = new String("김승태");
		
		boolean result1 = (str1 == str2);
		System.out.println(result1);
		
		boolean result2 = (str1 == str3);
				System.out.println(result2);
				System.out.println(str1.equals(str2));
				System.out.println(str1.equals(str3));
			
	}

}
