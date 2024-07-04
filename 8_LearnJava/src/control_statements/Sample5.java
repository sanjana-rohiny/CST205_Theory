/*
 Problem Statement
====================
The Metro Bank provides various types of loans such as car loans, 
business loans and 
house loans to its account holders, i.e., customers.

Implement a program to determine the 
eligible loan amount and the EMI that the bank can provide to its customers 
based on their salary and the loan type they expect to avail.

The values required for determining the eligible loan amount and the EMI are:
    account number of the customer
    account balance of the customer
    salary of the customer
    loan type 
    expected loan amount
    expected no. of EMIs

The following validations should be performed:

    The account number should be of 4 digits and its first digit should be 1
    The customer should have a minimum balance of $1000 in the account
Display appropriate error messages if the validations fail.

If the validations pass, determine whether the bank would provide the loan or not. 

The bank would provide the loan, 
only if the loan amount and the number of EMIs expected by the customer 
is less than or equal to the loan amount and the number of EMIs decided 
by the bank respectively. 
The bank decides the eligible loan amount and the number 
of EMIs based on the below table.

Salary      LoanType   EigibleLoanAmount   NoOfEMI
================================================
> 25000     Car        500000               36
> 50000     House      6000000              60
> 75000     Business   7500000              84 
 
 Display the account number, eligible and requested loan amount and the number of EMIs 
 if the bank provides the loan.

 Display an appropriate message if the bank does not provide the loan.

 Sample Input and Output
 =======================
 
 AccountNo = 1001
 Salary = 40000
 AccBalance = 250000
 LoanType = Car
 LoanAmountExpected = 300000
 EmiExpected = 30
 
 Expected Output
 ==============
 eligibleLoanAmount = 500000
 eligibleEMI = 36
 
 */

package control_statements;

import java.util.Scanner;

public class Sample5 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter AccountNo : ");
		String accNo =  scanner.next();
		
		if (accNo.length() != 4 || accNo.charAt(0) != '1') {
			System.out.print("Invalid Account No : Return...!");
			return;
		}
		
		System.out.print("Enter Salary : ");
		double salary =  scanner.nextDouble();
		
		System.out.print("Enter AccBalance : ");
		double accBalance =  scanner.nextDouble();
		
		if (accBalance < 1000) {
			System.out.print("Invalid Min Balance : Return...!");
			return;
		}
		
		System.out.print("Enter LoanType : ");
		String loanType =  scanner.next();
		
		System.out.print("Enter Loan Amount Expected : ");
		double loanAmountExpected =  scanner.nextDouble();
		
		System.out.print("Enter Emi Expected : ");
		double emiExpected =  scanner.nextDouble();
		
		String actualLoanType = null;
		double actualloanAmount = 0;
		int actualEmi = 0;
		if (salary > 75000) {
			actualLoanType = "Business";
			actualloanAmount = 7500000;
			actualEmi = 84;
		} else if (salary > 50000) {
			actualLoanType = "House";
			actualloanAmount = 6000000;
			actualEmi = 60;
		} else if (salary > 25000) {
			actualLoanType = "Car";
			actualloanAmount = 500000;
			actualEmi = 34;
		}
		
		System.out.println("actualLoanType : " + actualLoanType);
		
		if (actualLoanType != loanType) {
			System.out.print("Invalid Loan Type : Return...!");
			return;
		}
		
		if (loanAmountExpected > actualloanAmount ) {
			System.out.print("Invalid Loan Amount : Return...!");
			return;			
		}
		
		if (emiExpected > actualEmi ) {
			System.out.print("Invalid Loan emiExpected : Return...!");
			return;			
		}
		
		System.out.print("ELIGIBLE For Loan...!");

	}
}
