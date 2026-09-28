package DD_Utility_Collection_Class;
import java.util.*;

public class ListIteratorUtilityClassMethods {
	
	    public static void main(String[] args) {
	        
	        System.out.println("=== ListIterator Methods Example ===");
	        
	        // Create a list for demonstration
	        List<String> fruits = new ArrayList<>(Arrays.asList(
	            "Apple", "Banana", "Orange", "Mango", "Grapes"
	        ));
	        
	        System.out.println("Original list: " + fruits);
	        
	        // Get a ListIterator (starting at beginning)
	        ListIterator<String> listIterator = fruits.listIterator();
	        
	        System.out.println("\n=== Forward Iteration ===");
	        
	        // 1. hasNext() - Check if there are more elements forward
	        System.out.println("1. hasNext(): " + listIterator.hasNext());
	        
	        // 2. next() - Get the next element and move forward
	        System.out.println("2. next(): " + listIterator.next());
	        System.out.println("3. next(): " + listIterator.next());
	        
	        // 3. nextIndex() - Get index of next element
	        System.out.println("4. nextIndex(): " + listIterator.nextIndex());
	        
	        // Continue forward iteration
	        System.out.println("5. next(): " + listIterator.next());
	        System.out.println("6. nextIndex(): " + listIterator.nextIndex());
	        
	        System.out.println("\n=== Backward Iteration ===");
	        
	        // 4. hasPrevious() - Check if there are elements backward
	        System.out.println("7. hasPrevious(): " + listIterator.hasPrevious());
	        
	        // 5. previous() - Get the previous element and move backward
	        System.out.println("8. previous(): " + listIterator.previous());
	        System.out.println("9. previous(): " + listIterator.previous());
	        
	        // 6. previousIndex() - Get index of previous element
	        System.out.println("10. previousIndex(): " + listIterator.previousIndex());
	        
	        System.out.println("\n=== Modification Operations ===");
	        
	        // 7. set() - Replace the last element returned by next() or previous()
	        System.out.println("11. Before set(): " + fruits);
	        listIterator.set("Pineapple"); // Replaces "Banana"
	        System.out.println("12. After set('Pineapple'): " + fruits);
	        
	        // 8. add() - Insert element at current position
	        listIterator.add("Watermelon"); // Adds before current position
	        System.out.println("13. After add('Watermelon'): " + fruits);
	        System.out.println("14. nextIndex(): " + listIterator.nextIndex());
	        
	        // 9. remove() - Remove the last element returned by next() or previous()
	        listIterator.next(); // Move to next element
	        listIterator.remove(); // Remove that element
	        System.out.println("15. After remove(): " + fruits);
	        
	        System.out.println("\n=== Complete Bidirectional Iteration ===");
	        
	        // Reset and demonstrate full bidirectional iteration
	        fruits = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
	        listIterator = fruits.listIterator();
	        
	        System.out.println("Original: " + fruits);
	        
	        // Forward iteration
	        System.out.print("Forward: ");
	        while (listIterator.hasNext()) {
	            System.out.print(listIterator.next() + " ");
	        }
	        System.out.println();
	        
	        // Backward iteration
	        System.out.print("Backward: ");
	        while (listIterator.hasPrevious()) {
	            System.out.print(listIterator.previous() + " ");
	        }
	        System.out.println();
	        
	        System.out.println("\n=== Starting from Specific Index ===");
	        
	        // Create ListIterator starting at index 2
	        ListIterator<String> specificIterator = fruits.listIterator(2);
	        System.out.println("Starting at index 2:");
	        System.out.println("nextIndex(): " + specificIterator.nextIndex());
	        System.out.println("previousIndex(): " + specificIterator.previousIndex());
	        System.out.println("next(): " + specificIterator.next());
	        System.out.println("previous(): " + specificIterator.previous());
	        
	       
	    }
	}

