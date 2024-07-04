package com.asiet.ifcae;

public interface Description {	
	public void printInfo();
		
	default public void testFunction() {
		System.out.println("testFunction");
	}
}
