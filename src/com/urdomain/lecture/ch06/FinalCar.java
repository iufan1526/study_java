package com.urdomain.lecture.ch06;

public class FinalCar {
	
	private int speed;
	private boolean stop;
	
	
	
	public int getSpeed() {
		
		return speed;
	}
	
	public void setSpeed() {

		if(speed < 0) {
			this.speed = 0; 
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		
		return stop;
	}

	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
