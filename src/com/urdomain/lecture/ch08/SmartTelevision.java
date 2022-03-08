package com.urdomain.lecture.ch08;

public class SmartTelevision implements RemoteControl , Searchable {
	
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다");		
	}

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		}else if (volume<RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		}else {
			this.volume = volume;
		}
	}
	
	

}
