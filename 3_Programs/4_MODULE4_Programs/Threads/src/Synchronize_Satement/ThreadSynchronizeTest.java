package Synchronize_Satement;


public class ThreadSynchronizeTest {

	public static void main(String[] args) {
		
		// create simulation of shared resource
		Callme2 callmeObj = new Callme2();

		ThreadSynchronize t1 = new ThreadSynchronize(callmeObj, "One");
		ThreadSynchronize t2 = new ThreadSynchronize(callmeObj, "Two");

		t1.start();
		t2.start();
	}

}
