package Rabbit_Vs_Tortoise;

public class Tortoise extends Thread {
	Tortoise(String name) {
		super(name);
	}
	
	public void run() {
		int count = 0;
		while(count <= 50) {
			System.out.println(this.getName() +
					"  meter = " + count++);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
			}
		}
		
		System.out.println(this.getName() +
				"  Finished the race.....!");
	}
}
