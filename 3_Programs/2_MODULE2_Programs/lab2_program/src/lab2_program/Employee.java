package lab2_program;

public class Employee {
	private String name;
	private int age;
	private String phoneNo;
	private String address;
	protected int salary;
	private int array[];
	public static final int abc = 10;
	
	public Employee(String name, int age, String phoneNo, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
		array = new int[5];
		for(int i=0; i<5; i++) {
			array[i] = i+1;
		}
	}
	
	
    //setters and getters for few attributes
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	public void printArray(int n) {
		if(n==0) return;
		
		System.out.println(n);
		printArray(n-1);

	}
	public void printSalary() {
		System.out.println("Salsry of [" + name + "] = " + salary );
	}
	
	public void test() {
		System.out.println("Insuide test() --> no argument");
	}

	public void test(int a) {
		System.out.println("Insuide test(int a) --> a =" + a);
	}

	public void test(int a, int b ) {
		System.out.println("Insuide test(int a int b) --> a =" + a + " b = " + b);
	}

	public void test(short a) {
		System.out.println("Insuide test(short a) --> a =" + a);
	}
	
	public void test(String a) {
		System.out.println("Insuide test(String a) --> a =" + a);
	}
	
	public void test(Employee a) {
		System.out.println("Insuide test(Employee a) --> a =" + a);
	}
	
	public  void finalize() {
		System.out.println("Object deleted..!");
	}
	
}
