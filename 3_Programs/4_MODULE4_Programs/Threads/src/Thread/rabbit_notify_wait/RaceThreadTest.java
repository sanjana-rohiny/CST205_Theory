package Thread.rabbit_notify_wait;

public class RaceThreadTest {

	public static void main(String[] args) {

		RaceThread rabbit = new RaceThread("Oswald Rabbit");
		
		rabbit.my_start();
		
		// run for 5 seconds...!
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("Sprint Suspend for 5 seconds....!");
		rabbit.my_suspend();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("Sprint Resumes ...!");
		rabbit.my_resume();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("Sprint Suspend for 5 seconds....!");
		rabbit.my_suspend();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("Sprint Resume for 5 seconds....!");
		rabbit.my_resume();
	}

}
