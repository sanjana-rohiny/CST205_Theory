package Synchronize_Method;

public class ThreadSyncronize implements Runnable{
	Callme callmeObj;
	String name;
	ThreadSyncronize(Callme callmeObj, String name) {
		this.callmeObj = callmeObj;
		this.name = name;
	}
	
	public void run() {
		callmeObj.printName(name);
	}
}