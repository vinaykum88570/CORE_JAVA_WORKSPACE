
package D_Collecction_Framwork;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.io.IOException;

public class LinkedHashMapMethods {
    public static void main(String[] args) {
        System.out.println("=== LINKEDHASHMAP ALL METHODS WITH EXAMPLES ===\n");
        
        //======================================================================
        // 1. CONSTRUCTORS
        //======================================================================
        System.out.println("1. CONSTRUCTORS:");
        
        // public LinkedHashMap(int initialCapacity, float loadFactor)
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>(16, 0.75f);
        map1.put("test", 1);
        System.out.println("   LinkedHashMap(16, 0.75f): " + map1);
        
        // public LinkedHashMap(int initialCapacity)
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>(20);
        map2.put("test", 1);
        System.out.println("   LinkedHashMap(20): " + map2);
        
        // public LinkedHashMap()
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        System.out.println("   LinkedHashMap(): " + map);
        
        // public LinkedHashMap(Map<? extends K, ? extends V> m)
        Map<String, Integer> initialMap = new HashMap<>();
        initialMap.put("Apple", 10);
        initialMap.put("Banana", 20);
        LinkedHashMap<String, Integer> map3 = new LinkedHashMap<>(initialMap);
        System.out.println("   LinkedHashMap(Map): " + map3);
        
        // public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
        LinkedHashMap<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put("First", 1);
        accessOrderMap.put("Second", 2);
        accessOrderMap.put("Third", 3);
        System.out.println("   LinkedHashMap(16, 0.75f, true) - Access order: " + accessOrderMap);
        
        //======================================================================
        // 2. BASIC OPERATIONS
        //======================================================================
        System.out.println("\n2. BASIC OPERATIONS:");
        
        // Insert elements to demonstrate insertion order
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Grapes", 40);
        System.out.println("   Insertion order maintained: " + map);
        
        // public int size()
        int size = map.size();
        System.out.println("   size(): " + size);
        
        // public boolean isEmpty()
        boolean empty = new LinkedHashMap<>().isEmpty();
        System.out.println("   isEmpty(): " + empty);
        
        // public V get(Object key)
        Integer value = map.get("Banana");
        System.out.println("   get('Banana'): " + value);
        
        // public boolean containsValue(Object value)
        boolean hasValue = map.containsValue(20);
        System.out.println("   containsValue(20): " + hasValue);
        
        //======================================================================
        // 3. ACCESS ORDER DEMONSTRATION
        //======================================================================
        System.out.println("\n3. ACCESS ORDER DEMONSTRATION:");
        
        System.out.println("   Before access: " + accessOrderMap);
        accessOrderMap.get("First"); // Access changes order
        System.out.println("   After get('First'): " + accessOrderMap);
        accessOrderMap.get("Second"); // Access changes order again
        System.out.println("   After get('Second'): " + accessOrderMap);
        
        //======================================================================
        // 4. JAVA 21+ SEQUENCED COLLECTION METHODS
        //======================================================================
        System.out.println("\n4. JAVA 21+ SEQUENCED COLLECTION METHODS:");
        
        // public V putFirst(K key, V value)
        // map.putFirst("Aardvark", 5);
        // System.out.println("   putFirst('Aardvark', 5): " + map);
        System.out.println("   putFirst() - Java 21+ feature (commented out)");
        
        // public V putLast(K key, V value)
        // map.putLast("Zucchini", 100);
        // System.out.println("   putLast('Zucchini', 100): " + map);
        System.out.println("   putLast() - Java 21+ feature (commented out)");
        
        // public SequencedSet<K> sequencedKeySet()
        // SequencedSet<String> sequencedKeys = map.sequencedKeySet();
        // System.out.println("   sequencedKeySet(): " + sequencedKeys);
        System.out.println("   sequencedKeySet() - Java 21+ feature (commented out)");
        
        // public SequencedCollection<V> sequencedValues()
        // SequencedCollection<Integer> sequencedValues = map.sequencedValues();
        // System.out.println("   sequencedValues(): " + sequencedValues);
        System.out.println("   sequencedValues() - Java 21+ feature (commented out)");
        
        // public SequencedSet<Map.Entry<K, V>> sequencedEntrySet()
        // SequencedSet<Map.Entry<String, Integer>> sequencedEntries = map.sequencedEntrySet();
        // System.out.println("   sequencedEntrySet(): " + sequencedEntries);
        System.out.println("   sequencedEntrySet() - Java 21+ feature (commented out)");
        
        // public SequencedMap<K, V> reversed()
        // SequencedMap<String, Integer> reversedMap = map.reversed();
        // System.out.println("   reversed(): " + reversedMap);
        System.out.println("   reversed() - Java 21+ feature (commented out)");
        
        //======================================================================
        // 5. VIEW METHODS
        //======================================================================
        System.out.println("\n5. VIEW METHODS:");
        
        // public Set<K> keySet()
        Set<String> keys = map.keySet();
        System.out.println("   keySet(): " + keys);
        
        // public Collection<V> values()
        Collection<Integer> values = map.values();
        System.out.println("   values(): " + values);
        
        // public Set<Map.Entry<K, V>> entrySet()
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("   entrySet(): " + entries);
        
        //======================================================================
        // 6. DEFAULT METHODS
        //======================================================================
        System.out.println("\n6. DEFAULT METHODS:");
        
        // public V getOrDefault(Object key, V defaultValue)
        Integer defaultValue = map.getOrDefault("Pineapple", 0);
        System.out.println("   getOrDefault('Pineapple', 0): " + defaultValue);
        
        //======================================================================
        // 7. ITERATION METHODS
        //======================================================================
        System.out.println("\n7. ITERATION METHODS:");
        
        // public void forEach(BiConsumer<? super K, ? super V> action)
        System.out.println("   forEach():");
        map.forEach((k, v) -> System.out.println("     " + k + " = " + v));
        
        // public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
        map.replaceAll((k, v) -> v * 2);
        System.out.println("   replaceAll((k, v) -> v * 2): " + map);
        
        //======================================================================
        // 8. REMOVAL AND CLEARING
        //======================================================================
        System.out.println("\n8. REMOVAL AND CLEARING:");
        
        // public void clear()
        LinkedHashMap<String, Integer> tempMap = new LinkedHashMap<>(map);
        tempMap.clear();
        System.out.println("   clear(): " + tempMap);
        
        // protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
        System.out.println("   removeEldestEntry() - Protected method (override for LRU cache)");
        
        //======================================================================
        // 9. JAVA 19+ FACTORY METHOD
        //======================================================================
        System.out.println("\n9. JAVA 19+ FACTORY METHOD:");
        
        // public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(int)
        // LinkedHashMap<String, Integer> newMap = LinkedHashMap.newLinkedHashMap(15);
        // newMap.put("Java19", 19);
        // System.out.println("   newLinkedHashMap(15): " + newMap);
        System.out.println("   newLinkedHashMap(int) - Java 19+ feature (commented out)");
        
        //======================================================================
        // 10. PACKAGE-PRIVATE AND PROTECTED METHODS
        //======================================================================
        System.out.println("\n10. PACKAGE-PRIVATE AND PROTECTED METHODS:");
        
        System.out.println("   head, tail fields - Internal linked list structure");
        System.out.println("   accessOrder field - Determines iteration order");
        System.out.println("   PUT_NORM, PUT_FIRST, PUT_LAST constants - Internal put modes");
        System.out.println("   putMode field - Internal put operation mode");
        
        System.out.println("   reinitialize() - Package-private method");
        System.out.println("   newNode() - Package-private method");
        System.out.println("   replacementNode() - Package-private method");
        System.out.println("   newTreeNode() - Package-private method");
        System.out.println("   replacementTreeNode() - Package-private method");
        System.out.println("   afterNodeRemoval() - Package-private method");
        System.out.println("   afterNodeInsertion() - Package-private method");
        System.out.println("   afterNodeAccess() - Package-private method");
        System.out.println("   internalWriteEntries() - Package-private method");
        System.out.println("   nsee() - Package-private static method");
        System.out.println("   keysToArray() - Package-private method");
        System.out.println("   valuesToArray() - Package-private method");
        
        //======================================================================
        // 11. INSERTION ORDER DEMONSTRATION
        //======================================================================
        System.out.println("\n11. INSERTION ORDER DEMONSTRATION:");
        
        LinkedHashMap<String, Integer> orderedMap = new LinkedHashMap<>();
        orderedMap.put("Zebra", 100);
        orderedMap.put("Apple", 200);
        orderedMap.put("Mango", 300);
        orderedMap.put("Banana", 400);
        
        System.out.println("   Insertion order: Zebra, Apple, Mango, Banana");
        System.out.println("   LinkedHashMap order: " + orderedMap);
        System.out.println("   Regular HashMap order (for comparison): " + new HashMap<>(orderedMap));
        
        // Demonstrate that order is maintained after operations
        orderedMap.remove("Apple");
        orderedMap.put("Cherry", 500);
        System.out.println("   After remove('Apple') and put('Cherry'): " + orderedMap);
        
        //======================================================================
        // 12. ARRAY CONVERSION DEMONSTRATION
        //======================================================================
        System.out.println("\n12. ARRAY CONVERSION:");
        
        String[] keyArray = map.keySet().toArray(new String[0]);
        System.out.println("   keySet().toArray(): " + Arrays.toString(keyArray));
        
        Integer[] valueArray = map.values().toArray(new Integer[0]);
        System.out.println("   values().toArray(): " + Arrays.toString(valueArray));
        
        System.out.println("\n=== ALL LINKEDHASHMAP METHODS DEMONSTRATED SUCCESSFULLY ===");
        
        //======================================================================
        // 13. LRU CACHE EXAMPLE USING removeEldestEntry
        //======================================================================
        System.out.println("\n13. LRU CACHE EXAMPLE:");
        
        // Create a simple LRU cache with size limit of 3
        LinkedHashMap<String, Integer> lruCache = new LinkedHashMap(16, 0.75f, true) {
        };
        
        lruCache.put("One", 1);
        lruCache.put("Two", 2);
        lruCache.put("Three", 3);
        System.out.println("   Cache after adding 3 entries: " + lruCache);
        
        lruCache.get("One"); // Access to make it recently used
        lruCache.put("Four", 4); // This should remove the eldest entry
        System.out.println("   Cache after adding 4th entry: " + lruCache);
    }
}