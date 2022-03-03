package com.urdomain.lecture.ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {
		
		MyFriendDetailInfo myFriend = new MyFriendDetailInfo();
		
		
		myFriend.setName("홍길동");
		myFriend.setAge(23);
		myFriend.setAddress("경기도 성남시");
		myFriend.setNumber("010-8007-1234");
		
		myFriend.printFriend();

	}

}
