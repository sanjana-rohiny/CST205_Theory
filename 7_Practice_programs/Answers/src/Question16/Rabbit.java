package Question16;

public class Rabbit extends Thread {

	int len;
	Rabbit() {
		len = 0;
	}
	public void run() {

		while (len <= 200) {
			System.out.println("Rabbit - length - " + len);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			len += 20;

			if (len == 100) {
				try {
					Thread.sleep(12000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
		System.out.println("Rabbit - Completed race");

	}

}
