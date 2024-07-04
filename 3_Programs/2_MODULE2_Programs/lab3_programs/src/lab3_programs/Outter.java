package lab3_programs;

public class Outter {
	
	protected String name;
	protected int age;
	public Outter(String name, int age) {
		super();
		this.name = name;
		this.age = age; 
	}
	
	public void calculatePremium () {
		System.out.println("Medical Insurance premium = 3000");	
	}
	
	public void printOutterData() {
		System.out.println("Class = " + this.getClass().getSimpleName());
		System.out.println("\tName = " + name);
		System.out.println("\tage= " + age);
		System.out.println();
	}

	public class InnerMember {
		private String address;
		private int salary;
		public InnerMember(String address, int salary) {
			this.address = address;
			this.salary = salary;
		}
		
		public void printInnerData() {
			System.out.println("Class = " + this.getClass().getSimpleName());
			System.out.println("\taddress = " + address);
			System.out.println("\tsalary = " + salary);
			System.out.println("\tName = " + name);
			System.out.println("\tage = " + age);
			System.out.println();

		}

	}

	public static class innerStatic {
		private String department;
		
		public innerStatic(String department) {
			this.department = department;
		}
		
		public void printInnerStaticData() {
			System.out.println("Class = " + this.getClass().getSimpleName());
			System.out.println("\tdepartment = " + department);
		}
	}
	
	
	public static void main (String[] args) {
		Outter outterObj = new Outter("Alice", 30);
		outterObj.printOutterData();
		
		Outter.InnerMember innerMember = outterObj.new InnerMember("New Delhi", 30000);		
		innerMember.printInnerData();
		
		Outter.innerStatic innerStatic = new Outter.innerStatic("Pay Roll");
		innerStatic.printInnerStaticData();
		
		Outter anonymousOutter = new Outter("Bob", 50)
		{
			 public void calculatePremium(){
				 
				System.out.println("Anonymous Outter class");
				System.out.println("calculatePremium()");

				System.out.println("name = " + name);
				System.out.println("age = " + age);

				if (age <= 30) { 
					System.out.println("Medical Insurance premium = 3000");
				} else if (age <= 40) {
					System.out.println("Medical Insurance premium = 4000");
				} else if (age <= 50) {
					System.out.println("Medical Insurance premium = 5000");
				} else if (age <= 60) {
					System.out.println("Medical Insurance premium = 6000");
				} else if (age <= 70) {
					System.out.println("Medical Insurance premium = 7000");
				} else {
					System.out.println("Medical Insurance premium = 10000");
				}
			}
		};
		
		anonymousOutter.calculatePremium();
	}
}
