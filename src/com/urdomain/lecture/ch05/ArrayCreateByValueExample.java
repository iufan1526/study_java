package com.urdomain.lecture.ch05;

public class ArrayCreateByValueExample {

	public static void main(String[] args) {
//		
//		
//		int[] score;
//
//		int score2[];
//		
//		int[] score3 = {1,2,3};
//		
//		int score4[] = {4,5,6};
//		
//	
		
		// 입력되는 데이터 타입이 동일해야한다.
		// 순서는 0부터 시작 index
		//총갯수를 원할하게 늘릴수없음.
		
		
		int[] score = {80, 90, 94};
		
		
		int sum = 0;
		double avg = 0;
		for(int i = 0;i <= 2; i++) {
			
			sum += score[i];
		}
			avg = (double)sum / 3;
		
		System.out.println("총합은:" + sum);
		System.out.println(avg);
	}

}
