package Thread.rabbit_notify_wait;

public class RaceThread extends Thread {

	boolean suspendFlag = false;

	RaceThread(String name) {
		super(name);
	}

	public void my_start() {
		System.out.println("Sprint Started ....!");
		suspendFlag = false;
		this.start();
	}

	public void my_suspend() {
		suspendFlag = true;
	}

	public synchronized void my_resume() {
		suspendFlag = false;
		this.notify();
	}

	// rabbit cover 1 meter in one seconds/
	public void run() {


		int count = 0;
		while (true) {

			synchronized (this) {

				while (suspendFlag) {
					try {
						this.wait();
					} catch (InterruptedException e) {
					}
				}
			}

			System.out.println(this.getName() + "  meter = " + ++count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}
}
