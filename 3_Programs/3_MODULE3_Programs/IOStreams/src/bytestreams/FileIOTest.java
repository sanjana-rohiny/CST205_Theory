package bytestreams;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOTest {
    public static void main(String[] args) {
    	FileOutputStream fos;
		try {
			
			
            // open file for write using fileoutputstream
    		fos = new FileOutputStream("output.txt");
    		// write some data
            String message = "In the beginning God created the heavens and the earth. Now the earth was formless and empty, darkness was over the surface of the deep, and the Spirit of God was hovering over the waters. And God said, \"Let there be light,\" and there was light.";

            byte[] bytes = message.getBytes();
            fos.write(bytes);
            fos.close();
            
            System.out.println("Data has been written to the file.");
        	System.out.print("\r\n\r\n");
            
            // now read from file into a byte array
            FileInputStream fis =
            		new FileInputStream("output.txt");
            
            if(fis.available() == -1) {
                System.out.println("file not avaiable...!");
                return;
            }
            
            // define bytearray
            /*byte[] buffer = new byte[1024];
            int bytesRead;

            System.out.println("Data read from the file using read(bytearray):");
            
            while ((bytesRead = fis.read(buffer)) != -1) {
            	System.out.print(new String(buffer, 0, bytesRead));
            }
        	System.out.print("\r\n\r\n");
        	*/
            int data = 0;
        	while ((data = fis.read()) != -1) {
            	System.out.print((char) data);
            }
        	
        	
        	
        	fos.close();
        	fis.close();
            
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    }
}
