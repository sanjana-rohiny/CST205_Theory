
package pack1;

public class PolimorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapeRectangle = new Rectangle(); // Using Shape reference
        Rectangle directRectangle = new Rectangle(); // Using Rectangle reference

        shapeRectangle.draw(); // Calls the overridden method in Rectangle
        
        // shapeRectangle.calculateArea(); 
        // Compilation error - calculateArea() not in Shape class

        directRectangle.draw(); // Calls the overridden method in Rectangle
        directRectangle.calculateArea(); // Calls the method in Rectangle
        
       
	}

}
