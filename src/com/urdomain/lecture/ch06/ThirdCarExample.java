package com.urdomain.lecture.ch06;

public class ThirdCarExample {

	public static void main(String[] args) {
		
		ThirdCar thirdCar1 = new ThirdCar();
		
		System.out.println(thirdCar1.company);
		System.out.println();
		
		
		ThirdCar thirdCar2 = new ThirdCar("자가용");
		System.out.println(thirdCar2.company);
		System.out.println(thirdCar2.model);
		System.out.println();
		
		
		ThirdCar thirdCar3 = new ThirdCar("자가용" , "빨강");
		System.out.println(thirdCar3.company);
		System.out.println(thirdCar3.model);
		System.out.println(thirdCar3.color);
		System.out.println();
		
		ThirdCar thirdCar4 = new ThirdCar("자가용" , "빨강" , 300);
		System.out.println(thirdCar4.company);
		System.out.println(thirdCar4.model);
		System.out.println(thirdCar4.color);
		System.out.println(thirdCar4.maxSpeed);
		System.out.println();
	}

}
