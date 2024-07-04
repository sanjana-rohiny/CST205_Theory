package bytestreams;
import java.io.*;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreams {	
	public static void main (String[] s) {
		try {
			// write data ...!
		    //1. open a file 
			File f1 = new File("out.dat");
			if (f1.exists() == false) {
				f1.createNewFile();
			}
			//2. create FileInputStream wrapped by DataInputStream
			FileOutputStream fos = 
					new FileOutputStream(f1);
			DataOutputStream dout = 
					new DataOutputStream(fos);

			//3. write primitive data (float, int, boolean, char)
			dout.writeDouble(3.14);
	        dout.writeInt(100);
	        dout.writeBoolean(true);
	        dout.writeChar('A');

	        // read data from the same file out.data			
	        //1. create FileOutputStream wrapped by DataOutputStream
	        // using same file object f1
			FileInputStream fis = 
					new FileInputStream(f1);
			DataInputStream din = 
					new DataInputStream(fis);

			//2 Read data
	        double dVal = din.readDouble();
	        int iVal = din.readInt();
	        boolean bVal = din.readBoolean();
	        char cVal = din.readChar();
	        
	        System.out.println("dVal = " + dVal);
	        System.out.println("iVal = " + iVal);
	        System.out.println("bVal = " + bVal);
	        System.out.println("cVal = " + cVal);		
	        
	        dout.close();
	        fos.close();
	        
	        din.close();
	        fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}


// Notes
/*
DataInputStream and DataOutputStream are classes 
in Java used for 
reading and writing primitive data types and strings 
in a machine-independent way. 
( regardless of BigEndian or LittleEndian

These classes provide methods for reading and
 writing data in a binary format

Common methods include 
	-> readInt(), readDouble(), readBoolean(), and readUTF() for reading UTF-8 encoded strings.
	-> writeInt() writeDouble(), writeBoolean(), writeUTF()
*/