package com.urdomain.lecture.ch08;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassB 에서 method1 실행");
	}

	@Override
	public void method2() {
		MyInterface.super.method2();

	}

	

}
