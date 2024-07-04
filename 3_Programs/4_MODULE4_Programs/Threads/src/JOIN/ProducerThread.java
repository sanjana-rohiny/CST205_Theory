package JOIN;

public class ProducerThread extends Thread {
	
	DataClass dataObj;
	public ProducerThread(DataClass d) {
		dataObj = d;
	}

	public void run() {
		
		System.out.println("ProducerThread::run()");

		dataObj.produceData();
		System.out.println("ProducerThread:: produces Data");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ProducerThread:: Thread exits...!");

	}
}
