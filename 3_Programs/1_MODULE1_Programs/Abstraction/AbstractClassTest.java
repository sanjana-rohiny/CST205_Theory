
abstract class Shape {
	
	//abstract method
	abstract public void printSides();
	
	// non abstract method
	public void printInfo() {
		System.out.println("Abstract class:Non Abstract Function: printInfo");
	}
		
}

class Rectangle extends Shape {
	
	public void printSides() {
		System.out.println("Rectangle:: No of sides =  4");
	}
	
	public void testFunction() {
		System.out.println("Base class:Non Overriden Function: testFunction");
	}
	
}

class Triangle extends Shape {
	
	public void printSides() {
		System.out.println("Triangle:: No of sides =  3");
	}
}

class Hexagon extends Shape {
	
	public void printSides() {
		System.out.println("Hexagon:: No of sides =  6");
	}
}
public class AbstractClassTest {
	public static void main(String args[]) {
		
		Shape rect1 = new Rectangle();
		Shape tri1 = new Triangle();
		Shape hex1 = new Hexagon();
		rect1.printSides();
		tri1.printSides();
		hex1.printSides();
		
		// Not possible to ccall non overridden finction of derived class using base class object
		// rect1.testFunction();
		
	}
}

