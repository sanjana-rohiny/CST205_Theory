package lab3_programs;
/*
 * Test class to study
 * - static variable
 * - static function
 * - static block
 * - Static class can be used only for Nested class
 */

public class StaticTest {

	public static int staticValue = 0;
	public int nonStaticData = 200;
	StaticTest() {
		System.out.println("New Object Created");
	}
	/*
	 * Static block
	 * Executed only once
	 */
	static {
		System.out.println("####->Inside static block ");
		staticValue = 100;
	}
	
	public static void staticFunction() {
		System.out.println("staticValue = " + staticValue);
		
		//int localVar = nonStaticData;
		//int localVar = this.staticValue;
	}
	
	public void nonStaticFunction() {
		System.out.println("Inside -> nonStaticFunction");
		/* "this" keyword is available only in NON Static function */
		int local = this.staticValue;
	}
	
	/*
	 * static class can be used only in nested class
	 */
	static class InnerClass {
		private int value;
		
		InnerClass(int value) {
			this.value = value;
		}
		
	}
	
	public static void mainy (String[] args) {
		
		/*
		 * Property 1- static value retain among objects
		 * becase all objects share same memory
		 */
		
		System.out.println();

        // initialize static value using first object - stObj1
		StaticTest stObj1 = new StaticTest();
		System.out.println("Initial value = " + stObj1.staticValue);
		stObj1.staticValue += 10;
		System.out.println("Value in stObj1 = " + stObj1.staticValue);

		System.out.println();
		
		// create stObj2, and find staticValue retain in Object2
		StaticTest stObj2 = new StaticTest();
		System.out.println("Value in stObj2 = " + stObj2.staticValue);
  
		/*
		 * Property 2 : Static variable can be accessed 
		 * using Class name. No need to create object
		 */
		int x = StaticTest.staticValue;
		System.out.println("x = " + x);
		/*
		 * Property 3 : Static functions can be accessed 
		 * using Class name. No need to create object
		 */
		System.out.println();
		StaticTest.staticFunction();
		
		/*
		 * Property 4: static methods can only call other static methods 
		 * thats why uncommenting below code give syntax error
		 *    --> StaticTest.nonStaticFunction();
		 *  
		 */
		 //StaticTest.nonStaticFunction();
		
		/*  
		 * Property 5: static methods must only access static data.
		 * Refer public static void staticFunction()
		 * verify, non static data can not be accesses in static function
		 */
		
		/*  
		 * Property 6: static methods can NOT refer to "this" keyword or "super"
		 * Refer public static void staticFunction()
		 * verify, reference to "this." create error. 
		 */
	}
}
/*.
– 
– .
*/