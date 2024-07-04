/*
 Implement a class Rectangle with the instance variables and methods mentioned below. 
 
  Method Description

calculateArea()

    Calculate and return the area of the rectangle. The area should be rounded off to two decimal digits.

calculatePerimeter()

    Calculate and return the perimeter of the rectangle. The perimeter should be rounded off to two decimal digits.

Test the functionalities using the provided Tester class
 
 */

package class_and_objects;

class Rectangle {
	
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int calculateArea() {		
		return length * breadth;
	}

	public int calculatePerimeter() {		
		return 2* (length + breadth);
	}

}

public class Tester3 {

	public static void main(String[] args) {
	
		Rectangle rect = new Rectangle(10,20);
		System.out.println("Area of Rectangle = " + rect.calculateArea());
		System.out.println("Perimeter of Rectangle = " + rect.calculatePerimeter());
	}
}
