package com.urdomain.lecture.ch03;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		
		int score = 85;
		
	//	char grade = (score > 90 ? 'a' : 'b');
		char grade = (score > 90 ? 'a' : (score > 80 ? '@' : 'b') );
			System.out.println(grade);
						

	}

}
