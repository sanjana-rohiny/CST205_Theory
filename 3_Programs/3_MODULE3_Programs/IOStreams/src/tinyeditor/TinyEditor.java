package tinyeditor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEditor {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("Enter a line of text");
			System.out.println("Enter a quit to stop");

			String str[] = new String[100];
			for (int i = 0; i < 100; i++) {
				str[i] = br.readLine();
				if (str[i].equalsIgnoreCase("quit") == true) {
					break;
				}
			}
			System.out.println("Exit...!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
