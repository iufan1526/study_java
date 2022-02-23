package com.urdomain.lecture.ch06;

public class SixCar {
	
	String model;
	int speed;
	
	public SixCar(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		
		this.speed = speed;
	}
	
	
	public void run() {
		
		for(int i =10; i<=50; i+=10) {
			setSpeed(i);
			System.out.println(model + "시속" + speed + "km");
			
		}
	}
	

}
