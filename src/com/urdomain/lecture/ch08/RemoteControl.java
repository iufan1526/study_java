package com.urdomain.lecture.ch08;

public interface RemoteControl {
	
	
	public String name = "tony";
	
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	
	void turnOn();
	void turnOff();
	void setVolume (int volume);
	
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 헤체합니다");
		}
	}
	
	
	public static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}

}
