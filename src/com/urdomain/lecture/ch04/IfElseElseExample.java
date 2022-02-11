package com.urdomain.lecture.ch04;

public class IfElseElseExample {

	public static void main(String[] args) {
		
		int score = 75;
		
		if(score >= 90) {
			System.out.println("90점이상입니다");
			System.out.println("a입니다");
			
		}else if(score >= 80) {
			System.out.println("80점이상입니다");
			System.out.println("b입니다");
			
			
		}else if(score >= 70){
			System.out.println("70점이상입니다.");
			System.out.println("c입니다");
			
			
		}else if(score >= 60) {
			System.out.println("60점이상입니다.");
			System.out.println("d입니다");
			
		}else if(score >= 50){
			System.out.println("50점이상입니다.");
			System.out.println("e입니다");
			
			
		}else {
			System.out.println("50점미만입니다.");
			System.out.println("f입니다");
			
		}
		
		int a = 10;
		int b = 20;
		
		if(a > b) {
			System.out.println(">");
			
		}else if(a < b) {
			System.out.println("<");

		}else {
			System.out.println("==");
		}
		
	}
	
		

}
