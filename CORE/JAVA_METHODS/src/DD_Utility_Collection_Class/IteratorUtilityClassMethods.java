package DD_Utility_Collection_Class;

import java.util.*;

public class IteratorUtilityClassMethods {

	    public static void main(String[] args) {
	        
	        System.out.println("=== Iterator Core Methods Example ===");
	        
	        // Create a list for demonstration
	        List<String> fruits = new ArrayList<>(Arrays.asList(
	            "Apple", "Banana", "Orange", "Mango", "Grapes"
	        ));
	        
	        System.out.println("Original list: " + fruits);
	        
	        // Get an Iterator
	        Iterator<String> iterator = fruits.iterator();
	        
	        // 1. hasNext() - Check if there are more elements
	        System.out.println("\n1. hasNext() method:");
	        System.out.println("Iterator has next element: " + iterator.hasNext());
	        
	        // 2. next() - Get the next element
	        System.out.println("\n2. next() method:");
	        System.out.println("First element: " + iterator.next());
	        System.out.println("Second element: " + iterator.next());
	        System.out.println("Third element: " + iterator.next());
	        
	        // Check hasNext() again
	        System.out.println("Still has next elements: " + iterator.hasNext());
	        
	        // 3. remove() - Remove the current element (last one returned by next())
	        System.out.println("\n3. remove() method:");
	        iterator.remove(); // Removes "Orange" (the last element returned by next())
	        System.out.println("After removing last accessed element: " + fruits);
	       
	    }
}
