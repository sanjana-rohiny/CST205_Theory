


import java.util.ArrayList;
import java.util.List;



class Hospital {
	private Doctor doctor;
	
	public Hospital(Doctor doctor) {
		// TODO Auto-generated constructor stub
		this.doctor = doctor;
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
	
}



public class Dependency {

	public static void main(String[] srgs) {
		
		Doctor alice = new Doctor("Alice", 100);
		
		//dependency injection...!
		Hospital hospital = new Hospital(alice);
	}
}

