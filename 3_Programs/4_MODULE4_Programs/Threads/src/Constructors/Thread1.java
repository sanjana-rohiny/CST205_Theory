package Constructors;

public class Thread1 extends Thread {
	
	public void run() {
		int meter = 0;
		while(true) {
			
			System.out.println("Thrad Name = " + this.getName() 
					+ " meter = " + meter++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
