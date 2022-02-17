package com.urdomain.lecture.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] scores = {{10,20}, {30,40}, {50,60}};
		
		
		for(int i=0; i<scores.length; i++) {
			
			for(int j=0; j<scores[i].length; j++) {
				
				System.out.println(scores[i][j]);
				
			}
		}
	
	}

}
