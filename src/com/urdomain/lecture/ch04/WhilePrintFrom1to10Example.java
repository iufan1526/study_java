package com.urdomain.lecture.ch04;

import java.util.Scanner;

public class WhilePrintFrom1to10Example {

	public static void main(String[] args) {
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하라면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println();
			
		}while(! inputString.equals("a") ); {
			
			System.out.println();
			System.out.println("프로그램종료");
			
			
		}
	}

}
