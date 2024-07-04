package JOIN;

public class JoinTest {

	public static void main(String[] args) {

		DataClass dataObj = new DataClass();
		
		ProducerThread producerThread = new ProducerThread(dataObj);
		producerThread.setName("ProducerThread");
		
		ConsumerThread consumerThread = new ConsumerThread(producerThread, dataObj);
		consumerThread.setName("ConsumerThread");
		
		// starting consumer thread, before producing data
		System.out.println("ConsumerThread:: Thread Starts...!");
		consumerThread.start();
		
		// starting producer thread, to produce data
		System.out.println("ProducerThread:: Thread Starts...!");
		producerThread.start();
		
	}

}
