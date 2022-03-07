package com.urdomain.lecture.ch08;

public class Television implements RemoteControl{
	
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;	
		}else if(volume<RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
			
		}else {
			this.volume = volume;
		}
		System.out.println("현재tv볼륨 :" + volume);
		
	}

	public int getVolume() {
		return volume;
	}
	
	

}
