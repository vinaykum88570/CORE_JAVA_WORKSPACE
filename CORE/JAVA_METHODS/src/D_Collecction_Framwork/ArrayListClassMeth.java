package D_Collecction_Framwork;


import java.util.*;


public class ArrayListClassMeth {
    public static void main(String[] args) {
        // Create ArrayLists for demonstration
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        System.out.println("=== ARRAYLIST ALL METHODS DEMONSTRATION ===\n");
        
        //======================================================================
        // 1. CONSTRUCTORS
        //======================================================================
        System.out.println("1. CONSTRUCTORS:");
        
        // ArrayList() - constructs empty list with initial capacity 10
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("   ArrayList() - Empty list: " + fruits);
        
        // ArrayList(int initialCapacity) - constructs empty list with specified capacity
        ArrayList<String> sizedList = new ArrayList<>(20);
        System.out.println("   ArrayList(20) - List with capacity 20");
        
        // ArrayList(Collection<? extends E> c) - constructs list containing elements of specified collection
        ArrayList<String> fromCollection = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("   ArrayList(Collection) - From collection: " + fromCollection);
        
        //======================================================================
        // 2. ADDING ELEMENTS
        //======================================================================
        System.out.println("\n2. ADDING ELEMENTS:");
        
        // add(E element) - appends the specified element to the end of this list
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println("   add(E) - After adding Apple, Mango: " + fruits);
        
        // add(int index, E element) - inserts the specified element at the specified position
        fruits.add(1, "Banana");
        System.out.println("   add(index, E) - Added Banana at index 1: " + fruits);
        
        // addAll(Collection<? extends E> c) - appends all elements in specified collection
        list1.addAll(Arrays.asList("Grapes", "Pineapple"));
        System.out.println("   addAll(Collection) - Added collection: " + list1);
        
        // addAll(int index, Collection<? extends E> c) - inserts all elements at specified position
        fruits.addAll(2, Arrays.asList("Kiwi", "Peach"));
        System.out.println("   addAll(index, Collection) - Added at index 2: " + fruits);
        
        //======================================================================
        // 3. ACCESSING ELEMENTS
        //======================================================================
        System.out.println("\n3. ACCESSING ELEMENTS:");
        
        // get(int index) - returns the element at the specified position
        String element = fruits.get(0);
        System.out.println("   get(0) - Element at index 0: " + element);
        
        // size() - returns the number of elements in this list
        int size = fruits.size();
        System.out.println("   size() - Current size: " + size);
        
        // isEmpty() - returns true if this list contains no elements
        boolean empty = fruits.isEmpty();
        System.out.println("   isEmpty() - Is list empty? " + empty);
        
        //======================================================================
        // 4. SEARCHING OPERATIONS
        //======================================================================
        System.out.println("\n4. SEARCHING OPERATIONS:");
        
        // contains(Object o) - returns true if this list contains the specified element
        boolean hasApple = fruits.contains("Apple");
        System.out.println("   contains('Apple') - Contains Apple? " + hasApple);
        
        // indexOf(Object o) - returns index of first occurrence of specified element
        int firstIndex = fruits.indexOf("Banana");
        System.out.println("   indexOf('Banana') - First index: " + firstIndex);
        
        // lastIndexOf(Object o) - returns index of last occurrence of specified element
        fruits.add("Banana"); // Add duplicate for demonstration
        int lastIndex = fruits.lastIndexOf("Banana");
        System.out.println("   lastIndexOf('Banana') - Last index: " + lastIndex);
        
        // containsAll(Collection<?> c) - returns true if list contains all elements of collection
        boolean containsAll = fruits.containsAll(Arrays.asList("Apple", "Banana"));
        System.out.println("   containsAll([Apple, Banana]) - Contains all? " + containsAll);
        
        //======================================================================
        // 5. MODIFYING ELEMENTS
        //======================================================================
        System.out.println("\n5. MODIFYING ELEMENTS:");
        
        // set(int index, E element) - replaces the element at specified position
        String oldElement = fruits.set(2, "Blueberry");
        System.out.println("   set(2, 'Blueberry') - Replaced: " + oldElement + ", Now: " + fruits);
        
        // replaceAll(UnaryOperator<E> operator) - replaces each element with result of operator
        fruits.replaceAll(String::toUpperCase);
        System.out.println("   replaceAll(toUpperCase) - After: " + fruits);
        
        //======================================================================
        // 6. REMOVING ELEMENTS
        //======================================================================
        System.out.println("\n6. REMOVING ELEMENTS:");
        
        // remove(int index) - removes the element at the specified position
        String removed = fruits.remove(3);
        System.out.println("   remove(3) - Removed: " + removed + ", Now: " + fruits);
        
        // remove(Object o) - removes first occurrence of specified element
        boolean removedObj = fruits.remove("MANGO");
        System.out.println("   remove('MANGO') - Removed? " + removedObj + ", Now: " + fruits);
        
        // removeAll(Collection<?> c) - removes all elements contained in specified collection
        boolean removedAll = fruits.removeAll(Arrays.asList("BLUEBERRY", "PEACH"));
        System.out.println("   removeAll([BLUEBERRY, PEACH]) - Removed? " + removedAll + ", Now: " + fruits);
        
        // removeIf(Predicate<? super E> filter) - removes all elements satisfying predicate
        boolean removedIf = fruits.removeIf(fruit -> fruit.startsWith("B"));
        System.out.println("   removeIf(startsWith 'B') - Removed? " + removedIf + ", Now: " + fruits);
        
        // retainAll(Collection<?> c) - retains only elements contained in specified collection
        boolean retained = fruits.retainAll(Arrays.asList("APPLE", "BANANA"));
        System.out.println("   retainAll([APPLE, BANANA]) - Retained? " + retained + ", Now: " + fruits);
        
        // clear() - removes all elements from this list
        fruits.clear();
        System.out.println("   clear() - After clear: " + fruits);
        
        //======================================================================
        // 7. LIST OPERATIONS
        //======================================================================
        System.out.println("\n7. LIST OPERATIONS:");
        
        // Re-populate for demonstration
        fruits.addAll(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Fig"));
        
        // subList(int fromIndex, int toIndex) - returns view of portion between specified indexes
        List<String> subList = fruits.subList(1, 4);
        System.out.println("   subList(1, 4) - Sublist: " + subList);
        
        //======================================================================
        // 8. CONVERSION METHODS
        //======================================================================
        System.out.println("\n8. CONVERSION METHODS:");
        
        // toArray() - returns an array containing all elements
        Object[] objectArray = fruits.toArray();
        System.out.println("   toArray() - Object array: " + Arrays.toString(objectArray));
        
        // toArray(T[] a) - returns an array containing all elements
        String[] stringArray = fruits.toArray(new String[0]);
        System.out.println("   toArray(T[]) - String array: " + Arrays.toString(stringArray));
        
      
        //======================================================================
        // 9. ITERATION METHODS
        //======================================================================
        System.out.println("\n9. ITERATION METHODS:");
        
        // iterator() - returns an iterator over elements
        System.out.println("   iterator() - Iterating:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println("     - " + iterator.next());
        }
        
        // listIterator() - returns list iterator over elements
        System.out.println("   listIterator() - List iterating:");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("     - " + listIterator.next());
        }
        
        // listIterator(int index) - returns list iterator starting at specified position
        System.out.println("   listIterator(2) - Starting from index 2:");
        ListIterator<String> listIteratorIndex = fruits.listIterator(2);
        while (listIteratorIndex.hasNext()) {
            System.out.println("     - " + listIteratorIndex.next());
        }
        
        // forEach(Consumer<? super E> action) - performs action for each element
        System.out.println("   forEach() - Using forEach:");
        fruits.forEach(fruit -> System.out.println("     - " + fruit));
        
        // spliterator() - creates a Spliterator over the elements
        Spliterator<String> spliterator = fruits.spliterator();
        System.out.println("   spliterator() - Characteristics: " + spliterator.characteristics());
        
        //======================================================================
        // 10. SORTING AND ORDERING
        //======================================================================
        System.out.println("\n10. SORTING AND ORDERING:");
        
        // sort(Comparator<? super E> c) - sorts according to specified comparator
        fruits.sort(Comparator.naturalOrder());
        System.out.println("   sort(naturalOrder) - Sorted: " + fruits);
        
        fruits.sort(Comparator.reverseOrder());
        System.out.println("   sort(reverseOrder) - Reverse sorted: " + fruits);
        
        //======================================================================
        // 11. CAPACITY MANAGEMENT (ArrayList specific)
        //======================================================================
        System.out.println("\n11. CAPACITY MANAGEMENT:");
        
        // ensureCapacity(int minCapacity) - increases capacity to ensure it can hold specified number
        fruits.ensureCapacity(100);
        System.out.println("   ensureCapacity(100) - Capacity ensured");
        
        // trimToSize() - trims the capacity to be the list's current size
        fruits.trimToSize();
        System.out.println("   trimToSize() - Trimmed to size");
        
        //======================================================================
        // 12. COMPARISON METHODS
        //======================================================================
        System.out.println("\n12. COMPARISON METHODS:");
        
        // equals(Object o) - compares the specified object with this list for equality
        ArrayList<String> copy = new ArrayList<>(fruits);
        boolean isEqual = fruits.equals(copy);
        System.out.println("   equals() - Lists equal? " + isEqual);
        
        // hashCode() - returns the hash code value for this list
        int hashCode = fruits.hashCode();
        System.out.println("   hashCode() - Hash code: " + hashCode);
        
        //======================================================================
        // 13. CLONING AND COPYING
        //======================================================================
        System.out.println("\n13. CLONING AND COPYING:");
        
        // clone() - returns a shallow copy of this ArrayList instance
        @SuppressWarnings("unchecked")
        ArrayList<String> cloned = (ArrayList<String>) fruits.clone();
        System.out.println("   clone() - Cloned list: " + cloned);
        
        //======================================================================
        // 14. JAVA 9+ METHODS
        //======================================================================
        System.out.println("\n14. JAVA 9+ METHODS:");
        
        // List.copyOf(Collection) - returns unmodifiable list containing elements (static)
        // List<String> immutable = List.copyOf(fruits);
        //System.out.println("   List.copyOf() - Immutable copy: " + immutable);
        
        //======================================================================
        // 15. FINAL METHODS
        //======================================================================
        System.out.println("\n15. FINAL METHODS:");
        
        // toString() - returns string representation of this collection
        String stringRep = fruits.toString();
        System.out.println("   toString() - String representation: " + stringRep);
        
        // getClass() - returns the runtime class of this Object
        Class<?> clazz = fruits.getClass();
        System.out.println("   getClass() - Class name: " + clazz.getSimpleName());
        
        System.out.println("\n=== ALL ARRAYLIST METHODS DEMONSTRATED SUCCESSFULLY ===");
    }
}