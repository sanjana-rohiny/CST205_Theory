package Thread.rabit.suspend_resumr;

public class SprintThread extends Thread {

	private boolean startFlag = false;
	
	SprintThread(String name) {
		super(name);
	}
	
	public void start_sprint() {
		startFlag = true;
		this.start();
	}
	
	public void stop_sprint() {
		startFlag = false;
	}
	
	// rabbit cover 1 meter in one seconds/
	public void run() {
		
		System.out.println("Sprint started ....!");

		int count = 0;
		while(startFlag == true) {
			System.out.println(this.getName() +
					"  meter = " + ++count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Sprint Completed ....!");

	}
	
}
