import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);

            // Create a producer thread
            Thread producerThread = new Thread(() -> {
                try {
                    String message = "Hello from the producer!";
                    outputStream.write(message.getBytes());
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Create a consumer thread
            Thread consumerThread = new Thread(() -> {
                try {
                    int data;
                    while ((data = inputStream.read()) != -1) {
                        System.out.print((char) data);
                    }
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Start the threads
            producerThread.start();
            consumerThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

