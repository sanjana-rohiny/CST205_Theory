package thirdthread;

public class FirstThreadEx implements Runnable {

	Thread thread;
	FirstThreadEx(String name) {
		thread = new Thread(this, name);
	}
	
	// local function to call thread.start
	public void start() {
		thread.start();
	}
	
	public void run() {
		int count = 0;
		
		while(true) {
			System.out.println(thread.getName() +"  meter = " + count++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}

}
