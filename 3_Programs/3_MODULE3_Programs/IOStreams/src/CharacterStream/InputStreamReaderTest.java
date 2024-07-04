package CharacterStream;

import java.io.*;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try {
			// FileInputStream is byte stream
			InputStream inputStream = new FileInputStream("malayalam.txt");

			// its converted into CHar stream
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8"); // Specify character
																								// encoding

			// Char Stream is wrapped by BufferReader
			BufferedReader reader = new BufferedReader(inputStreamReader);

			// now prepare to write data into c_output.txt
			// FileOutputStream is byte stream
			OutputStream outputStream = new FileOutputStream("c_output.txt");

			// its converted into CHar outputStreamWriter
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8"); // Specify character
																									// encoding

			// outputStreamWriter is wrapped by BufferedWriter
			BufferedWriter writer = new BufferedWriter(outputStreamWriter);

			String line;
			// Only BufferedReader has readLie() which read line by line
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				// write each line of text
				writer.write(line);
			}

			reader.close();
			writer.close();

		} catch (IOException e) {

		}
	}

}

// Notes
/*
 * An InputStreamReader in Java is a bridge between byte-oriented input streams
 * (like FileInputStream..etc.) and character-oriented readers (like
 * BufferedReader, FileReader, etc.).
 * 
 * Its primary purpose is to convert bytes from an input stream into characters
 * based on a specified character encoding
 * 
 * Below is Byte Stream InputStream inputStream = new
 * FileInputStream("malayalam.txt");
 * 
 * Below code converts Byte Stream FileInputStream to Char streams
 * InputStreamReader inputStreamReader = new InputStreamReader(inputStream,
 * "UTF-8"); // Specify character
 * 
 */
