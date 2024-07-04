//package com.java.composition;

import java.util.ArrayList;
import java.util.List;

class University {
	private List<Department> deptList;
	
	public University() {
		// TODO Auto-generated constructor stub
		deptList = new ArrayList<Department>();
	}
	
	public void addDepartment(String name, int id) {
		
		//life of department tightly coupled to that of University
		Department dept = new Department(name, id);
		deptList.add(dept);
	}
	
	public void printDepartments() {		
		for (int i=0; i<deptList.size(); i++) {
			System.out.println("Department [" + i + "] = " + deptList.get(i).getName()); 
		}
	}
	
	protected void finalize() {
		System.out.println("delete Hospital class");
	}
} 

class Department {
	private String name;
	private int Id;
	
	Department(String name, int id) {
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

public class Composition {

	public static void main(String[] srgs) {	
		
		University university = new University();
		
		university.addDepartment("CS", 100);
		university.addDepartment("AI", 101);
		university.addDepartment("EEE", 102);
		university.addDepartment("DS", 103);
		
		university.printDepartments();
		
		System.out.println("Deleting Composition class");
		
		
		// For compiling , use javac -Xlint:deprecation Composition.java
		
		// delete whole class
		// invoke "whole"  class deallocation.
		university = null;
		System.gc();
		System.runFinalization();
		// Observe from print statement, 
		// that both hospital and doctor class are deleted
		// 
	}
	
}
