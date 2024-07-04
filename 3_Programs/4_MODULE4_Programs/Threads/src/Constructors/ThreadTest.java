package Constructors;

public class ThreadTest {
	
	static void test1() {
		// testing thread1 class
		Thread1 t1 = new Thread1();
		t1.setName("Rabbit");
		t1.start();		
	}
	
	static void test2() {
		// testing thread2 class
		Thread2 t2 = new Thread2("Tortoise");
		t2.start();		
	}

	static void test3() {
		// testing thread3 class
		Thread3 myRunnable = new Thread3();
		Thread t3 = new Thread(myRunnable);
		t3.setName("Fox");
		t3.start();
	}

	static void test4() {
		// testing thread4 class
		Thread4 myRunnable = new Thread4("Camel");
		Thread t4 = new Thread(myRunnable);
		t4.start();
	}

	static void test5() {
		// testing thread5 class
		Thread5 myRunnable = new Thread5();
		Thread t5 = new Thread(myRunnable, "Deer");
		t5.start();
	}

	public static void main(String[] args) {
	
		test5();
		
		
	}

}
