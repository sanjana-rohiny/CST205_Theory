package com.asiet.ifcae;

public class Triangle extends Shape implements Description {

	// overriding function from base Shape
	public void draw() {
		System.out.println("Triangle:: No of Sides = 3");
	}

	// impemented for interface Descrition
	public void printInfo() {
		System.out.println("Rectangle:: printInfo()");
	}
	
}
