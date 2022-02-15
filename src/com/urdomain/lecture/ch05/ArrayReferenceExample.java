package com.urdomain.lecture.ch05;

public class ArrayReferenceExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		
		strArray[0] = "김승태";
		strArray[1] = "김승태";
		strArray[2] = new String("김승태");
		
		
		
		for(int i=0; i<strArray.length; i++) {
			
			System.out.println(strArray[i]);
		}
		
		
		
		if(strArray[0] == strArray[1]) {
			
			System.out.println("참조가같습니다");
			
			
		}else {
			System.out.println("참조가다릅니다");
		}
			if(strArray[0] == strArray[2]) {
				
				System.out.println("참조가같습니다");
				
				
			}else {
				System.out.println("참조가다릅니다");
		}
		if(strArray[0].equals( strArray[2])) {
			
			System.out.println("문자열이같습니다");
			
			
		}else {
			System.out.println("문자열이다릅니다");
		}
		
	

	}

}
