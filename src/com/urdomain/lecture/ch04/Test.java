package com.urdomain.lecture.ch04;

public class Test {

	public static void main(String[] args) {
		
		int sum = 0;
		int sum2 = 0;
		for(int i = 2;i <= 9; i++) {
			System.out.println(i + "단");
			
			for(int j = 1;j <= 9; j++ ) {
				System.out.println(i + "X" + j + "=" + (sum = i * j ) );
							
				if(sum % 2 == 0) {
					
					sum2 += sum;
					System.out.println("짝수의합은" + sum);
				}else {
					
					sum2 += sum;
					System.out.println("홀수의합은" + sum);
				}
				
			}
			
			
		}

	}

}
