package com.urdomain.lecture.ch07;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();
		
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flymode = SupersonicAirplane.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flymode = SupersonicAirplane.NOMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();

	}

}
