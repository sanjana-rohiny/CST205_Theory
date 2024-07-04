

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionTest {

	
	// test try/catch/finally
	public static int exceptionTest(int num, int den) {
		int data = 0;
		try {
			System.out.println("Inside try Block");

			data = num / den;

		} catch (Exception e) {

			System.out.println("Inside Catch Block");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Inside Finally Block");
		}

		return data;
	}

	// Test throw exception
	public static int devideTest(int num, int den) {

		if (den == 0) {
			throw new ArithmeticException("Eerohjgjgjjg Division Error");
		}

		return num / den;
	}

	// Test throws exception
	public static int devideProc(int num, int den) 
			throws ArithmeticException {

		return num / den;
	}

	public static void testUncheckedException() {
		
		// UncheckedExceptions
		// are exception is not checked at comple time
		// If not handled, NO ERROR at compilation, but exception 
		// will hit at run time.
		
		// These kind of exception , 
		// for eg, ArithmeticException are derived from class Exception
		int i = 5/0;
		
		// another example is NumberFormatException, whcih is not
		// checked at compile time
		int data = Integer.parseInt("abc");
		
	}
	
	public static void testCheckedException() {
		
		// CheckedExceptions
		// are exception is checked at compile time
		// if not handled, will generate complation errors.
		
		// these kind of exception, 
		// for eg, IOException, FineNotFundException are
		// derived from class RunTimeException
		
		File file = new File("output.txt");
        if (false == file.exists()) {
        	// create a file,if does not exists
            try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String message = "Hello World...!";
        byte[] bytes = message.getBytes();
        try {
			fos.write(bytes);
	        fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally  {

		}
		
	}
	public static void main(String[] args) {

		//exceptionTest(100, 0);

		
		/*
		 * try { devideTest(100, 0); } catch (ArithmeticException e) {
		 * System.out.println("Exception in devideTeste()" + e.getMessage()); }
		 */
		 try { devideProc(100, 0); } catch (ArithmeticException e) {
		  System.out.println("Exception in devideProc()" + e.getMessage()); }
		 
	}
}

// Notes
//=======

/*
 * 
Exception:
=========
A Java exception is an OBJECT that describes an exceptional (that
is, error) condition that has occurred in a piece of code.

When an exceptional condition arises, an object representing that
exception is created and thrown in the method that caused the
error

The method may choose to handle the exception itself, or pass it
on. Either way, at some point, the exception is caught and processed

What will happen if exception is not handled ?
	Ans = Execution stops ...!
 
try: 
 The try block is used to enclose a block of code in which exceptions may occur. 
 It is followed by one or more catch blocks and optionally a finally block.
 
 catch: 
 The catch block is used to handle specific types of exceptions 
 that may be thrown within the corresponding try block. (trap exception) 
 You can have multiple catch blocks to handle different exception types.
 
 finally:
 The finally block is used to specify a block of code that is executed 
 regardless of whether an exception was thrown or not. 
 It's often used for cleanup operations, 
 such as closing resources (e.g., files or database connections).
 
 throw: 
 The throw keyword is used to explicitly throw an exception from a function. 
 When using throw, an exception object is created, 
 and it is "thrown" or passes it to the caller of the function. 
 You can throw predefined exceptions (e.g., IllegalArgumentException) 
 or create custom exceptions.
 
 
 throws: 
 The throws keyword is used in method declarations to indicate 
 that a method may throw specific exceptions. 
 It tells the caller of the method which exceptions they need to 
 handle or declare themselves.  This is part of the method's signature.
 Here, the method decides NOT to handle exception, and passes to caller.
 */

//Unchecked exception
//-------------------
/* Compiler does not check  to see whether
there is a method that handles or throws these exceptions.
That is, if not handed, still build will succeed.
They are derived from Class RunTimeException, Eg, ArithmeticException.
*/

//Checked exception
//-------------------
/* Compiler does check  to see whether
there is a method that handles or throws these exceptions.
That is, if not handed, compiler generate build error.
They are derived from Class Exception, Eg, IOException.
*/

//What if an exception is uncought ?
//--------------------------------
/*
 For eg, is there is a zero division,  the JVM will detect this 
 and create an exception object and throws it.
 
 If the function has not handled the exception, the exception is 
 caught by the default handler provided by the Java
 run-time system. 
 This cause program termnation.
 */

