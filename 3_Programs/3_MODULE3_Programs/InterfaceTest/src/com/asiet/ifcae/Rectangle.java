package com.asiet.ifcae;

public class Rectangle extends Shape implements Description{

	// overriden for base class
	public void draw() {
		System.out.println("Rectangle:: No of Sides = 4");

	}

	// implemented for interface
	public void printInfo() {
	System.out.println("Rectangle:: printInfo()");
	}
	
	// function of Rectangle class
	public void localFunction() {
		System.out.println("I am inside Rectangle::localFuction()");
	}
}
