package D_Collecction_Framwork;

import java.util.*;
import java.util.function.Consumer;

public class TreeSetClassMethods {
    public static void main(String[] args) {
        System.out.println("=== TREESET ALL METHODS WITH EXAMPLES ===\n");
        
        //======================================================================
        // 1. CONSTRUCTORS
        //======================================================================
        System.out.println("1. CONSTRUCTORS:");
        
        // TreeSet(NavigableMap<E, Object> m) - package-private constructor
        System.out.println("   TreeSet(NavigableMap) - Package-private constructor (not accessible)");
        
        // public TreeSet() - constructs empty tree set sorted according to natural ordering
        TreeSet<String> treeSet1 = new TreeSet<>();
        System.out.println("   TreeSet() - Empty set with natural ordering: " + treeSet1);
        
        // public TreeSet(Comparator<? super E> comparator) - constructs empty tree set with specified comparator
        TreeSet<String> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
        System.out.println("   TreeSet(Comparator.reverseOrder()) - Empty set with reverse ordering");
        
        // public TreeSet(Collection<? extends E> c) - constructs tree set containing elements of collection
        TreeSet<String> treeSet3 = new TreeSet<>(Arrays.asList("Banana", "Apple", "Cherry"));
        System.out.println("   TreeSet(Collection) - From collection (sorted): " + treeSet3);
        
        // public TreeSet(SortedSet<E> s) - constructs tree set with same elements and ordering as sorted set
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList("Date", "Fig", "Grapes"));
        TreeSet<String> treeSet4 = new TreeSet<>(sortedSet);
        System.out.println("   TreeSet(SortedSet) - From sorted set: " + treeSet4);
        
        //======================================================================
        // 2. BASIC OPERATIONS
        //======================================================================
        System.out.println("\n2. BASIC OPERATIONS:");
        
        TreeSet<String> fruits = new TreeSet<>();
        
        // public boolean add(E e) - adds specified element to set
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("   add() operations - Elements sorted automatically: " + fruits);
        
        // public int size() - returns number of elements
        int size = fruits.size();
        System.out.println("   size(): " + size);
        
        // public boolean isEmpty() - returns true if set contains no elements
        boolean empty = fruits.isEmpty();
        System.out.println("   isEmpty(): " + empty);
        
        // public boolean contains(Object o) - returns true if set contains specified element
        boolean hasApple = fruits.contains("Apple");
        boolean hasGrapes = fruits.contains("Grapes");
        System.out.println("   contains('Apple'): " + hasApple);
        System.out.println("   contains('Grapes'): " + hasGrapes);
        
        //======================================================================
        // 3. ITERATION METHODS
        //======================================================================
        System.out.println("\n3. ITERATION METHODS:");
        
        // public Iterator<E> iterator() - returns iterator over elements in ascending order
        System.out.println("   iterator() - Ascending order:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println("     - " + iterator.next());
        }
        
