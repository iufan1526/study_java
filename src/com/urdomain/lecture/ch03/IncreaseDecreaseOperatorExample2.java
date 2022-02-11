package com.urdomain.lecture.ch03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		
		
		int x = 10;
		int y = 10;
		int a = 0;
		int b = 0;
//		++x; : 피연산자를 1증가시키고 다른연산 수행
//		x++; : 다른연산 수행후 피연선자 1증가 
		
		x++;
		System.out.println(x);
		++y;
		System.out.println(y);
		
		
		a = ++x;
		b = x++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	}	

}
