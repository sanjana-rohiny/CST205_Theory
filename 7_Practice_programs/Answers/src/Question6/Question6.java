package Question6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question6 {
	static void readWriteFile() throws IOException {
		File f1 = new File("out.dat");
		if (f1.exists() == false) {
			f1.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(f1);
		DataOutputStream dout = new DataOutputStream(fos);

		dout.writeDouble(3.14);
        dout.writeInt(100);
        dout.writeBoolean(true);
        dout.writeChar('A');

		FileInputStream fis = new FileInputStream(f1);
		DataInputStream din = new DataInputStream(fis);

        double dVal = din.readDouble();
        int iVal = din.readInt();
        boolean bVal = din.readBoolean();
        char cVal = din.readChar();
        
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);
        System.out.println("bVal = " + bVal);
        System.out.println("cVal = " + cVal);

	}
	
	public static void main (String[] a) {
		try {
			readWriteFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
