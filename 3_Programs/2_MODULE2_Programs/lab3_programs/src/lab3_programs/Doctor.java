package lab3_programs;

public class Doctor extends Employee{
	
	private String specialization;
	public Doctor(String name, int age, String address, int salary, String specialization) {
		super(name, age, address, salary);
		// TODO Auto-generated constructor stub
		this.specialization = specialization;
	}
	
	public void print_info() {
		System.out.println("Specialization = " + specialization);
	}
} 
