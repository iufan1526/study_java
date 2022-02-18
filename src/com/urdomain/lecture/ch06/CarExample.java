package com.urdomain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		
		System.out.println("car.name :" + car.name);
		System.out.println("car.model :" + car.model);
		System.out.println("car.color :" + car.color);
		System.out.println("car.maxSpeed :" + car.maxSpeed);
		System.out.println("car.speed :" + car.speed);
		
		
		car.speed  = 500;
		System.out.println("car.speed :" + car.speed);
		
		
		if (car.speed > car.maxSpeed) {
			System.out.println("차속도가 최고스피드보다 높습니다");
		}else {
			System.out.println("차속도가 최고스피드보다 높지않습니다.");
			
		}
	}

}
