package com.urdomain.lecture.ch06;

public class CalculatorExmaple {

	public static void main(String[] args) {
		
		
		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		
		int result1 = calculator.plus(5,6);
		System.out.println("result1: " + result1);
		
		
		byte x = 10;
		byte y = 5;
		
		double result2 = calculator.divide(x, y);
		System.out.println("result2: " + result2);
		
		
		calculator.powerOff();
	}

}
