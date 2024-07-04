
//Problem Statement
//=================
// Implement a program to display the sum of two given numbers if the numbers are same. 
// If the numbers are not same, display the double of the sum.

package control_statements;

import java.util.Scanner;

public class sample1 {

	public static void main(String args[]) {
		int num1 = 0;
		int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        		
		System.out.print("Enter number 1 : ");
		num1 = scanner.nextInt();
		
		System.out.print("Enter number 2 : ");
		num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		if (num1 == num2) {
			// display the sum of two given numbers
			System.out.print("Sum : " + sum);
		} else {
			// display double the sum of two given numbers
			System.out.print("Double of Sum : " + sum*2);
		}
	}
}

