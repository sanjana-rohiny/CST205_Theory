package com.asiet.ifcae;

public class TestIface {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.draw();
		rect.printInfo();
		rect.testFunction();
		
		Triangle tri = new Triangle();
		tri.draw();
		tri.printInfo();		
		tri.testFunction();		
		
		Description d = new Rectangle();
		d.testFunction();
		
	}
}
