package Synchronize_Method;

public class Callme {

	// class simulating shared resource
	public synchronized void printName(String name) {
		 
		System.out.print("[" + name);
		 
		 try {
			 	Thread.sleep(1000);
			 	
			 } catch(Exception e) {}
		 
		 System.out.print("]");
	}
}
