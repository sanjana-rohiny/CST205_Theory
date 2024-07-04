
// Creating user defined exception, extending Exception
// very important topic...!
class ASIETException extends Exception{
	
	ASIETException(String message)  {
		// invoke base class with custom message..!
		super(message);
	}
}

public class UserDefinedExceptionTest {

	public static int devideTest(int num, int den) 
			throws ASIETException{

		if (den == 0) {
			throw new ASIETException("Zero Division Error");
		}

		return num / den;
	}
	
	public static void main(String[] args) {
		try {
			devideTest(100, 0);
		} catch (ASIETException e) {
			System.out.println("Exception in devideProc() : " + e.getMessage());
		}
	}

}
