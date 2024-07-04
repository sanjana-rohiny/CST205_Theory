package exception;

public class MultipleCatch {

	
	static void testMultipleCatch(String num, String den) {

		int num1, den1, res;

		try {
			num1 = Integer.parseInt(num);
			den1 = Integer.parseInt(den);
			
			res = num1/den1;
		} catch (NumberFormatException e1) {
			System.out.println(e1.getMessage());

		}catch (ArithmeticException e2) {
			System.out.println(e2.getMessage());

		}
		
	}
	
	public static void main(String[] args) {

		testMultipleCatch("10", "0");
	}

}

// NOTES
/*
In some cases, more than one exception could be raised by a
single piece of code. 
To handle this type of situation, you can specify two or more catch
clauses, each catching a different type of exception.

When an exception is thrown, each catch statement is inspected
in order, and the first one whose type matches that of the
exception is executed.

After one catch statement executes, the others are bypassed, and
execution continues after the try / catch block.
  
*/

//EXCEPTION Order in Catch
/*
Subclasses must come before any of their superclasses

This is because a catch statement that uses a superclass will
catch exceptions of that type plus any of its subclasses.

Thus, a subclass would never be reached if it came after its
superclass. Further, in Java, unreachable code is an error, 
and result in COmpilation Error
*/