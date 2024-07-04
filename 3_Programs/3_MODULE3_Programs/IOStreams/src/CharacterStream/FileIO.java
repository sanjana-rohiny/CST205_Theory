package CharacterStream;

import java.io.*;

public class FileIO {
	public static void main(String[] args) {
		try {
			System.out.println("Character Stream");
			FileReader fin = new FileReader("malayalam.txt");
			FileWriter fout = new FileWriter("c_output.txt");

			char arr[] = new char[20];
			int bytesRead = 0;
			while ((bytesRead = fin.read(arr)) != -1) {
				System.out.println(new String(arr));
				fout.write(arr, 0, bytesRead);
			}
			
			fin.close();
	        fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
