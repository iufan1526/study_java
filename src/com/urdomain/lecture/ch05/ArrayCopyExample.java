package com.urdomain.lecture.ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[5];
		
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length-1);
		
		for(int j=0; j<arr2.length; j++) {
			
			System.out.println(arr2[j]);
		}
	
//		arr2[3] = 4;
//		arr2[4] = 5;
//		
//		
//		for(int j=0; j<arr2.length; j++) {
//			
//			System.out.println(arr2[j]);
//		}

	}

}
