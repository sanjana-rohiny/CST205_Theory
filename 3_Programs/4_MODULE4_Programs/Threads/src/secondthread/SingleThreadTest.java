package secondthread;

public class SingleThreadTest {

	public static void main(String[] args) {
		int count = 0;
		FirstThread2 t1 = new FirstThread2("Rabbit");
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		System.out.println(Thread.currentThread());
		
	}
}
