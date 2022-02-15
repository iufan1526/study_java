package com.urdomain.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {
		
		int num = 0 ;
		
		
	
		for(int j = 1; j <= 5; j++) {
			System.out.print(j +"번째:\t");
			
			for(int i = 0; i <= 5; i++) {
				
				num = (int)(Math.random() * (45 - 1 + 1) + 1);
				System.out.print(num + "\t");
				
			}
			System.out.print("\n");
		
		}

	}

}
