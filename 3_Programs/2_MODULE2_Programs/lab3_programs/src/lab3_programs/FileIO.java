package lab3_programs;
import java.io.*;
public class FileIO {
	
	static void readAndWriteFile() throws FileNotFoundException{
		
		FileInputStream fis = null;
		// create Inputstream object for reading
		
		
		fis  = new FileInputStream("input1.txt");
		
		try {
			if(fis.available() == -1) {
				System.out.println("file not available...return ...!");
				return;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f2 = null;
		// create output file
		f2 = new File("output.txt");
		if (f2.exists() == false) {
			try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileOutputStream fos = null;
		//create output stream for writing
		try {
			fos = new FileOutputStream(f2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = 0;
		byte byteArr[] = new byte[10];
		// read 10 bytes from input file
		try {
			while( fis.read(byteArr) != -1) {	
				System.out.println(new String(byteArr));
				// write to output file
				fos.write(byteArr);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				readAndWriteFile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
