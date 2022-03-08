package com.urdomain.lecture.function;

public class Computer extends Calculator {

	@Override
	public double circle(double param) {
		return param * param * Constants.PAI_2;
	}
	

}
