package D_Collecction_Framwork;

import java.util.*;
import java.util.function.Consumer;

public class LinkedHashSetMethods {
    public static void main(String[] args) {
        System.out.println("=== LINKEDHASHSET ALL METHODS WITH EXAMPLES ===\n");
        
        //======================================================================
        // 1. CONSTRUCTORS
        //======================================================================
        System.out.println("1. CONSTRUCTORS:");
        
        // public LinkedHashSet() - constructs empty set with default initial capacity (16) and load factor (0.75)
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        System.out.println("   LinkedHashSet() - Empty set: " + set1);
        
        // public LinkedHashSet(Collection<? extends E> c) - constructs set containing elements of specified collection
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("   LinkedHashSet(Collection) - From collection: " + set2);
        
        // public LinkedHashSet(int initialCapacity) - constructs empty set with specified capacity and default load factor (0.75)
        LinkedHashSet<String> set3 = new LinkedHashSet<>(20);
        set3.add("Test");
        System.out.println("   LinkedHashSet(20) - Set with capacity 20: " + set3);
        
        // public LinkedHashSet(int initialCapacity, float loadFactor) - constructs empty set with specified capacity and load factor
        LinkedHashSet<String> set4 = new LinkedHashSet<>(10, 0.8f);
        set4.add("Custom");
        System.out.println("   LinkedHashSet(10, 0.8f) - Set with custom parameters: " + set4);
        
        //======================================================================
        // 2. BASIC OPERATIONS (Inherited from HashSet)
        //======================================================================
        System.out.println("\n2. BASIC OPERATIONS:");
        
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        
        // add(E e) - adds specified element to set if not already present (maintains insertion order)
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("   add() operations - Set maintains insertion order: " + fruits);
        
        //======================================================================
        // 3. LINKEDHASHSET-SPECIFIC METHODS
        //======================================================================
        System.out.println("\n3. LINKEDHASHSET-SPECIFIC METHODS:");
        
        // public Spliterator<E> spliterator() - creates spliterator over elements
        Spliterator<String> spliterator = fruits.spliterator();
        System.out.println("   spliterator() - Characteristics: " + spliterator.characteristics());
        System.out.println("   spliterator() - Estimate size: " + spliterator.estimateSize());
        
       
        //======================================================================
        // 4. DEMONSTRATION OF INSERTION ORDER
        //======================================================================
        System.out.println("\n4. INSERTION ORDER DEMONSTRATION:");
        
        LinkedHashSet<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("Zebra");
        orderedSet.add("Apple");
        orderedSet.add("Mango");
        orderedSet.add("Banana");
        
        System.out.println("   Insertion order: Zebra, Apple, Mango, Banana");
        System.out.println("   LinkedHashSet order: " + orderedSet);
        System.out.println("   Regular HashSet order (for comparison): " + new HashSet<>(orderedSet));
        
        //======================================================================
        // 5. ADDITIONAL OPERATIONS
        //======================================================================
        System.out.println("\n5. ADDITIONAL OPERATIONS:");
        
        // Show that LinkedHashSet maintains insertion order even after removals
        LinkedHashSet<String> demoSet = new LinkedHashSet<>();
        demoSet.add("First");
        demoSet.add("Second");
        demoSet.add("Third");
        demoSet.add("Fourth");
        
        System.out.println("   Original order: " + demoSet);
        demoSet.remove("Second");
        System.out.println("   After removing 'Second': " + demoSet);
        demoSet.add("Fifth");
        System.out.println("   After adding 'Fifth': " + demoSet);
        
        // Null values demonstration
        LinkedHashSet<String> withNull = new LinkedHashSet<>();
        withNull.add(null);
        withNull.add("Apple");
        withNull.add(null); // Only one null allowed
        System.out.println("   Set with null: " + withNull);
        
       
        
        //======================================================================
        // 6. ITERATION DEMONSTRATION
        //======================================================================
        System.out.println("\n6. ITERATION DEMONSTRATION:");
        
        System.out.println("   Iteration order (maintains insertion order):");
        int count = 1;
        for (String fruit : fruits) {
            System.out.println("     " + count++ + ". " + fruit);
        }
        System.out.println("\n=== ALL LINKEDHASHSET METHODS DEMONSTRATED SUCCESSFULLY ===");
    }
}