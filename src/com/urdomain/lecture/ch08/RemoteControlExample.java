package com.urdomain.lecture.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		
		Television television = new Television();
		
		television.turnOn();
		television.turnOff();
		
		
		RemoteControl remoteControl2 = new Television();
		
		
		remoteControl2.turnOn();
		remoteControl2.turnOff();

	}

}
