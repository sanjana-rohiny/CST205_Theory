package consolereader;

import java.io.*;

public class ConsoleIO {

	static void consoleRead() {
		String str = null;

		try {
			BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter line ....(stop to quit)");
			do {
				str = br.readLine();
				System.out.println(str);
			} while (true != str.equalsIgnoreCase("stop"));
			System.out.println("Exit...!");
		} catch (IOException e) {

		}
	}

	static void consoleWrite(String message) {
		try {
			// Create a BufferedWriter to write to System.out (console)
			BufferedWriter consoleWriter = 
					new BufferedWriter(
							new OutputStreamWriter(System.out));

			// Now you can write to the console using consoleWriter
			consoleWriter.write(message);
			consoleWriter.newLine(); // Optionally, add a newline character

			// Don't forget to flush the writer to ensure the output is displayed
			consoleWriter.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		consoleWrite("Hello world ...!");
		consoleRead();
	}
}
