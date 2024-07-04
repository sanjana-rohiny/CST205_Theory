package thirdthread;

public class FirstThreadExTest {

	public static void main(String[] args) {
		int count = 0;
		FirstThreadEx t1 = new FirstThreadEx("Rabbit");
		FirstThreadEx t2 = new FirstThreadEx("Tortoise");
		FirstThreadEx t3 = new FirstThreadEx("Fox");

		
		t1.thread.start(); 
		t2.thread.start();
		t3.thread.start();
		 
		// or can run as below
		//t1.start();
		//t2.start();
		//t3.start();
		
	}
}
