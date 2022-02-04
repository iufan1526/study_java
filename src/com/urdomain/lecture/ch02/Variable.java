package com.urdomain.lecture.ch02;

public class Variable {

	public static void main(String[] args) {
		
		
	
		boolean by = false;
		
		byte aa = 1;
		int bb = 0;
		short cc = 0;
		long dd = 0;
		
		
		float ee = 0.0f;
		double qq = 0.0;
		
		
		char qwe = ' ';
		String dqqw = "";
		
		
		// 리너털 = 데이터 
		
		
		// 이스케이프 문자
		System.out.println("\t 한칸들여쓰기");
		System.out.println("\n 한줄바꾸기");
		
		System.out.println("\' ㅎㅎ  \'");
		System.out.println("\"ㅎㅎㅎㅎ \"");
		System.out.println("\\");
		
		
//		변수의 범의
//		변수는 선언된  블럭이내에서만 사용가능 
		
		
		if(aa == 1) {
			int aaa = 10;
			int bbb = aaa + aa;
			System.out.println(bbb);
			
		}
		else {
			
			
		}
		
//		System.out.println(bbb); error
		
		
		
		
	}

}
