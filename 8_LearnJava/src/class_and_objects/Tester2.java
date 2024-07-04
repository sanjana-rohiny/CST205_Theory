/*
 Implement a class Calculator with the instance variable and method mentioned below. 
 
 Method Description

 sumOfDigits()

    Calculate and return the sum of the digits of the num member variable

 Test the functionalities using the provided Tester class. 
 
 */
package class_and_objects;

class Calculator {
	
	private int digit;
	public Calculator (int digit) {
		this.digit = digit;
	}
	
	public int sumOfDigits() {
		int sum = 0;
		int rem = 0;
		while(digit != 0) {
			
			rem = digit % 10;
			digit = digit / 10;
			
			sum = sum + rem;
		}
		
		return sum;
	}
}

public class Tester2 {

	public static void main(String[] args) {

		Calculator calc = new Calculator(1234);
		System.out.println("Sum of Digits = " + calc.sumOfDigits());
	}

}
