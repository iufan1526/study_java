package com.urdomain.lecture.ch08;

public interface MyInterface {
	
	void method1();
	
	
	default void method2() {
		System.out.println("MyInterface 에서 method2 실행");
	}

}
