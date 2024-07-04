package Constructors;

public class Thread4 implements Runnable {

	String name;
	Thread4(String name) {
		this.name = name;
	}
	
	public void run() {
		int meter = 0;
		Thread.currentThread().setName(name);
		
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
