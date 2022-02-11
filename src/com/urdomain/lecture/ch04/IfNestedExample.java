package com.urdomain.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
		
		
//		int score = 55;
//		String grade = "";
//		
//		if(score >= 90) {
//			if(score >= 95)
//			{
//				grade = "a+입니다";
//			}
//			grade = "a입니다";
//				
//		}
//		if(score >= 80) {
//			
//			if(score >= 85) {
//				grade = "b+입니다";
//			}
//			grade = "b입니다";
//		}
//		if(score >= 70) {
//			if(score >= 75) {
//				grade = "c+입니다";
//			}
//			grade = "c입니다";
//		}
//		
//		if(score >= 60) {
//			if(score >= 65) {
//				grade = "d+입니다";
//			}
//			grade = "d입니다";
//		}else {
//			grade ="f입니다";
//		}
//		
//		
//		System.out.println(grade);
		
		
		
		
		int x = -10;
		int y = -4;
		String str ="";
		
		if(x > 0 && y > 0 ) {
			
			str = "제 1사분면입니다";
			
		}else if(x < 0 && y > 0) {
			
			str = "제 2사분면입니다";
			
		}else if(x < 0 && y < 0) {
			
			str ="제 3사분면입니다";
		}else {

			str ="제4사분면입니다";
		
		
		}
		System.out.println(str);
	}
	

}
