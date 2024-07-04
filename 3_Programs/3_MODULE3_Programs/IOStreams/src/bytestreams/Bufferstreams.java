package bytestreams;

import java.io.*;
// this program reads data from input.txt and writes to output.txt
public class Bufferstreams {

	public static void main(String[] a) {

		try {
			/* for read operation */
			// create FileInputStream to read from disc

			FileInputStream fis = 
					new FileInputStream("input.txt");

			// wrap FileInputStream with BufferedInputStream
			BufferedInputStream bis = 
					new BufferedInputStream(fis);

			/* For write operation */
			// Create FileOutputStream to write to disc
			FileOutputStream fos = 
					new FileOutputStream("output.txt");

			// wrap FileOutputStream with BufferedOutputStream
			BufferedOutputStream bos = 
					new BufferedOutputStream(fos);

			int data;
			while ((data = bis.read()) != -1) {
				
				System.out.print((char) data);
				bos.write(data);
			}
			
			// bis, and bos to closse before fis and fos
			bis.close();
			fis.close();
			
			bos.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//Notes
//=============
/* 
* BufferedInputStream in Java is a class that provides 
* a buffered input stream. 
* It works by adding a layer of buffering to an 
* existing InputStream, 
* which helps improve the efficiency of reading data 
* from the input source. 
* 
* Buffering: 
* When you create a BufferedInputStream, 
* it wraps an existing InputStream. 
* The BufferedInputStream internally maintains a 
* buffer (an array of bytes) 
* to temporarily store data read from the 
* underlying InputStream. 
* 
* This buffering helps reduce the number of actual
*  read operations 
* from the underlying source, which can be slow, 
* by reading data in larger chunks.
* 
* Buffer Size: The size of the buffer can be 
* configured when you create 
* a BufferedInputStream, typically with a 
* constructor parameter. 
* The default buffer size is 8192 bytes (8KB), 
* but you can specify a 
* different size based on your needs.
* 
* Advantage: Less number of Disc I/O access.
* 
*/

