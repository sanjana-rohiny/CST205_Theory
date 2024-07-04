package employeetest;

public class Employee {

	private String name;
	private int age;
	private String phoneNo;
	private String address;
	private int salary;
	
	public Employee(String name, int age, 
			String phoneNo, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("Salary of employee [" + name + "] = " + salary);
	}
}

class Manager extends Employee{
	private String department;
	public Manager(String name, int age, String phoneNo,
			String address, int salary, String department) {
		super(name, age, phoneNo, address, salary);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

class Officer extends Employee {
	
	private String specialization;
	public Officer(String name, int age, String phoneNo, 
			String address, int salary, String specialization) {
		super(name, age, phoneNo, address, salary);
		this.specialization = specialization;
	}
}
    
    


