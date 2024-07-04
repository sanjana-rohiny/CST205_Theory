package secondthread;

public class FirstThread2 implements Runnable {

	String name;
	FirstThread2(String name) {
		this.name = name;
	}


	public void run() {
		int count = 0;
		
		while(true) {
			System.out.println(this.name +"  meter = " + count++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}

}
