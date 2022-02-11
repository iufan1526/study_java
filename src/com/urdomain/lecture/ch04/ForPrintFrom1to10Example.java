package com.urdomain.lecture.ch04;

public class ForPrintFrom1to10Example {

	public static void main(String[] args) {
		
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			
			for(int j = 1; j <= 9; j++) {
				
				
				System.out.println(i + "X" + j + "=" + ( i * j ) );
				
			}
		
			
		}
		
		int sum = 0;
		
		for(int i = 1; i <=10 ; i++)
		{
			sum += i;
			
		}
		System.out.println(sum);

	}

}
