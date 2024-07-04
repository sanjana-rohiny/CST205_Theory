package Question3;

import java.util.StringTokenizer;

public class Question3 {
static int calculatePin(String input) {
		
		StringTokenizer sTok = new StringTokenizer(input);
		
		System.out.println("Size = " + sTok.countTokens());
		
		if (sTok.countTokens() <= 1) {
			return 0;
		}
		String str;
		int totalSize = 0;
		while(sTok.hasMoreTokens()) {
			str = sTok.nextToken();
			System.out.println("Token = " + str);
			totalSize += str.length();
		}
		System.out.println("totalSize = " + totalSize);
		// count the digits
		int count = 0;
		int digit;
		while(totalSize != 0) {
			digit = totalSize % 10;
			count += digit;
			totalSize = totalSize / 10;
		}
		System.out.println("PIN = " + count);

		return 0;
	}
	public static void main(String[] args) {

		calculatePin("Wipro Technologies");
		calculatePin("The Good The Bad and the Ugly");

	}
}
