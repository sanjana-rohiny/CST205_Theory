package Constructors;

public class Thread2 extends Thread{
	
	Thread2(String name) {
		super(name);		
	}
	
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
