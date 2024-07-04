package teat123;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Test321 {

	public static void main(String[] s) {
		
		try {
		BufferedInputStream bis = new BufferedInputStream(System.in);
		
		
		while(true) {
			int i = bis.read();
			System.out.print((char)i);
		}
	} catch (IOException e) {
		
	}
	}

}
