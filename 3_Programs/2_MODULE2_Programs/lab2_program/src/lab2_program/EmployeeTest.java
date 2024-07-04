package lab2_program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EmployeeTest {
	

static void readAndWriteFile()  {

	/* All xception in try catch block */
	// FileNotFoundException - FileInputStream, FileOutputStream
	// IOException - fis.available
	// IOException - create new file, file read() and file write()
	// 
	
	FileInputStream fis = null;
	FileOutputStream fos = null;
	File f1 = null;
	File f2 = null;
	
		// create Inputstream object for reading
		try {
			fis  = new FileInputStream("input.txt");
			
			if(fis.available() == -1) {
				System.out.println("file not available...return ...!");
				return;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
		//create output stream for writing
		try {
			fos = new FileOutputStream(f2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i = 0;
		byte byteArr[] = new byte[1000];
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
	
	/* recursive function : factorial */
	static int fact(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		
		return n*fact(n-1);
	}
	
	/* recursive function : reverseBits */
	static void reverseBitsRecursive(int n) {	
		if (n==0) return;
		
		int bit = n & 0x1;
		System.out.print(bit);
		reverseBitsRecursive(n>>1);
	}
	
	/* recursive function : reverseString */
	static void reverseString(String str) {
		
		if (str.isEmpty()) 
			return;
		reverseString(str.substring(0,str.length()-1));
	}

	static void reverseBits(int n) {
		
		int rev = 0, bit = 0;
		System.out.println("bit stream of input int = " + Integer.toBinaryString(n));
		
		while(n != 0) {
			rev = rev << 1;
			bit = n & 1;
			if (bit == 1) {
				rev = rev ^ 1;
			}
			n = n >> 1;
		}
		
		System.out.println("erverse bit stream of input int = " + Integer.toBinaryString(rev));
	}

	static void callByValue(int input) {
		
		System.out.println("callByValue : input = " + input);
		input = input / 2;
		System.out.println("callByValue : modified input = " + input);
	}
	
	static void callByRef(Employee input) {
		System.out.println("callByRef : input.salary = " + input.salary);
		input.salary = 30000;
		System.out.println("callByValue : modified input.salary = " + input.salary);
	}
	
	
	static void palindrome() {
		String str = "malayalam";
		int h = 0;
		for (int i=0;i<str.length()/2; i++) {
		
			System.out.println("str.charAt(i)" + str.charAt(i));
			System.out.println("str.charAt(i)" + str.charAt(i));

			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				System.out.println("false");
				h = 1;
				break;
			}
		}
		
		if (h==0) {
			System.out.println("true");
			
		}
	}
	public static void main(String[] args) {
		/*Find the output of below expression ?
				int x = 3;
				int result = x++ + x++ * --x / x++ - --x + 3 >> 1 | 2;
				What will the value of variable  ‘x’ ?
				What will the value of variable ‘result’ ?
				Justify your answer ?
		*/
		
		int x = 3; //x 4
		int result = x++ + x++ * --x / x++ - --x + 3 >> 1 | 2;
					 //3 | 2
					   	
					 
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		
		//palindrome();
		//readAndWriteFile();
		
		/*
		 * Employee emp = new Employee("alice", 40, null, null, 20000);
		 * 
		 * System.out.println("Method Overloading"); emp.test(); short sh = 10;
		 * emp.test(sh); emp.test(10); emp.test(10, 20); emp.test("test");
		 * emp.test(emp);
		 * 
		 * System.out.println("reverseBits"); reverseBits(10); System.out.println();
		 * 
		 * System.out.println("reverseBitsRecursive"); reverseBitsRecursive(10);
		 * System.out.println();
		 * 
		 * System.out.println("reverseString"); reverseString("abc");
		 * System.out.println();
		 * 
		 * System.out.println("callByValue"); int input = 200; callByValue(input);
		 * System.out.println("After Call input = " + input);
		 * 
		 * System.out.println("callByRef"); callByRef(emp);
		 * System.out.println("After Call emp.salary = " + emp.salary);
		 */
	}
}
