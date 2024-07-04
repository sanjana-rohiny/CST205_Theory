package employeetest;

import java.util.Scanner;

public class EmployeeTest {
	static void reverseInt() {
		int number = 123, remainder = 0, revNum = 0;
		
		while(number != 0) {
			remainder = number % 10; 
			number  = number / 10; 
			revNum = revNum * 10 + remainder;
		}
		System.out.println("Number = " + revNum );
	}
	static void testSwitch() {
		Scanner sc=new Scanner(System.in);
		char c = '0';
		final char o = 'o';
		while(c!= 'q') {
			System.out.print("Enter a letter:");
			c=sc.next().charAt(0);

			switch(c) {
			case 'a':
				System.out.println("---->a");
				break;
			case 'e':
				System.out.println("---->e");
				break;
			case 'i':
				System.out.println("---->i");
				//break;
			case o:
				System.out.println("---->o");
				//break;
			case 'u':
				System.out.println("---->u");
				break;
			default:
				System.out.println("Default>"+ c);
				break;

			};
		}
		System.out.println("Exit---->"+ c);

	}
	
	static int fact(int n)  {
		if (n == 0 || n== 1) {
			return 1;
		}
		return n*fact(n-1);
	}

	static int rev = 0;
	static int file_opr(int n) { 
		if (n == 0) return rev;
		rev <<= 1;
		int bit = (n & 1);
		System.out.print(bit);
		if (bit == 1) rev ^= bit;
		return file_opr(n >> 1);
	}
	
	static void file_op2() { 
		int n = 12;
		int rev = 0;
		while (n> 0) {
			int bit = n % 2;
			System.out.print(bit);
			n = n / 2;
			rev = rev << 1;
			if (bit == 1)
				rev = rev ^ bit;
		}
		System.out.println();
		System.out.println("Rev = " + rev);
	}

	static void file_op1() {
		
		int no = 12;
		String bString = Integer.toBinaryString(no);
		int rev = 0;
		while (no>0) {
			// make one space
			rev <<= 1;
			if ((int)(no & 1) == 1) {
				rev ^=  1;
			}
			no >>= 1;
			
		}
		System.out.println("Rev = " + rev);
	}
	
	
	public static void main(String[] args) {

		Manager alice = new Manager("Alice", 20, "923982983", "New Delhi",
				20000, "Pay Roll");
		Manager alic = alice; alic.printSalary();
		alice = null;
		
				
		/*
		int x = 2;
		int result = x++ + x++ * --x / x++ - --x + 3 >> 1 | 2;	
		System.out.println("result  = " + result);
		System.out.println("X  = " + x);
		
		/*		
		Manager alice = new Manager("Alice", 20, "923982983", "New Delhi",
									20000, "Pay Roll");
		alice.printSalary();
		
		Officer bob = new Officer("Bob", 30, "9898989", 
				"New Delhi", 40000, "COmputer Science");
		bob.printSalary();
		*/   
	}
}
