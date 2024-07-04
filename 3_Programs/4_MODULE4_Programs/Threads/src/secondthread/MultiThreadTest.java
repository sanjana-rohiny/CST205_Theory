package secondthread;

public class MultiThreadTest {

	public static void main(String[] args) {
		int count = 0;
		FirstThread2 t1 = new FirstThread2("Rabbit");
		FirstThread2 t2 = new FirstThread2("Tortoise");
		FirstThread2 t3 = new FirstThread2("Fox");

		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);

		//thread1.setPriority(Thread.MAX_PRIORITY);
		//thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
