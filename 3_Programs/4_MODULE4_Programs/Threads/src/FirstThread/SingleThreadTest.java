package FirstThread;

public class SingleThreadTest {

	public static void main(String[] args) {
		FirstThread t1 = new FirstThread("Rabbit");
		t1.start();
		
		
		while(true) {
			System.out.println("Main Thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
