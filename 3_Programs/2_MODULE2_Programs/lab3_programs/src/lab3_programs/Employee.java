package lab3_programs;


public class Employee {
	private String name;
	private int age;
	private String address;
	protected int salary;
	
	public Employee(String name, int age, String address, int salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		
	}

	
	final public void printData() {
		System.out.println("Employee: name = " + name);
		System.out.println("Employee: salary = " + salary);

	}
	
	public void finalize() {
		System.out.println("Object is deletd...!");
	}
	
	
	public static void mainas(String[] args) {
		// TODO Auto-generated method stub

		//Employee emp1 = new Employee("Alice", 30, null, 30000);
		Doctor doc = new Doctor("bob", 40, "asasas", 30000, "MS");
		doc.printData();
		
		
	}

}


