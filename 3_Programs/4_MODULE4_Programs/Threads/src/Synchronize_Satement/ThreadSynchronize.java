package Synchronize_Satement;

public class ThreadSynchronize extends Thread {
	Callme2 callmeObj;
	String name;

	ThreadSynchronize(Callme2 callmeObj, String name) {
		this.callmeObj = callmeObj;
		this.name = name;
	}

	public void run() {

		synchronized (callmeObj) {
			callmeObj.printName(name);
		}
	}
}
