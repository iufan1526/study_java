package com.urdomain.lecture.ch03;

public class StringConcatExample {

	public static void main(String[] args) {
		
		
		String str1 = "JDK" + 1.8;
		String str2 = str1 + "입니다.";
				
		System.out.println(str2);
		
		
		String strA = "김승태";
		String strB = "01080071526";
		String strC = strA + ":"+  strB ;
		
		
		
		System.out.println("strC:" + strC);

	}

}
