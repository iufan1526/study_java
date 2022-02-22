package com.urdomain.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {
		
		
		SecondCar secondcar = new SecondCar();
		SecondCar secondcar2 = new SecondCar("k5");
		SecondCar secondcar3 = new SecondCar("k5" , "red");
		SecondCar secondcar4 = new SecondCar("k5" , "red",300);
		
		System.out.println(secondcar2.model);
		System.out.println(secondcar3.model + secondcar3.color);
		System.out.println(secondcar4.model + secondcar4.color + secondcar4.maxSpeed);
		
		

	}

}
