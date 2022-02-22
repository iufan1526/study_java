package com.urdomain.lecture.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		
		
		Korean korean = new Korean();
		
		
		Korean korean2 = new Korean("전지현","2313123121");
		System.out.println(korean.nation);
		System.out.println(korean.name);
		System.out.println(korean);

		
		
		
		System.out.println(korean2.nation);
		System.out.println(korean2.name);
		System.out.println(korean2.ssn);
		
		
	}

}
