package exception;

public class MultipleTry {

	
	/*
	 * If an inner try lacks a handler for a specific exception, 
  	   the stack is checked, and the next try's handlers are inspected.
  	   here res = num1/den1; is not handled in inner try, 
  	   but eventually its get handled in outer exception...!
	 */
	static void testMultipleTry(String num, String den) {

		int num1, den1, res;

		try {
			num1 = Integer.parseInt(num);
			den1 = Integer.parseInt(den);
			
			try {				
				res = num1/den1;
			}catch (NullPointerException e2) {
				System.out.println("Exception-Inner ..! "+ e2.getMessage());
			}
			
		} catch (Exception e1) {
			System.out.println("Exception-Outer ..!" + e1.getMessage());
		}
	}
	
	
	static void testMultipleTryEx() {

	        try {
	            // Outer try block
	            int[] numbers = { 1, 2, 3 };
	            System.out.println("Accessing element at index 3: " + numbers[3]);

	            try {
	                // Inner try block
	                String text = null;
	                System.out.println("Length of text: " + text.length()); // This will throw a NullPointerException
	            } catch (NullPointerException innerException) {
	                System.out.println("Caught an inner NullPointerException: " + innerException.getMessage());
	            }
	        } catch (ArrayIndexOutOfBoundsException outerException) {
	            System.out.println("Caught an outer ArrayIndexOutOfBoundsException: " + outerException.getMessage());
	        }    
	}

	public static void main(String[] args) {
		testMultipleTry("10", "0");

	}

}


//NOTES
/*
  The try statement can be nested within another try.
  
  When entering a try statement, the context of that exception is added to a stack.

  If an inner try lacks a handler for a specific exception, 
  the stack is checked, and the next try's handlers are inspected.

  This process continues until a matching catch is found, 
  or all nested try blocks are checked.

  If no catch matches, the Java runtime system handles 
  the exception and program terminates.

*/