package com.urdomain.lecture.ch03;

public class LogiccalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if((charCode >= 65) && (charCode <= 90 )) {
			System.out.println("대문자 이군요");
		}
		
		if((charCode >= 97) && (charCode<=122)) {
			System.out.println("true");
			
		}
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("true");
			
		}
		
		if((charCode >= 65 ) | (charCode <= 90)) {
			System.out.println("true");
		}
		
		if((charCode >=97) || (charCode <=122)) {
			
			System.out.println("true");
		}
		
		if(!(charCode < 48) || !(charCode > 57)) {
			
			System.out.println("true");
		}
		
		int value = 6;
		if((value%2 == 0) || (value%3 == 0))
		{
			System.out.println("true");
		}

	}

}
