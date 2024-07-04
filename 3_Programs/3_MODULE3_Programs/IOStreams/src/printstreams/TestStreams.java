package printstreams;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TestStreams {

	public static void wtiteFile() {
		try {
			PrintStream printStream = new PrintStream(new FileOutputStream("output.txt"));
			printStream.println("Hello, world!");
		} catch (IOException e) {
			e.printStackTrace();
			// Handle the IOException here, e.g., log the error or inform the user
		}

	}
	
	public static void writeSocket() {
		try {
		    Socket socket = new Socket("google.com", 80);
		    PrintStream printStream = new PrintStream(socket.getOutputStream());
		    printStream.println("HTTP GET /");
		    
		    System.out.println("Dine...!");

		} catch (IOException e) {
		    e.printStackTrace();
		    // Handle the IOException here, e.g., retry the connection or report the error
		}

	}

	public static void main(String[] args) throws IOException {

		// if flag = true -> automatically flushable,
		// that is no need to call flush()
		PrintWriter pw = new PrintWriter(System.out, false);
		pw.println("Hi How are you");
		pw.flush();

		// irrespective of flasg,
		// must call flush() to output to console
		PrintStream ps = new PrintStream(System.out, true);
		ps.write('a');
		ps.flush();
		
		
		wtiteFile();
	}
}
