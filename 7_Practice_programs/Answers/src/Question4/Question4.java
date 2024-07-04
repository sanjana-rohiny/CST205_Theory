package Question4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question4 {
	static void write_read_file() throws IOException {
		String line1 = "In the beginning God created the heaven and the earth.\n";
		String line2 = "And the earth was without form, and void; and darkness was upon the face of the deep.\n"; 
		String line3 = "And the Spirit of God moved upon the face of the waters.\n";
		
		FileWriter f = new FileWriter("output.txt");
		BufferedWriter w = new BufferedWriter(f);
		char buff[] = new char[line1.length()];
		line1.getChars(0, line1.length(), buff, 0);
		w.write(buff);
		w.write(line2);
		w.write(line3);
		w.close();
		
	
		FileReader fis = new FileReader("output.txt");		
		BufferedReader reader = new BufferedReader(fis);
		
		String str = null;
		while ((str = reader.readLine()) != null) {
			System.out.println(str);
		}
		reader.close();
	}
	
	public static void main(String[] args) {
		try {
			write_read_file();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
