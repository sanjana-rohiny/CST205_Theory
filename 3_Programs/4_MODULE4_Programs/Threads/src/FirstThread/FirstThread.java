package FirstThread;

public class FirstThread extends Thread {
	
	public FirstThread(String name) {
		super(name);
	}

	public void run() {
		int count = 0;
		while(true) {
			System.out.println(this.getName() +
					"  meter = " + count++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
	
}