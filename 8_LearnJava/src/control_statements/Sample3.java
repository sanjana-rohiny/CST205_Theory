// Problem Statement
//==================
/*
Implement a program to calculate the product of three positive integer values. 
However, if one of the integers is 7, 
     consider only the values to the right of 7 for calculation. 
If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7.

Sample input - sample output
1,5,3           15
3,7,8		    8
7,2,9			18
2,6,7			-1

*/
package control_statements;

import java.util.Scanner;

public class Sample3 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter num1 : ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter num2 : ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter num3 : ");
        int num3 = scanner.nextInt();
        int n1 = num1, n2 = num2, n3 = num3;
        
        if (num1 == 7) {
        	n1 = 1;
        } 
        
        if (num2 == 7) {
        	n1 = 1;
        	n2 = 1;
        	n3 = num3;
        } 
        
        if (num3 == 7) {
        	n1 = 1;
        	n2 = 1;
        	n3 = -1;
        }
        
        System.out.print("Result = : " + (n1*n2*n3));

	}
}
