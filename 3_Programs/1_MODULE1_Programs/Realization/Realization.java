

interface  Printside {
	void printSides();
}

 class Shape {
	
	public void printInfo() {
		System.out.println("Base Class : Function-printInfo()");
	}
}

class Rectangle extends Shape implements Printside {
	
	public void printSides() {
		System.out.println("Rectangle:: No of sides =  4");
	}
}

class Triangle extends Shape implements Printside {
	
	public void printSides() {
		System.out.println("Triangle:: No of sides =  3");
	}
}

class Hexagon extends Shape implements Printside {
	
	public void printSides() {
		System.out.println("Hexagon:: No of sides =  6");
	}
}


class Realization {

	public static void main(String[] args) {
	
		Printside rect = new Rectangle();
		rect.printSides();
		
		Printside tri = new Triangle();
		tri.printSides();
		
		Printside hex = new Hexagon();
		hex.printSides();
		
		// implement multiple inheritance
		Rectangle rect1 = new Rectangle();
		rect1.printSides();
		rect1.printInfo();
		
		// implement multiple inheritance
		Triangle tri1 = new Triangle();
		tri1.printSides();
		tri1.printInfo();

		// implement multiple inheritance
		Hexagon hex1 = new Hexagon();
		hex1.printSides();
		hex1.printInfo();
	}
}
