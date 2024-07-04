//package com.java.uml;
import java.util.ArrayList;
import java.util.List;

class Hospital {
	private List<Doctor> doctorPanel;
	
	public void setDoctorsPanel(List<Doctor> doctorList) {
		this.doctorPanel = doctorList;
	}
	
	public void printDoctorList() {		
		for (int i=0; i<doctorPanel.size(); i++) {
			System.out.println("Doctor [" + i + "] = " + doctorPanel.get(i).getName()); 
		}
	}
	
	protected void finalize() {
		System.out.println("delete Hospital class");
	}
}

class Doctor {
	private String name;
	private int Id;
	Doctor(String name, int id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	
	protected void finalize() {
		System.out.println("delete Doctor class");
	}
}

public class Aggregation {

	public static void main(String[] srgs) {
		
		Doctor alice = new Doctor("Alice", 100);
		Doctor bob = new Doctor("Bob", 101);
		Doctor sam = new Doctor("Sam", 102);
		Doctor eric = new Doctor("Eric", 103);
		
		List <Doctor> list = new ArrayList<Doctor>();
		list.add(alice);
		list.add(bob);
		list.add(sam);
		list.add(eric);
		
		Hospital hospital = new Hospital();
		hospital.setDoctorsPanel(list);
		hospital.printDoctorList();
		
		// delete whole class
		// invoke "whole"  class deallocation.
		hospital = null;
		System.gc();
		System.runFinalization();
		
		// Observe from print statement, that only hospital class is deleted
		
		// part class is still valid even after whole class is deleted
		System.out.println(alice.getName());
		System.out.println(bob.getName());
		System.out.println(sam.getName());
		
	}
}
