package Synchronize_Method;

public class ThreadSyncronizeTest {
	public static void main(String[] args) {

		// create object of shared resource
		Callme callmeObj = new Callme();

		ThreadSyncronize t1 = new ThreadSyncronize(callmeObj, "One");
		ThreadSyncronize t2 = new ThreadSyncronize(callmeObj, "Two");

		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);

		thread1.start();
		thread2.start();
	}
}
