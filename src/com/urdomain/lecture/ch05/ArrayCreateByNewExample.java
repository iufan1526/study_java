package com.urdomain.lecture.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		
		for(int i = 0;i <= 2; i++) {
			
			System.out.println("arry1["+i+"]" + arr1[i]);
		}
		
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;

		
		for(int i = 0;i <= 2; i++) {
			
			System.out.println("arry1["+i+"]" + arr1[i]);
		}
		
//		
//		double[] arr2 = new double[3];
//		
//		for(int i = 0;i < 3; i++) {
//			
//			System.out.println("arry2["+i+"]" + arr2[i]);
//			
//		}
//		
//		arr2[0] = 1.0;
//		arr2[1] = 2.0;
//		arr2[2] = 3.0;
//		
//		
//		String[] arr3 = new String[3];
//		
//		for(int i = 0;i < 3; i++) {
//			
//			System.out.println("arry3["+i+"]" + arr3[i]);
//		}
//		
//		arr3[0] = "김승태";
//		arr3[1] = "핵고수";
//		arr3[2] = "승태";
//		for(int i = 0;i < 3; i++) {
//			
//			System.out.println("arry3["+i+"]" + arr3[i]);
//			
//		}
		
	}
		
	
	

}
