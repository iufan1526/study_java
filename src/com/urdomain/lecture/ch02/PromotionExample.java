package com.urdomain.lecture.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
		
		
		byte byteValue = 100;
		int intValue = byteValue;
		
		System.out.println("intValue:" + intValue);
		
		
		char charValue = '가';
		System.out.println("charValue:" + charValue);
		
		intValue = charValue;
		System.out.println("intValue:" + intValue);
		
		
		float floatValue = intValue;
		System.out.println("floatValue:" + floatValue);
		
		
		double doubleValue = intValue;
		System.out.println("doubleValue:" + doubleValue);
	}

}
