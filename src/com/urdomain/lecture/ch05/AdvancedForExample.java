package com.urdomain.lecture.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		int[] score = {96,71,42,42,21};
		
		int a = 0;
		for(int scores : score) {
			
			System.out.println(a +": scores :" + scores);
			a++;
		}
		
		System.out.println();
		
		for(int i=0; i<score.length; i++) {
			
			System.out.println(score[i]);
		}
		

	}

}
