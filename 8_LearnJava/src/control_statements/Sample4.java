//Problem Statement
//===================
/* Food Corner home delivers vegetarian and non-vegetarian meals to its customers 
 based on the order.
 
 A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. 
 Apart from the cost per plate of food, 
 customers are also charged for home delivery based on the 
 distance in kms from the restaurant to the delivery point. 
 The delivery charges are as mentioned below:
 
 Distance       Delivery charge per kilometer
 =======        =============================
 first 3 km          $0
 next  3 km          $1
 remainig km         $2
 
 Given the type of food, quantity (no. of plates) and 
 the distance in kms from the restaurant to the delivery point, 
 implement a program to calculate the final bill amount to be paid by a customer.

 The below information must be used to check the validity of the data 
 provided by the customer: 

  Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
  Distance in kms must be greater than 0.
  Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.

Sample Input and Output

food type    Quantity ordered    Distance(km)  Output
-----------------------------------------------------
N             2                   3            30
V             1                   7            17
-----------------------------------------------------
*/

package control_statements;

import java.util.Scanner;

public class Sample4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter food type : ");
		char foodType =  scanner.next().charAt(0);

		if (foodType != 'V' || foodType != 'N') {
			System.out.print("Inalid type: Return ");	
			return;
		}
		
		System.out.print("Enter Quantity ordered : ");
		int quantityOrdered = scanner.nextInt();

		if (quantityOrdered <= 0) {			
			System.out.print("Inalid quantity: Return ");	
			return;
		}

		System.out.print("Enter Distance : ");
		int distance = scanner.nextInt();
		
		double netSum = 0;
		
		if (foodType == 'V') {
			netSum = netSum + 12 * quantityOrdered;
		} else if (foodType == 'N') {
			netSum = netSum + 15 * quantityOrdered;
		}
		
		if (distance > 3) {
			if (distance <= 6) {
				netSum = netSum + (distance-3) * 1;
			} else {
				netSum = netSum + (distance-6) * 2;
			}
		}
		
		System.out.print("netSum : " + netSum);
	}
}
