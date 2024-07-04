package Question2;


public class Question2 {
	public static void main(String[] args) {
		Thread1 odd = new Thread1("OddNumber");
		Thread2 even = new Thread2("EvenNumber");

		odd.start();
		even.start();
	}
}

class Thread1 extends Thread {
	
	public Thread1(String name) {
		this.setName(name);
	}
	
	public void run() {
		
		for (int i=1; i<100; i++) {
			if (i%2 != 0) {
				System.out.println("Odd Number = " + i);
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Thread2 extends Thread {

	public Thread2(String name) {
		this.setName(name);
	}
	
	public void run() {
		

		for (int i=1; i<100; i++) {
			if (i%2 == 0) {
				System.out.println("Even Number = " + i);
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}