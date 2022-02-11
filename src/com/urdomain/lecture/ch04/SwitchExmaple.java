package com.urdomain.lecture.ch04;

public class SwitchExmaple {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * (6 - 1 + 1) + 1) ;
		int num2 = (int)(Math.random() * (6 - 1 + 1) + 1) ;
		int sum = 0;
		switch(num) {
		
			case 1:
				System.out.println("첫번째주사위는" + num + "입니다");
				break;
			case 2:
				System.out.println("첫번째주사위는" + num + "입니다");
				break;
			case 3:
				System.out.println("첫번째주사위는" + num + "입니다");
				break;
			case 4:
				System.out.println("첫번째주사위는" + num + "입니다");
				break;
			case 5:
				System.out.println("첫번째주사위는" + num + "입니다");
				break;
			default :
				System.out.println("첫번째주사위는" + num + "입니다");
				break;
		}
		
		switch(num2) {
		
			case 1:
				System.out.println("두번째주사위는" + num2 + "입니다");
				break;
			case 2:
				System.out.println("두번째주사위는" + num2 + "입니다");
				break;
			case 3:
				System.out.println("두번째주사위는" + num2 + "입니다");
				break;
			case 4:
				System.out.println("두번째주사위는" + num2 + "입니다");
				break;
			case 5:
				System.out.println("두번째주사위는" + num2 + "입니다");
				break;
			default :
				System.out.println("두번째주사위는" + num2 + "입니다");
				break;
		}
		
		
		sum = num + num2;
		
		System.out.println("두주사위의합은" + sum + "입니다");
		
		
		
		

	}

}
