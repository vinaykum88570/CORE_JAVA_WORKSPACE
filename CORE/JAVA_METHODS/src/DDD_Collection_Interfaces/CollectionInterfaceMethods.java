package DDD_Collection_Interfaces;
import java.util.*;
import java.util.stream.Stream;

public class CollectionInterfaceMethods {
	 
	       public static void main(String[] args) {
	        
	        System.out.println("=== Collection Interface Methods Example ===");
	        
	        // Create collections for demonstration
	        Collection<String> collection1 = new ArrayList<>();
	        Collection<String> collection2 = new ArrayList<>();
	        Collection<String> collection3 = new ArrayList<>();
	        
	        // 1. add(E e) - Adds an element to the collection
	        System.out.println("\n1. add() method:");
	        boolean added1 = collection1.add("Apple");
	        boolean added2 = collection1.add("Banana");
	        boolean added3 = collection1.add("Orange");
	        System.out.println("Added elements: " + added1 + ", " + added2 + ", " + added3);
	        System.out.println("Collection after add(): " + collection1);
	        
	        // 1. size() - Returns the number of elements
	        System.out.println("\n2. size() method:");
	        int size = collection1.size();
	        System.out.println("Size of collection: " + size);
	        
	        // 2. isEmpty() - Checks if collection is empty
	        System.out.println("\n3. isEmpty() method:");
	        boolean isEmpty = collection1.isEmpty();
	        System.out.println("Is collection empty: " + isEmpty);
	        
	        // 3. contains(Object o) - Checks if collection contains element
	        System.out.println("\n4. contains() method:");
	        boolean containsApple = collection1.contains("Apple");
	        boolean containsMango = collection1.contains("Mango");
	        System.out.println("Contains 'Apple': " + containsApple);
	        System.out.println("Contains 'Mango': " + containsMango);
	        
	        // 4. iterator() - Returns an iterator over the elements
	        System.out.println("\n5. iterator() method:");
	        Iterator<String> iterator = collection1.iterator();
	        System.out.print("Elements using iterator: ");
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();
	        
	        // 5. toArray() - Returns an array containing all elements
	        System.out.println("\n6. toArray() method:");
	        Object[] array = collection1.toArray();
	        System.out.println("Array: " + Arrays.toString(array));
	        
	        // 6. toArray(T[] a) - Returns an array of specific type
	        System.out.println("\n7. toArray(T[] a) method:");
	        String[] stringArray = collection1.toArray(new String[0]);
	        System.out.println("String array: " + Arrays.toString(stringArray));
	        
	        // 7. remove(Object o) - Removes an element
	        System.out.println("\n8. remove() method:");
	        boolean removed = collection1.remove("Banana");
	        System.out.println("Removed 'Banana': " + removed);
	        System.out.println("Collection after remove(): " + collection1);
	        
	        // 8. addAll(Collection<? extends E> c) - Adds all elements from another collection
	        System.out.println("\n9. addAll() method:");
	        collection2.add("Mango");
	        collection2.add("Grapes");
	        boolean allAdded = collection1.addAll(collection2);
	        System.out.println("All elements added: " + allAdded);
	        System.out.println("Collection after addAll(): " + collection1);
	        
	        // 9. containsAll(Collection<?> c) - Checks if collection contains all elements
	        System.out.println("\n10. containsAll() method:");
	        collection3.add("Apple");
	        collection3.add("Mango");
	        boolean containsAll = collection1.containsAll(collection3);
	        System.out.println("Contains all elements: " + containsAll);
	        
	        // 10. removeAll(Collection<?> c) - Removes all elements in specified collection
	        System.out.println("\n11. removeAll() method:");
	        boolean allRemoved = collection1.removeAll(collection3);
	        System.out.println("All specified elements removed: " + allRemoved);
	        System.out.println("Collection after removeAll(): " + collection1);
	        
	        // 11. removeIf(Predicate<? super E> filter) - Removes elements that match predicate
	        System.out.println("\n12. removeIf() method:");
	        collection1.add("Pineapple");
	        collection1.add("Kiwi");
	        System.out.println("Before removeIf(): " + collection1);
	        boolean removedIf = collection1.removeIf(s -> s.startsWith("P"));
	        System.out.println("Elements removed by predicate: " + removedIf);
	        System.out.println("Collection after removeIf(): " + collection1);
	        
	        // 12. retainAll(Collection<?> c) - Retains only elements in specified collection
	        System.out.println("\n13. retainAll() method:");
	        Collection<String> retainCollection = new ArrayList<>();
	        retainCollection.add("Grapes");
	        retainCollection.add("Orange");
	        boolean retained = collection1.retainAll(retainCollection);
	        System.out.println("Elements retained: " + retained);
	        System.out.println("Collection after retainAll(): " + collection1);
	        
	        // 13. clear() - Removes all elements
	        System.out.println("\n14. clear() method:");
	        collection1.clear();
	        System.out.println("Collection after clear(): " + collection1);
	        System.out.println("Is empty after clear: " + collection1.isEmpty());
	        
	        // 14. equals(Object o) - Compares with another object
	        System.out.println("\n17. equals() method:");
	        Collection<String> compareCollection = new ArrayList<>();
	        compareCollection.add("Test");
	        boolean isEqual = collection1.equals(compareCollection);
	        System.out.println("Collections equal: " + isEqual);
	        
	        // 15. hashCode() - Returns hash code value
	        System.out.println("\n15. hashCode() method:");
	        int hashCode = collection1.hashCode();
	        System.out.println("Hash code: " + hashCode);
	        
	        // 16. spliterator() - Creates a Spliterator over the elements
	        System.out.println("\n16. spliterator() method:");
	        collection1.add("A");
	        collection1.add("B");
	        collection1.add("C");
	        Spliterator<String> spliterator = collection1.spliterator();
	        System.out.println("Spliterator characteristics: " + spliterator.characteristics());
	        System.out.print("Spliterator elements: ");
	        spliterator.forEachRemaining(System.out::print);
	        System.out.println();
	        
	        // 17. stream() - Returns sequential Stream
	        System.out.println("\n17. stream() method:");
	        Stream<String> stream = collection1.stream();
	        System.out.print("Stream elements: ");
	        stream.forEach(s -> System.out.print(s + " "));
	        System.out.println();
	        
	        // 18. parallelStream() - Returns parallel Stream
	        System.out.println("\n18. parallelStream() method:");
	        Stream<String> parallelStream = collection1.parallelStream();
	        System.out.print("Parallel stream elements: ");
	        parallelStream.forEach(s -> System.out.print(s + " "));
	        System.out.println();
	        
	        // Demonstrating with different collection types
	        System.out.println("\n=== Demonstrating with Different Collection Types ===");
	        
	        // HashSet
	        Collection<Integer> set = new HashSet<>();
	        set.add(10);
	        set.add(20);
	        set.add(30);
	        set.add(10); // Duplicate, won't be added
	        System.out.println("HashSet: " + set);
	        
	        // LinkedList
	        Collection<String> linkedList = new LinkedList<>();
	        linkedList.add("First");
	        linkedList.add("Second");
	        linkedList.add("Third");
	        System.out.println("LinkedList: " + linkedList);
	        
	        // TreeSet
	        Collection<String> treeSet = new TreeSet<>();
	        treeSet.add("Zebra");
	        treeSet.add("Apple");
	        treeSet.add("Monkey");
	        System.out.println("TreeSet (sorted): " + treeSet);
	    
	}
}
