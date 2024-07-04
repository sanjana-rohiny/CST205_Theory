package Thread.rabit.suspend_resumr;

public class SprintThreadTest {

	public static void main(String[] args) {

		SprintThread rabbit = new SprintThread("Rabbit");

		// start_sprint() is a local function which calls thread.start()
		// or simply call rabbit.start()
		
		rabbit.start_sprint();

		// now from main, after 10 seconds rabbit will be suspended.
		// then resume rabbits sprint after 5 seconds

		// 1. wait for 3 seconds
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}

		//2. Suspend Rabbits sprint.
		System.out.println("Suspending thrad for 5 seconds....!");
		rabbit.suspend();
		
		//3. Resumes sprint after 5 seconds
		// 3.1. so wait for 5 seconds
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		// 3.2. resume rabbits sprint
		System.out.println("Resuming thrad...!");
		rabbit.resume();
		
		// continue for 10 seconds
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		
		// stopping sprint...!
		System.out.println("Stopping thrad after 10 seconds...!");
		rabbit.stop_sprint();

	}

}
