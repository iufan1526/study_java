package com.urdomain.lecture.ch07;

public class MyFriendDetailInfo extends MyFriendInfo {
	
	private String address;
	private String number;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void printFriend() {
		
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("주소: " + getAddress() );
		System.out.println("전화번호: "+ getNumber());
		
	}
	

}
