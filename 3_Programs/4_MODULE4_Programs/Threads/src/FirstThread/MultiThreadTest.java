package FirstThread;

public class MultiThreadTest {

	public static void main(String[] args) {
		int count = 0;
		FirstThread t1 = new FirstThread("Rabbit");
		FirstThread t2 = new FirstThread("Tortoise");
		FirstThread t3 = new FirstThread("Fox");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		
		t2.start();
		//t3.start();
	}
}
