package DDD_Collection_Interfaces;

import java.util.*;
import java.util.function.UnaryOperator;
public class ListInterfaceMethods {

	    public static void main(String[] args) {
	    	        
	    	        System.out.println("=== List Interface Methods Example ===");
	    	        
	    	        // Create lists for demonstration
	    	        List<String> list1 = new ArrayList<>();
	    	        List<String> list2 = new ArrayList<>();
	    	        LinkedList<String> linkedList = new LinkedList<>(); // Use LinkedList for Deque methods
	    	        
	    	        // 1. add(E e) - Adds an element to the end of the list
	    	        System.out.println("\n1. add(E e) method:");
	    	        boolean added1 = list1.add("Apple");
	    	        boolean added2 = list1.add("Banana");
	    	        boolean added3 = list1.add("Orange");
	    	        System.out.println("Added elements: " + added1 + ", " + added2 + ", " + added3);
	    	        System.out.println("List after add(): " + list1);
	    	        
	    	        // 2. size() - Returns the number of elements
	    	        System.out.println("\n2. size() method:");
	    	        int size = list1.size();
	    	        System.out.println("Size of list: " + size);
	    	        
	    	        // 3. isEmpty() - Checks if list is empty
	    	        System.out.println("\n3. isEmpty() method:");
	    	        boolean isEmpty = list1.isEmpty();
	    	        System.out.println("Is list empty: " + isEmpty);
	    	        
	    	        // 4. contains(Object o) - Checks if list contains element
	    	        System.out.println("\n4. contains() method:");
	    	        boolean containsApple = list1.contains("Apple");
	    	        boolean containsMango = list1.contains("Mango");
	    	        System.out.println("Contains 'Apple': " + containsApple);
	    	        System.out.println("Contains 'Mango': " + containsMango);
	    	        
	    	        // 5. iterator() - Returns an iterator over the elements
	    	        System.out.println("\n5. iterator() method:");
	    	        Iterator<String> iterator = list1.iterator();
	    	        System.out.print("Elements using iterator: ");
	    	        while (iterator.hasNext()) {
	    	            System.out.print(iterator.next() + " ");
	    	        }
	    	        System.out.println();
	    	        
	    	        // 6. toArray() - Returns an array containing all elements
	    	        System.out.println("\n6. toArray() method:");
	    	        Object[] array = list1.toArray();
	    	        System.out.println("Array: " + Arrays.toString(array));
	    	        
	    	        // 7. toArray(T[] a) - Returns an array of specific type
	    	        System.out.println("\n7. toArray(T[] a) method:");
	    	        String[] stringArray = list1.toArray(new String[0]);
	    	        System.out.println("String array: " + Arrays.toString(stringArray));
	    	        
	    	        // 8. remove(Object o) - Removes an element
	    	        System.out.println("\n8. remove(Object o) method:");
	    	        boolean removed = list1.remove("Banana");
	    	        System.out.println("Removed 'Banana': " + removed);
	    	        System.out.println("List after remove(): " + list1);
	    	        
	    	        // 9. addAll(Collection<? extends E> c) - Adds all elements from another collection
	    	        System.out.println("\n9. addAll(Collection) method:");
	    	        list2.add("Mango");
	    	        list2.add("Grapes");
	    	        boolean allAdded = list1.addAll(list2);
	    	        System.out.println("All elements added: " + allAdded);
	    	        System.out.println("List after addAll(): " + list1);
	    	        
	    	        // 10. containsAll(Collection<?> c) - Checks if list contains all elements
	    	        System.out.println("\n10. containsAll() method:");
	    	        List<String> checkList = Arrays.asList("Apple", "Mango");
	    	        boolean containsAll = list1.containsAll(checkList);
	    	        System.out.println("Contains all elements: " + containsAll);
	    	        
	    	        // 11. addAll(int index, Collection<? extends E> c) - Adds all at specific position
	    	        System.out.println("\n11. addAll(int index, Collection) method:");
	    	        List<String> insertList = Arrays.asList("Pineapple", "Kiwi");
	    	        boolean inserted = list1.addAll(1, insertList);
	    	        System.out.println("Elements inserted: " + inserted);
	    	        System.out.println("List after addAll(index): " + list1);
	    	        
	    	        // 12. removeAll(Collection<?> c) - Removes all elements in specified collection
	    	        System.out.println("\n12. removeAll() method:");
	    	        List<String> removeList = Arrays.asList("Pineapple", "Kiwi");
	    	        boolean allRemoved = list1.removeAll(removeList);
	    	        System.out.println("All specified elements removed: " + allRemoved);
	    	        System.out.println("List after removeAll(): " + list1);
	    	        
	    	        // 13. retainAll(Collection<?> c) - Retains only elements in specified collection
	    	        System.out.println("\n13. retainAll() method:");
	    	        List<String> retainList = Arrays.asList("Apple", "Mango", "Grapes");
	    	        boolean retained = list1.retainAll(retainList);
	    	        System.out.println("Elements retained: " + retained);
	    	        System.out.println("List after retainAll(): " + list1);
	    	        
	    	        // 14. replaceAll(UnaryOperator<E> operator) - Replaces each element with operator result
	    	        System.out.println("\n14. replaceAll() method:");
	    	        list1.replaceAll(s -> s.toUpperCase());
	    	        System.out.println("List after replaceAll(toUpperCase): " + list1);
	    	        
	    	        // 15. sort(Comparator<? super E> c) - Sorts the list
	    	        System.out.println("\n15. sort() method:");
	    	        list1.sort(Comparator.naturalOrder());
	    	        System.out.println("List after sort(): " + list1);
	    	        
	    	        // 16. clear() - Removes all elements
	    	        System.out.println("\n16. clear() method:");
	    	        list1.clear();
	    	        System.out.println("List after clear(): " + list1);
	    	        System.out.println("Is empty after clear: " + list1.isEmpty());
	    	        
	    	        // 17. equals(Object o) - Compares with another object
	    	        System.out.println("\n17. equals() method:");
	    	        List<String> compareList = new ArrayList<>();
	    	        compareList.add("Test");
	    	        boolean isEqual = list1.equals(compareList);
	    	        System.out.println("Lists equal: " + isEqual);
	    	        
	    	        // 18. hashCode() - Returns hash code value
	    	        System.out.println("\n18. hashCode() method:");
	    	        int hashCode = list1.hashCode();
	    	        System.out.println("Hash code: " + hashCode);
	    	        
	    	        // Re-populate for index-based operations
	    	        list1.addAll(Arrays.asList("Apple", "Banana", "Orange", "Mango", "Banana"));
	    	        
	    	        // 19. get(int index) - Returns element at specified position
	    	        System.out.println("\n19. get() method:");
	    	        String element = list1.get(2);
	    	        System.out.println("Element at index 2: " + element);
	    	        
	    	        // 20. set(int index, E element) - Replaces element at specified position
	    	        System.out.println("\n20. set() method:");
	    	        String oldElement = list1.set(1, "Pineapple");
	    	        System.out.println("Old element at index 1: " + oldElement);
	    	        System.out.println("List after set(): " + list1);
	    	        
	    	        // 21. add(int index, E element) - Inserts element at specified position
	    	        System.out.println("\n21. add(int index, E element) method:");
	    	        list1.add(2, "Kiwi");
	    	        System.out.println("List after add(index): " + list1);
	    	        
	    	        // 22. remove(int index) - Removes element at specified position
	    	        System.out.println("\n22. remove(int index) method:");
	    	        String removedElement = list1.remove(3);
	    	        System.out.println("Removed element at index 3: " + removedElement);
	    	        System.out.println("List after remove(index): " + list1);
	    	        
	    	        // 23. indexOf(Object o) - Returns first index of element
	    	        System.out.println("\n23. indexOf() method:");
	    	        int firstIndex = list1.indexOf("Banana");
	    	        System.out.println("First index of 'Banana': " + firstIndex);
	    	        
	    	        // 24. lastIndexOf(Object o) - Returns last index of element
	    	        System.out.println("\n24. lastIndexOf() method:");
	    	        int lastIndex = list1.lastIndexOf("Banana");
	    	        System.out.println("Last index of 'Banana': " + lastIndex);
	    	        
	    	        // 25. listIterator() - Returns list iterator
	    	        System.out.println("\n25. listIterator() method:");
	    	        ListIterator<String> listIterator = list1.listIterator();
	    	        System.out.print("Forward iteration: ");
	    	        while (listIterator.hasNext()) {
	    	            System.out.print(listIterator.next() + " ");
	    	        }
	    	        System.out.println();
	    	        
	    	        // 26. listIterator(int index) - Returns list iterator starting at index
	    	        System.out.println("\n26. listIterator(int index) method:");
	    	        ListIterator<String> listIteratorFromIndex = list1.listIterator(2);
	    	        System.out.print("Iteration from index 2: ");
	    	        while (listIteratorFromIndex.hasNext()) {
	    	            System.out.print(listIteratorFromIndex.next() + " ");
	    	        }
	    	        System.out.println();
	    	        
	    	        // 27. subList(int fromIndex, int toIndex) - Returns view of portion of list
	    	        System.out.println("\n27. subList() method:");
	    	        List<String> subList = list1.subList(1, 4);
	    	        System.out.println("SubList from index 1 to 3: " + subList);
	    	        
	    	        // 28. spliterator() - Creates a Spliterator
	    	        System.out.println("\n28. spliterator() method:");
	    	        Spliterator<String> spliterator = list1.spliterator();
	    	        System.out.println("Spliterator characteristics: " + spliterator.characteristics());
	    	        
	    	        // LinkedList specific methods (available in all Java versions)
	    	        System.out.println("\n29. LinkedList specific methods:");
	    	        
	    	        // addFirst() - Adds element at beginning
	    	        System.out.println("addFirst() method:");
	    	        linkedList.addFirst("First");
	    	        linkedList.addFirst("NewFirst");
	    	        System.out.println("LinkedList after addFirst(): " + linkedList);
	    	        
	    	        // addLast() - Adds element at end
	    	        System.out.println("addLast() method:");
	    	        linkedList.addLast("Last");
	    	        linkedList.addLast("NewLast");
	    	        System.out.println("LinkedList after addLast(): " + linkedList);
	    	        
	    	        // getFirst() - Returns first element
	    	        System.out.println("getFirst() method:");
	    	        String first = linkedList.getFirst();
	    	        System.out.println("First element: " + first);
	    	        
	    	        // getLast() - Returns last element
	    	        System.out.println("getLast() method:");
	    	        String last = linkedList.getLast();
	    	        System.out.println("Last element: " + last);
	    	        
	    	        // removeFirst() - Removes and returns first element
	    	        System.out.println("removeFirst() method:");
	    	        String removedFirst = linkedList.removeFirst();
	    	        System.out.println("Removed first element: " + removedFirst);
	    	        System.out.println("LinkedList after removeFirst(): " + linkedList);
	    	        
	    	        // removeLast() - Removes and returns last element
	    	        System.out.println("removeLast() method:");
	    	        String removedLast = linkedList.removeLast();
	    	        System.out.println("Removed last element: " + removedLast);
	    	        System.out.println("LinkedList after removeLast(): " + linkedList);
	    	        
	    	        // Demonstrating with different List implementations
	    	        System.out.println("\n=== Different List Implementations ===");
	    	        
	    	        // ArrayList
	    	        List<Integer> arrayList = new ArrayList<>();
	    	        arrayList.add(10);
	    	        arrayList.add(20);
	    	        arrayList.add(30);
	    	        System.out.println("ArrayList: " + arrayList);
	    	        
	    	        // Vector
	    	        List<Double> vector = new Vector<>();
		            vector.add(1.1);
	    	        vector.add(2.2);
	    	        vector.add(3.3);
	    	        System.out.println("Vector: " + vector);
	    	        
	    	        // Stack
	    	        Stack<Character> stack = new Stack<>();
	    	        stack.add('X');
	    	        stack.add('Y');
	    	        stack.add('Z');
	    	        System.out.println("Stack: " + stack);
	    	        System.out.println("Stack pop(): " + stack.pop());
	    	        System.out.println("Stack after pop(): " + stack);
	    	    }
	    	
}
