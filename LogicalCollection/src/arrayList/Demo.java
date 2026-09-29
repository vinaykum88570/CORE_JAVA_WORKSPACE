package arrayList;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		
		// Print Element from ArrayList
		System.out.println(list);
		
		// Get an element from ArrayList
		System.out.println(list.get(1));
		
		// Remove an element
//		list.remove(Integer.valueOf(20));
		
		// Check element exists
		System.out.println(list.contains(20));
		
		// Find largest Element
		int largest = list.get(0);

		for(int i = 1; i < list.size(); i++) {

		    if(list.get(i) > largest) {

		        largest = list.get(i);
		    }
		}
		System.out.println("Largest = " + largest);
		
		
		// Find Smallest Element
		int smallest = list.get(0);

		for(int i = 1; i < list.size(); i++) {

		    if(list.get(i) < smallest) {

		        smallest = list.get(i);
		    }
		}
		System.out.println("Smallest = " + smallest);
		
		// Find Sum
		int sum = 0;

		for(int i = 0; i < list.size(); i++) {

		    sum = sum + list.get(i);
		}
		System.out.println("Sum = " + sum);
		
		
		// Find even numbers
		for(int i = 0; i < list.size(); i++) {

		    if(list.get(i) % 2 == 0) {

		        System.out.println(list.get(i));
		    }
		}
		
		//Find Odd Number
		for(int i = 0; i < list.size(); i++) {

		    if(list.get(i) % 2 != 0) {

		        System.out.println(list.get(i));
		    }
		}
		
		// Search Element
		int search = 40;

		if(list.contains(search)) {

		    System.out.println(search + " is present");
		}
		else {

		    System.out.println(search + " is not present");
		}
		
		// Count elements greater than 30
		int count = 0;

		for(int i = 0; i < list.size(); i++) {

		    if(list.get(i) > 30) {

		        count++;
		    }
		}
		System.out.println("Count = " + count);
		
	}
}
