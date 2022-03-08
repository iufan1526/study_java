package com.urdomain.lecture.function;

public class ComputerExample {

	public static void main(String[] args) {
		
		int a = 7;
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.println("원의 반지름:" + a);
		System.out.println();

		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + calculator.circle(a));
		
		System.out.println();
		
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + computer.circle(a));
	}

}
