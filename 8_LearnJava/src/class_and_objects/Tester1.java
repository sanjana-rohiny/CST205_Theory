/*
 Problem Statement

Create a new class Restaurant in the 
Java project SwiftFood with the instance variables and methods mentioned below.

Method Description

displayRestaurantDetails() 

Display the details of the restaurant (the values of the member variables)

Create an object of the Restaurant class, initialize the instance variables, 
and invoke the displayRestaurantDetails() method in the main() method of the Tester class.  
*/

package class_and_objects;

class Restaurant {
	String restaurantName;
	String restaurantContact;
	String restaurantAddress;
	float userRating; 
	
	public Restaurant(String restaurantName, String restaurantContact, 
					String restaurantAddress, float userRating) {
		this.restaurantName = restaurantName;
		this.restaurantContact = restaurantContact;
		this.restaurantAddress = restaurantAddress;
		this.userRating = userRating;
	}
	
	public void displayRestaurantDetails() {
		
		System.out.println("Restaurant Name : " + restaurantName);
		System.out.println("Restaurant Contact : " + restaurantContact);
		System.out.println("Restaurant Address : " + restaurantAddress);
		System.out.println("User Rating : " + userRating);
	}
}

public class Tester1 {

	public static void main(String[] args) {
		Restaurant restaurent1 = new Restaurant("Indian Coffee House", "9880971234", 
				"Mattoor, Kalady", 4.1f);
		restaurent1.displayRestaurantDetails();
	}

}
