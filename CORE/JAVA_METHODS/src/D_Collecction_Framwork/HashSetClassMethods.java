package D_Collecction_Framwork;

import java.util.*;
import java.util.function.Consumer;

public class HashSetClassMethods {
    public static void main(String[] args) {
        System.out.println("=== HASHSET ALL METHODS WITH EXAMPLES ===\n");
        
        //======================================================================
        // 1. CONSTRUCTORS
        //======================================================================
        System.out.println("1. CONSTRUCTORS:");
        
        // public HashSet() - constructs empty set with default initial capacity (16) and load factor (0.75)
        HashSet<String> set1 = new HashSet<>();
        System.out.println("   HashSet() - Empty set: " + set1);
        
        // public HashSet(Collection<? extends E> c) - constructs set containing elements of specified collection
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("   HashSet(Collection) - From collection: " + set2);
        
        // public HashSet(int initialCapacity) - constructs empty set with specified capacity and default load factor (0.75)
        HashSet<String> set3 = new HashSet<>(20);
        set3.add("Test");
        System.out.println("   HashSet(20) - Set with capacity 20: " + set3);
        
        // public HashSet(int initialCapacity, float loadFactor) - constructs empty set with specified capacity and load factor
        HashSet<String> set4 = new HashSet<>(10, 0.8f);
        set4.add("Custom");
        System.out.println("   HashSet(10, 0.8f) - Set with custom parameters: " + set4);
        
        // HashSet(int initialCapacity, float loadFactor, boolean dummy) - package-private constructor
        System.out.println("   HashSet(int, float, boolean) - Package-private constructor (not accessible)");
        
        //======================================================================
        // 2. BASIC OPERATIONS
        //======================================================================
        System.out.println("\n2. BASIC OPERATIONS:");
        
        HashSet<String> fruits = new HashSet<>();
        
        // public boolean add(E e) - adds specified element to set if not already present
        boolean added1 = fruits.add("Apple");
        boolean added2 = fruits.add("Mango");
        boolean added3 = fruits.add("Apple"); // Duplicate
        System.out.println("   add('Apple'): " + added1);
        System.out.println("   add('Mango'): " + added2);
        System.out.println("   add('Apple') again: " + added3 + " (duplicate rejected)");
        System.out.println("   Set after adds: " + fruits);
        
        // public boolean contains(Object o) - returns true if set contains specified element
        boolean hasApple = fruits.contains("Apple");
        boolean hasGrapes = fruits.contains("Grapes");
        System.out.println("   contains('Apple'): " + hasApple);
        System.out.println("   contains('Grapes'): " + hasGrapes);
        
        // public int size() - returns number of elements in set
        int size = fruits.size();
        System.out.println("   size(): " + size);
        
        // public boolean isEmpty() - returns true if set contains no elements
        boolean empty = fruits.isEmpty();
        System.out.println("   isEmpty(): " + empty);
        
        //======================================================================
        // 3. REMOVAL OPERATIONS
        //======================================================================
        System.out.println("\n3. REMOVAL OPERATIONS:");
        
        // public boolean remove(Object o) - removes specified element from set if present
        boolean removed = fruits.remove("Mango");
        boolean removedNonExistent = fruits.remove("Grapes");
        System.out.println("   remove('Mango'): " + removed);
        System.out.println("   remove('Grapes'): " + removedNonExistent);
        System.out.println("   Set after removal: " + fruits);
        
        // public void clear() - removes all elements from set
        fruits.clear();
        System.out.println("   clear() - After clear: " + fruits);
        
        // Re-populate for further demonstrations
        fruits.addAll(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        System.out.println("   Repopulated set: " + fruits);
        
        //======================================================================
        // 4. ITERATION METHODS
        //======================================================================
        System.out.println("\n4. ITERATION METHODS:");
        
        // public Iterator<E> iterator() - returns iterator over elements in set
        System.out.println("   iterator() - Iterating:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println("     - " + iterator.next());
        }
        
        // public Spliterator<E> spliterator() - creates spliterator over elements
        Spliterator<String> spliterator = fruits.spliterator();
        System.out.println("   spliterator() - Characteristics: " + spliterator.characteristics());
        System.out.println("   spliterator() - Estimate size: " + spliterator.estimateSize());
        
        //======================================================================
        // 5. CONVERSION METHODS
        //======================================================================
        System.out.println("\n5. CONVERSION METHODS:");
        
        // public Object[] toArray() - returns array containing all elements
        Object[] objectArray = fruits.toArray();
        System.out.println("   toArray() - Object array: " + Arrays.toString(objectArray));
        
        // public <T> T[] toArray(T[] a) - returns array of specified type containing all elements
        String[] stringArray = fruits.toArray(new String[0]);
        System.out.println("   toArray(T[]) - String array: " + Arrays.toString(stringArray));
        
        //======================================================================
        // 6. CLONING METHOD
        //======================================================================
        System.out.println("\n6. CLONING METHOD:");
        
        // public Object clone() - returns shallow copy of this HashSet instance
        @SuppressWarnings("unchecked")
        HashSet<String> cloned = (HashSet<String>) fruits.clone();
        System.out.println("   clone() - Cloned set: " + cloned);
        System.out.println("   Original equals cloned: " + fruits.equals(cloned));
        
        //======================================================================
        // 7. JAVA 19+ METHOD
        //======================================================================
        System.out.println("\n7. JAVA 19+ METHOD:");
        
        // public static <T> HashSet<T> newHashSet(int) - creates new empty HashSet with specified capacity
        // HashSet<String> newSet = HashSet.newHashSet(15);
        // newSet.add("Java19");
        // System.out.println("   newHashSet(15) - New set: " + newSet);
        System.out.println("   newHashSet(int) - Java 19+ feature (commented out)");
        
        //======================================================================
        // 8. ADDITIONAL DEMONSTRATIONS
        //======================================================================
        System.out.println("\n8. ADDITIONAL DEMONSTRATIONS:");
        
        // Show that HashSet doesn't maintain order
        HashSet<String> unordered = new HashSet<>();
        unordered.add("Zebra");
        unordered.add("Apple");
        unordered.add("Mango");
        unordered.add("Banana");
        System.out.println("   Insertion order: Zebra, Apple, Mango, Banana");
        System.out.println("   HashSet order: " + unordered);
        
        // Show null handling
        HashSet<String> withNull = new HashSet<>();
        withNull.add(null);
        withNull.add("Apple");
        withNull.add(null); // Only one null allowed
        System.out.println("   Set with null: " + withNull);
        
        System.out.println("\n=== ALL HASHSET METHODS DEMONSTRATED SUCCESSFULLY ===");
    }
}