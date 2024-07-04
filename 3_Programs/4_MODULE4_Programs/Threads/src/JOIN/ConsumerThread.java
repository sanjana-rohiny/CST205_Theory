package JOIN;

public class ConsumerThread extends Thread {

	Thread producerThread;
	DataClass dataObj;
	
	
	public ConsumerThread(Thread t, DataClass d) {
		producerThread = t;
		dataObj = d;
	}

	public void run() {
		
		try {
			
System.out.println("ConsumerThread : Wait till producer exit");
			// call 
			//join on other thread, and the current thread will wait...
producerThread.join();
			
			String data = dataObj.consumeData();
			System.out.println("ConsumerThread : Consumes Data = " + data);
			System.out.println("ConsumerThread:: Thread exits...!");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
