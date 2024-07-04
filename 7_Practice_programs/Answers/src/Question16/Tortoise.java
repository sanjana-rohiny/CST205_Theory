package Question16;

public class Tortoise extends Thread {
	int len;
	Tortoise() {
		len = 0;
	}
	public void run() {

		while (len <= 200) {
			System.out.println("Tortoise - length - " + len);
			len += 10;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		System.out.println("Tortoise - Completed race");

	}
}
