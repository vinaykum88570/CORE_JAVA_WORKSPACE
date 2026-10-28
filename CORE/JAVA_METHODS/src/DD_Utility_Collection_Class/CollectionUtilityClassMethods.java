package DD_Utility_Collection_Class;

import java.util.*;

public class CollectionUtilityClassMethods {
	
	public static void main(String[] args) {
	        // Create sample lists for demonstration
	        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 3, 2, 5));
	        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Mango", "Apple"));
	        List<Integer> emptyList = new ArrayList<>();
	        
	        System.out.println("Original numbers: " + numbers);
	        System.out.println("Original fruits: " + fruits);
	        
	        // 1. sort() - Sorts the specified list into ascending order
	        Collections.sort(numbers);
	        Collections.sort(fruits);
	        System.out.println("\n1. After sort():");
	        System.out.println("Sorted numbers: " + numbers);
	        System.out.println("Sorted fruits: " + fruits);
	        
	        // 2. reverse() - Reverses the order of elements
	        Collections.reverse(numbers);
	        System.out.println("\n2. After reverse(): " + numbers);
	        
	        // 3. shuffle() - Randomly permutes the list
	        Collections.shuffle(numbers);
	        System.out.println("\n3. After shuffle(): " + numbers);
	        
	        // Sort again for other operations
	        Collections.sort(numbers);
	        
	        // 4. binarySearch() - Searches for key using binary search
	        int index = Collections.binarySearch(numbers, 9);
	        System.out.println("\n4. binarySearch for 9: Found at index " + index);
	        
	        // 5. max() - Returns maximum element
	        Integer max = Collections.max(numbers);
	        System.out.println("\n5. max(): " + max);
	        
	        // 6. min() - Returns minimum element
	        Integer min = Collections.min(numbers);
	        System.out.println("6. min(): " + min);
	        
	        // 7. frequency() - Returns frequency of element
	        int freq = Collections.frequency(fruits, "Apple");
	        System.out.println("\n7. frequency of 'Apple': " + freq);
	        
	        // 8. replaceAll() - Replaces all occurrences
	        boolean replaced = Collections.replaceAll(fruits, "Apple", "Pineapple");
	        System.out.println("\n8. After replaceAll('Apple', 'Pineapple'): " + fruits);
	        System.out.println("Elements replaced: " + replaced);
	        
	        // 9. copy() - Copies elements from source to destination
	        List<Integer> dest = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0));
	        Collections.copy(dest, numbers);
	        System.out.println("\n9. After copy(): " + dest);
	        
	        // 10. fill() - Fills list with specified value
	        Collections.fill(dest, 100);
	        System.out.println("\n10. After fill(100): " + dest);
	        
	        // 11. swap() - Swaps elements at specified positions
	        Collections.swap(fruits, 0, 2);
	        System.out.println("\n11. After swap(0, 2): " + fruits);
	        
	        // 12. rotate() - Rotates elements by specified distance
	        Collections.rotate(fruits, 1);
	        System.out.println("\n12. After rotate(1): " + fruits);
	        
	        // 13. singleton() - Returns immutable set containing only specified object
	        Set<String> singleFruit = Collections.singleton("Mango");
	        System.out.println("\n13. singleton('Mango'): " + singleFruit);
	        
	        // 14. singletonList() - Returns immutable list containing only specified object
	        List<String> singleFruitList = Collections.singletonList("Banana");
	        System.out.println("14. singletonList('Banana'): " + singleFruitList);
	        
	        // 15. emptyList() - Returns empty immutable list
	        List<String> empty = Collections.emptyList();
	        System.out.println("\n15. emptyList(): " + empty);
	        System.out.println("Is empty: " + empty.isEmpty());
	        
	        // 16. unmodifiableList() - Returns unmodifiable view of list
	        List<String> unmodifiableFruits = Collections.unmodifiableList(fruits);
	        System.out.println("\n16. unmodifiableList: " + unmodifiableFruits);
	        
	        // 17. synchronizedList() - Returns synchronized (thread-safe) list
	        List<String> syncFruits = Collections.synchronizedList(fruits);
	        System.out.println("\n17. synchronizedList: " + syncFruits);
	        
	        // 18. checkedList() - Returns dynamically type-safe view of list
	        List<String> checkedFruits = Collections.checkedList(fruits, String.class);
	        System.out.println("\n18. checkedList: " + checkedFruits);
	        
	        // 19. disjoint() - Returns true if collections have no elements in common(Same Object)
	        List<String> vegetables = Arrays.asList("Carrot", "Potato", "Tomato");
	        boolean noCommon = Collections.disjoint(fruits, vegetables);
	        System.out.println("\n19. disjoint(fruits, vegetables): " + noCommon);
	        
	        // 20. addAll() - Adds all elements to collection
	        boolean added = Collections.addAll(fruits, "Kiwi", "Peach");
	        System.out.println("\n20. After addAll('Kiwi', 'Peach'): " + fruits);
	        System.out.println("Elements added: " + added);
	        
	        // 21. indexOfSubList() - Returns starting index of first occurrence of sublist
	        List<Integer> subList = Arrays.asList(2, 3);
	        int subIndex = Collections.indexOfSubList(numbers, subList);
	        System.out.println("\n21. indexOfSubList([2,3]): " + subIndex);
	        
//	        // 22. lastIndexOfSubList() - Returns starting index of last occurrence of sublist
//	        int lastSubIndex = Collections.lastIndexOfSubList(numbers, subList);
//	        System.out.println("22. lastIndexOfSubList([2,3]): " + lastSubIndex);
	        
	        // 23. reverseOrder() - Returns comparator that reverses natural ordering
	        Comparator<Integer> reverseComparator = Collections.reverseOrder();
	        numbers.sort(reverseComparator);
	        System.out.println("\n23. After sort with reverseOrder(): " + numbers);
	        
	        // 24. nCopies() - Returns immutable list with n copies of object
	        List<String> copies = Collections.nCopies(3, "Java");
	        System.out.println("\n24. nCopies(3, 'Java'): " + copies);
	        
	        // 25. enumeration() - Returns enumeration over collection
	        Enumeration<String> enumeration = Collections.enumeration(fruits);
	        System.out.println("\n25. Enumeration elements:");
	        while (enumeration.hasMoreElements()) {
	            System.out.print(enumeration.nextElement() + " ");
	        }
	        System.out.println();
	        
	        // 26. list() - Returns array list from enumeration
	        Vector<String> vector = new Vector<>(fruits);
	        Enumeration<String> vecEnum = vector.elements();
	        List<String> fromEnum = Collections.list(vecEnum);
	        System.out.println("\n26. List from enumeration: " + fromEnum);
	        
	        // Demonstrating thread-safe operations
	        System.out.println("\n=== Thread-safe Operations ===");
	        List<Integer> threadSafeList = Collections.synchronizedList(new ArrayList<>());
	        
	        // Add elements in synchronized manner
	        synchronized(threadSafeList) {
	            threadSafeList.add(10);
	            threadSafeList.add(20);
	            threadSafeList.add(30);
	        }
	        System.out.println("Thread-safe list: " + threadSafeList);
	    }
	}

