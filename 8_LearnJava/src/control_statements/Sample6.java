/*
 Problem Statement

Implement a program to find and display the least common multiple (LCM) of two whole numbers.
Least Common Multiple (LCM) of two numbers, num1 and num2 is the smallest positive number that is divisible by both num1 and num2.

Sample input   Op
-----------------
5,10           10
7,9            63  
 */
// 
package control_statements;

import java.util.Scanner;

public class Sample6 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Num1 : ");
		int num1=  scanner.nextInt();
		
		System.out.print("Enter Num2 : ");
		int num2=  scanner.nextInt();
        
		int count  = 0;
		
		if (num1 > num2) {
			count = num1;
		} else {
			count = num2;
		}
		
		int lcm = 0;		
		while (true) {			
			if ((count % num1 == 0) && (count % num2 == 0)) {
				lcm = count;
				break;
			}
			count++;
		}		
		System.out.print("LCM : " + lcm);
	}
}
