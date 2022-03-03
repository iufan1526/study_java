package com.urdomain.lecture.ch06;

public class PersonExample {

	public static void main(String[] args) {
		
		Person person = new Person("123123-123123");
		
		person.name = "kim";
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);

	}

}
