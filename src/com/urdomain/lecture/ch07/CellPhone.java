package com.urdomain.lecture.ch07;

public class CellPhone {
	
	
	String model = "";
	String color = "";
	
	
	
	void powerOn() {System.out.println("전원을 켭니다");}
	void powerOff() {System.out.println("전원을 끕니다");}
	void ball() {System.out.println("벨일울ㄹ비니다");}
	void sendvoice(String message) {System.out.println("상대방" + message);}
	void receiveVoice(String message) {System.out.println("자기" + message);}
	void hangUp() {System.out.println("전화를끈습니다");}
}
