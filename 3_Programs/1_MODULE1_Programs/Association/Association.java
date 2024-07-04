//package com.java.association;

class Hospital {
	private Doctor doctor;
	
	public void addDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public void printCEO() {		
		System.out.println("Hospital CEO = " + ceo.getName()); 
	}
}

class Doctor {
	private String name;
	private int Id;

	Doctor(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Id = 1;
	}

	public String getName() {
		return name;
	}
}

public class Association {

	public static void main(String[] srgs) {		
		
		System.out.println("---------One directional Association-----------");
		Doctor doctor = new Doctor("John Abraham");

		Hospital hospital = new Hospital();
		hospital.addDoctor(doctor);

		hospital.printDoctor();
	}
}
