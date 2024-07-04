package sample;

import java.util.*;
public class HashSetTest {

	public static void test1() {
		HashSet<String> names = new HashSet<>();

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
	
	
	public static void test2() {
	
		String str = "abdacasas";
		String res = null;
		for(int i=0; i<str.length(); i++) {
			int count = 0;
				
				if(res == null) {					
					res = String.valueOf(str.charAt(i));
				} else if (res.indexOf(str.charAt(i)) == -1){
					  res = res + str.charAt(i);
				}
		}
		
		System.out.println(res);
	}
	
	public static void test3() {
		
		String str = "abdacasas";
		String res = null;
		res = String.valueOf(str.charAt(0));
		for(int i=0; i<str.length(); i++) {
			boolean flag = false;
			for (int j=0; j<res.length();j++) {	
				if (str.charAt(i) == res.charAt(j)) {
					flag = true;
				}
			}
			if (flag == false) {
				res += String.valueOf(str.charAt(i));
				
			}
		}
		
		System.out.println(res);
	}
	public static void main(String[] args) {
		test3();
	}

}
