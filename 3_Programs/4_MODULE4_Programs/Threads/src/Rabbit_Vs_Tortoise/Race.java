package Rabbit_Vs_Tortoise;

public class Race  {

	public static void main(String[] args) {

		Rabbit rabbit = new Rabbit("Oswald Rabbit");
		Tortoise tortiose = new Tortoise("Toby Turtle");

		rabbit.setPriority(Thread.MAX_PRIORITY);
		tortiose.setPriority(Thread.MIN_PRIORITY);

		System.out.println("race started....!");
		tortiose.start();
		rabbit.start();
		
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {}
			
		rabbit.suspend();
		System.out.println("Rabbit Sleeps for a while....!");

		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {}
		
		System.out.println("Rabbit Wakes up and  continue race....!");
		rabbit.resume();
	}
}
