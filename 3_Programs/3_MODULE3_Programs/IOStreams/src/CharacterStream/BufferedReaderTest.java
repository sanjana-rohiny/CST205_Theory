package CharacterStream;

import java.io.*;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		try {
			System.out.println("Character Stream");
			FileReader fis = new FileReader("malayalam.txt");
			BufferedReader reader = new BufferedReader(fis);

			FileWriter fos = new FileWriter("c_output.txt");
			BufferedWriter writer = new BufferedWriter(fos);

			String line; int i =1;
			while ((line = reader.readLine()) != null) {
				String str = i + " " + line + "\n";
				i ++;
				System.out.println(str);
				writer.write(str);
			}
			
			writer.close();
			fos.close();
			
			reader.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
