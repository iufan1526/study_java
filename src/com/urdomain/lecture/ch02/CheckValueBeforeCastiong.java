package com.urdomain.lecture.ch02;

public class CheckValueBeforeCastiong {
	public static void main(String[] args) {
		
		int i = 123;
		
		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE )) {
			System.out.println("다시입력해주세요");
			System.out.println("i: " + i);
			
		}else {
			
			System.out.println("정상입니다");
			System.out.println("i: " + i );
			
		}
		
	}

}