        // public Iterator<E> descendingIterator() - returns iterator over elements in descending order
        System.out.println("   descendingIterator() - Descending order:");
        Iterator<String> descendingIterator = fruits.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println("     - " + descendingIterator.next());
        }
        
        // public NavigableSet<E> descendingSet() - returns reverse order view
        NavigableSet<String> descendingSet = fruits.descendingSet();
        System.out.println("   descendingSet(): " + descendingSet);
        
        // public Spliterator<E> spliterator() - creates spliterator over elements
        Spliterator<String> spliterator = fruits.spliterator();
        System.out.println("   spliterator() - Characteristics: " + spliterator.characteristics());
        
        //======================================================================
        // 4. REMOVAL OPERATIONS
        //======================================================================
        System.out.println("\n4. REMOVAL OPERATIONS:");
        
        // public boolean remove(Object o) - removes specified element from set
        boolean removed = fruits.remove("Mango");
        System.out.println("   remove('Mango'): " + removed + ", Set: " + fruits);
        
        // public void clear() - removes all elements from set
        TreeSet<String> tempSet = new TreeSet<>(fruits);
        tempSet.clear();
        System.out.println("   clear() - After clear: " + tempSet);
        
        // public E pollFirst() - retrieves and removes first element
        fruits.add("Mango"); // Add back for demonstration
        String first = fruits.pollFirst();
        System.out.println("   pollFirst(): " + first + ", Set: " + fruits);
        
        // public E pollLast() - retrieves and removes last element
        String last = fruits.pollLast();
        System.out.println("   pollLast(): " + last + ", Set: " + fruits);
        
        // Re-populate for further demonstrations
        fruits.addAll(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Fig", "Grapes"));
        System.out.println("   Repopulated set: " + fruits);
        
        //======================================================================
        // 5. BULK OPERATIONS
        //======================================================================
        System.out.println("\n5. BULK OPERATIONS:");
        
        // public boolean addAll(Collection<? extends E> c) - adds all elements from collection
        boolean addedAll = fruits.addAll(Arrays.asList("Kiwi", "Lemon"));
        System.out.println("   addAll([Kiwi, Lemon]): " + addedAll + ", Set: " + fruits);
        
        //======================================================================
        // 6. RANGE OPERATIONS
        //======================================================================
        System.out.println("\n6. RANGE OPERATIONS:");
        
        // public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
        NavigableSet<String> subSet = fruits.subSet("Cherry", true, "Grapes", true);
        System.out.println("   subSet(Cherry, true, Grapes, true): " + subSet);
        
        // public NavigableSet<E> headSet(E toElement, boolean inclusive)
        NavigableSet<String> headSet = fruits.headSet("Date", true);
        System.out.println("   headSet(Date, true): " + headSet);
        
        // public NavigableSet<E> tailSet(E fromElement, boolean inclusive)
        NavigableSet<String> tailSet = fruits.tailSet("Fig", true);
        System.out.println("   tailSet(Fig, true): " + tailSet);
        
        // public SortedSet<E> subSet(E fromElement, E toElement)
        SortedSet<String> sortedSubSet = fruits.subSet("Banana", "Fig");
        System.out.println("   subSet(Banana, Fig): " + sortedSubSet);
        
        // public SortedSet<E> headSet(E toElement)
        SortedSet<String> sortedHeadSet = fruits.headSet("Date");
        System.out.println("   headSet(Date): " + sortedHeadSet);
        
        // public SortedSet<E> tailSet(E fromElement)
        SortedSet<String> sortedTailSet = fruits.tailSet("Grapes");
        System.out.println("   tailSet(Grapes): " + sortedTailSet);
        
        //======================================================================
        // 7. ELEMENT ACCESS METHODS
        //======================================================================
        System.out.println("\n7. ELEMENT ACCESS METHODS:");
        
        // public E first() - returns first (lowest) element
        String firstElement = fruits.first();
        System.out.println("   first(): " + firstElement);
        
        // public E last() - returns last (highest) element
        String lastElement = fruits.last();
        System.out.println("   last(): " + lastElement);
        
        // public E lower(E e) - returns greatest element strictly less than given element
        String lower = fruits.lower("Cherry");
        System.out.println("   lower('Cherry'): " + lower);
        
        // public E floor(E e) - returns greatest element less than or equal to given element
        String floor = fruits.floor("Cherry");
        System.out.println("   floor('Cherry'): " + floor);
        
        // public E ceiling(E e) - returns least element greater than or equal to given element
        String ceiling = fruits.ceiling("Elderberry");
        System.out.println("   ceiling('Elderberry'): " + ceiling);
        
        // public E higher(E e) - returns least element strictly greater than given element
        String higher = fruits.higher("Date");
        System.out.println("   higher('Date'): " + higher);
        
        //======================================================================
        // 8. COMPARATOR METHOD
        //======================================================================
        System.out.println("\n8. COMPARATOR METHOD:");
        
        // public Comparator<? super E> comparator() - returns comparator used to order elements
        Comparator<? super String> comparator = fruits.comparator();
        System.out.println("   comparator(): " + (comparator == null ? "Natural ordering" : comparator));
        
        // Create TreeSet with custom comparator
        TreeSet<String> customOrder = new TreeSet<>(Comparator.reverseOrder());
        customOrder.addAll(fruits);
        System.out.println("   TreeSet with reverse comparator: " + customOrder);
        System.out.println("   Custom comparator(): " + customOrder.comparator());
        
        //======================================================================
        // 9. CLONING METHOD
        //======================================================================
        System.out.println("\n9. CLONING METHOD:");
        
        // public Object clone() - returns shallow copy of this TreeSet instance
        @SuppressWarnings("unchecked")
        TreeSet<String> cloned = (TreeSet<String>) fruits.clone();
        System.out.println("   clone() - Cloned set: " + cloned);
        System.out.println("   Original equals cloned: " + fruits.equals(cloned));
        
        
        System.out.println("\n=== ALL TREESET METHODS DEMONSTRATED SUCCESSFULLY ===");
        
        //======================================================================
        // 10. ADDITIONAL DEMONSTRATIONS
        //======================================================================
        System.out.println("\n11. ADDITIONAL DEMONSTRATIONS:");
        
        // Show that TreeSet maintains sorted order
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        System.out.println("   Numbers added: 50, 10, 30, 20, 40");
        System.out.println("   TreeSet order (sorted): " + numbers);
        
        // Null values demonstration
        try {
            TreeSet<String> withNull = new TreeSet<>();
            withNull.add(null); // TreeSet doesn't allow nulls
        } catch (NullPointerException e) {
            System.out.println("   TreeSet does not allow null elements: " + e.getClass().getSimpleName());
        }
    }
}
