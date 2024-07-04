//
// Aggregation:  Represents a whole-part relationship where the whole is composed of parts, 
// but the parts can exist independently of the whole. 
// That is De[artment composed of Employee (whole - part)
// Can be 1 to 1 or 1 to many
// Here the example is 1 to many
//
package class_diagram;

import java.util.List;
import java.util.ArrayList;

class Department {
    private String name;
    // Aggregation: Department is a whole, Employees are parts
    private List<Employee> employees; 
    
    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public void getDepartmentDetails() {
        System.out.println("Dept name : " + name);
        
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName());
        }        
    }

}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
}


public class AggregationTester {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee> ();
		employees.add(new Employee("Alice John"));
		employees.add(new Employee("Bob Antony"));
		employees.add(new Employee("Cindy Paul"));
		employees.add(new Employee("Dan Brown"));
		
		Department dept = new Department("CSE", employees);
		dept.getDepartmentDetails();
	}

}
