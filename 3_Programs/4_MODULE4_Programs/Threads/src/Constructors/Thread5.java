package Constructors;

public class Thread5 implements Runnable {

	public void run() {
		int meter = 0;
		String name = Thread.currentThread().getName();
		
		while(true) {
			
			System.out.println("Thrad Name = "  + name
					+ " meter = " + meter++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
