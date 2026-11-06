package nov2026;

import java.util.ArrayList;

public class ArrayListMethodsExample{

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("Original: " + fruits);

        fruits.set(1, "Orange");

        System.out.println("Updated: " + fruits);

        fruits.remove("Banana");

        System.out.println("After Remove: " + fruits);

        System.out.println("Size: " + fruits.size());	
	}

}
