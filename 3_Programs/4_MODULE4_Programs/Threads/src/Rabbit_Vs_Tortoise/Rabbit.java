package Rabbit_Vs_Tortoise;

public class Rabbit extends Thread {
	Rabbit(String name) {
		super(name);
	}
	
	public void run() {
		int count = 0;
		while(count <= 50) {
			System.out.println(this.getName() +
					"  meter = " + count++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(this.getName() +
				"  Finished the race.....!");
	}
}
