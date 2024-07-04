package Synchronize_Satement;

public class Callme2 {

	// class simulating shared resource
	
	public void printName(String name) {
		 
		System.out.print("[" + name);
		 
		 try {
			 	Thread.sleep(1000);
			 	
			 } catch(Exception e) {}
		 
		 System.out.print("]");
	}
}