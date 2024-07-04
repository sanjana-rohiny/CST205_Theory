package sample;

import java.util.*;

class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void printInfo() {
		System.out.println("Id = " + id + " name = " + name);
	}
}

public class CollectionExample {

	public static void testArrayList() {
		// Creating an ArrayList of Strings
		ArrayList<String> myList = new ArrayList<>();
		// Adding elements to the list
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Orange");

		// Iterating through the list and printing elements
		System.out.println("Array List of Strings");
		for (String fruit : myList) {
			System.out.println(fruit);
		}
		System.out.println();

		ArrayList<Integer> myList1 = new ArrayList<>();

		// Adding elements to the list
		myList1.add(1);
		myList1.add(2);
		myList1.add(3);

		// Iterating through the list and printing elements
		System.out.println("Array List of Integers");
		for (int data : myList1) {
			System.out.println(data);
		}
		System.out.println();
		ArrayList<Employee> myList2 = new ArrayList<>();

		// Adding elements to the list
		Employee e1 = new Employee(100, "Alice");
		Employee e2 = new Employee(101, "Bob");
		Employee e3 = new Employee(102, "Cindy");

		myList2.add(e1);
		myList2.add(e2);
		myList2.add(e3);

		// Iterating through the list and printing elements
		System.out.println("Array List of Employee objects");
		for (Employee e : myList2) {
			e.printInfo();
		}
		// Size of list
		System.out.println("Size = " + myList2.size());
	}

	public static void testHashSet1() {
	
		String str = "abasbdddd";
		String res = String.valueOf(str.charAt(0));
		for (int i=0; i<str.length(); i++) {
			boolean flag = true;

			for(int j = 0; j<res.length(); j++) {
				if (str.charAt(i) == res.charAt(j)) {
					flag = false;
					break;
				}
			}
			
			if (flag == true) {
				res = res + String.valueOf(str.charAt(i)); 
			}
		}
		
		System.out.println("modified str = " + res);

		HashSet<Character> names = new HashSet<Character>();
		for (int i=0; i<str.length(); i++) {
			names.add(str.charAt(i));
		}
		

		System.out.println(names.toString());
	}
	public static void testHashSet() {
			HashSet<String> names = new HashSet<String>();

	        // Adding elements to the HashSet
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");
	        names.add("Alice"); // Adding a duplicate element (won't be added)

	        // Displaying elements in the HashSet using an Iterator
	        Iterator<String> iterator = names.iterator();
	        while (iterator.hasNext()) {
	            String name = iterator.next();
	            System.out.println(name);
	        }
	}
	
	public static void testHashMap() {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(1, "Alice");
		hashMap.put(2, "Bob");
		hashMap.put(3, "Charlie");
		hashMap.put(4, "Alice");

		System.out.println("name = " + hashMap.get(1));
		System.out.println("name = " + hashMap.get(2));
		System.out.println("name = " + hashMap.get(3));
		System.out.println("name = " + hashMap.get(4));

		for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key = "  + entry.getKey());
			System.out.println("Value = "  + entry.getValue());
		}

	}

	public static void main(String[] args) {
		testHashSet1();
	}
}
