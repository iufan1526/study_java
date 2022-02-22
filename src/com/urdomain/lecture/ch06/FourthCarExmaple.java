package com.urdomain.lecture.ch06;

public class FourthCarExmaple {

	public static void main(String[] args) {
		
		FourthCar fourthcar = new FourthCar();
		
		
		fourthcar.setGas(6);
		
		boolean getState = fourthcar.isLeftGas();
		if(getState) {
			System.out.println("출발합니다");
			fourthcar.run();
			
		}
		
		if(fourthcar.isLeftGas()) {
			System.out.println("gas를 주입할필요없습니다");
			
		}else {
			System.out.println("gas를 주입하세");
		}


	}

}
