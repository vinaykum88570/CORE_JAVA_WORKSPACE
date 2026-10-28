package D_Collecction_Framwork;


import java.util.*;

import java.io.IOException;

public class HashMapClassMethods {
    public static void main(String[] args) {
        System.out.println("=== HASHMAP ALL METHODS WITH EXAMPLES ===\n");
        
        //======================================================================
        // 1. CONSTRUCTORS
        //======================================================================
        System.out.println("1. CONSTRUCTORS:");
        
        // public HashMap(int initialCapacity, float loadFactor)
        HashMap<String, Integer> map1 = new HashMap<>(16, 0.75f);
        map1.put("test", 1);
        System.out.println("   HashMap(16, 0.75f) - Custom capacity and load factor: " + map1);
        
        // public HashMap(int initialCapacity)
        HashMap<String, Integer> map2 = new HashMap<>(20);
        map2.put("test", 1);
        System.out.println("   HashMap(20) - Custom capacity: " + map2);
        
        // public HashMap()
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("   HashMap() - Default constructor: " + map);
        
        // public HashMap(Map<? extends K, ? extends V> m)
        Map<String, Integer> initialMap = new HashMap<>();
        initialMap.put("Apple", 10);
        initialMap.put("Banana", 20);
        HashMap<String, Integer> map3 = new HashMap<>(initialMap);
        System.out.println("   HashMap(Map) - From existing map: " + map3);
        
        //======================================================================
        // 2. BASIC OPERATIONS
        //======================================================================
        System.out.println("\n2. BASIC OPERATIONS:");
        
        // public int size()
        int size = map3.size();
        System.out.println("   size(): " + size);
        
        // public boolean isEmpty()
        boolean empty = map.isEmpty();
        System.out.println("   isEmpty(): " + empty);
        
        // public V put(K key, V value)
        Integer oldValue = map3.put("Orange", 30);
        System.out.println("   put('Orange', 30): " + oldValue + ", Map: " + map3);
        
        // public V get(Object key)
        Integer value = map3.get("Apple");
        System.out.println("   get('Apple'): " + value);
        
        // public boolean containsKey(Object key)
        boolean hasKey = map3.containsKey("Banana");
        System.out.println("   containsKey('Banana'): " + hasKey);
        
        // public boolean containsValue(Object value)
        boolean hasValue = map3.containsValue(20);
        System.out.println("   containsValue(20): " + hasValue);
        
        //======================================================================
        // 3. BULK OPERATIONS
        //======================================================================
        System.out.println("\n3. BULK OPERATIONS:");
        
        // public void putAll(Map<? extends K, ? extends V> m)
        Map<String, Integer> moreFruits = new HashMap<>();
        moreFruits.put("Grapes", 40);
        moreFruits.put("Mango", 50);
        map3.putAll(moreFruits);
        System.out.println("   putAll(): " + map3);
        
        // public void clear()
        HashMap<String, Integer> tempMap = new HashMap<>(map3);
        tempMap.clear();
        System.out.println("   clear(): " + tempMap);
        
        //======================================================================
        // 4. REMOVAL OPERATIONS
        //======================================================================
        System.out.println("\n4. REMOVAL OPERATIONS:");
        
        // public V remove(Object key)
        Integer removed = map3.remove("Banana");
        System.out.println("   remove('Banana'): " + removed + ", Map: " + map3);
        
        // public boolean remove(Object key, Object value)
        boolean removedEntry = map3.remove("Apple", 10);
        System.out.println("   remove('Apple', 10): " + removedEntry + ", Map: " + map3);
        
        //======================================================================
        // 5. VIEW METHODS
        //======================================================================
        System.out.println("\n5. VIEW METHODS:");
        
        // public Set<K> keySet()
        Set<String> keys = map3.keySet();
        System.out.println("   keySet(): " + keys);
        
        // public Collection<V> values()
        Collection<Integer> values = map3.values();
        System.out.println("   values(): " + values);
        
        // public Set<Map.Entry<K, V>> entrySet()
        Set<Map.Entry<String, Integer>> entries = map3.entrySet();
        System.out.println("   entrySet(): " + entries);
        
        //======================================================================
        // 6. DEFAULT METHODS (Java 8+)
        //======================================================================
        System.out.println("\n6. DEFAULT METHODS:");
        
        // public V getOrDefault(Object key, V defaultValue)
        Integer defaultValue = map3.getOrDefault("Pineapple", 0);
        System.out.println("   getOrDefault('Pineapple', 0): " + defaultValue);
        
        // public V putIfAbsent(K key, V value)
        Integer absentValue = map3.putIfAbsent("Grapes", 100); // Already exists
        Integer newValue = map3.putIfAbsent("Pineapple", 60); // New key
        System.out.println("   putIfAbsent('Grapes', 100): " + absentValue);
        System.out.println("   putIfAbsent('Pineapple', 60): " + newValue + ", Map: " + map3);
        
        // public boolean replace(K key, V oldValue, V newValue)
        boolean replaced = map3.replace("Grapes", 40, 45);
        System.out.println("   replace('Grapes', 40, 45): " + replaced + ", Map: " + map3);
        
        // public V replace(K key, V value)
        Integer replacedValue = map3.replace("Orange", 35);
        System.out.println("   replace('Orange', 35): " + replacedValue + ", Map: " + map3);
        
        //======================================================================
        // 7. COMPUTE METHODS (Java 8+)
        //======================================================================
        System.out.println("\n7. COMPUTE METHODS:");
        
        // public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
        Integer computedAbsent = map3.computeIfAbsent("Papaya", k -> 70);
        System.out.println("   computeIfAbsent('Papaya', k -> 70): " + computedAbsent + ", Map: " + map3);
        
        // public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        Integer computedPresent = map3.computeIfPresent("Mango", (k, v) -> v + 10);
        System.out.println("   computeIfPresent('Mango', (k, v) -> v + 10): " + computedPresent + ", Map: " + map3);
        
        // public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        Integer computed = map3.compute("Orange", (k, v) -> v != null ? v + 5 : 0);
        System.out.println("   compute('Orange', (k, v) -> v + 5): " + computed + ", Map: " + map3);
        
        // public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
        Integer merged = map3.merge("Mango", 25, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("   merge('Mango', 25, (old, new) -> old + new): " + merged + ", Map: " + map3);
        
        //======================================================================
        // 8. ITERATION METHODS (Java 8+)
        //======================================================================
        System.out.println("\n8. ITERATION METHODS:");
        
        // public void forEach(BiConsumer<? super K, ? super V> action)
        System.out.println("   forEach():");
        map3.forEach((k, v) -> System.out.println("     " + k + " = " + v));
        
        // public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
        map3.replaceAll((k, v) -> v * 2);
        System.out.println("   replaceAll((k, v) -> v * 2): " + map3);
        
        //======================================================================
        // 9. CLONING METHOD
        //======================================================================
        System.out.println("\n9. CLONING METHOD:");
        
        // public Object clone()
        @SuppressWarnings("unchecked")
        HashMap<String, Integer> cloned = (HashMap<String, Integer>) map3.clone();
        System.out.println("   clone(): " + cloned);
        System.out.println("   Original equals cloned: " + map3.equals(cloned));
        
        //======================================================================
        // 10. PACKAGE-PRIVATE AND PROTECTED METHODS
        //======================================================================
        System.out.println("\n10. PACKAGE-PRIVATE AND PROTECTED METHODS:");
        
        System.out.println("   putMapEntries() - Package-private method");
        System.out.println("   getNode() - Package-private method");
        System.out.println("   putVal() - Package-private method");
        System.out.println("   resize() - Package-private method");
        System.out.println("   treeifyBin() - Package-private method");
        System.out.println("   removeNode() - Package-private method");
        System.out.println("   prepareArray() - Package-private method");
        System.out.println("   keysToArray() - Package-private method");
        System.out.println("   valuesToArray() - Package-private method");
        System.out.println("   loadFactor() - Package-private method");
        System.out.println("   capacity() - Package-private method");
        System.out.println("   newNode() - Package-private method");
        System.out.println("   replacementNode() - Package-private method");
        System.out.println("   newTreeNode() - Package-private method");
        System.out.println("   replacementTreeNode() - Package-private method");
        System.out.println("   reinitialize() - Package-private method");
        System.out.println("   afterNodeAccess() - Package-private method");
        System.out.println("   afterNodeInsertion() - Package-private method");
        System.out.println("   afterNodeRemoval() - Package-private method");
        System.out.println("   internalWriteEntries() - Package-private method");
        
        //======================================================================
        // 11. ARRAY CONVERSION DEMONSTRATION
        //======================================================================
        System.out.println("\n11. ARRAY CONVERSION:");
        
        // Demonstrate toArray functionality through public methods
        String[] keyArray = map3.keySet().toArray(new String[0]);
        System.out.println("   keySet().toArray(): " + Arrays.toString(keyArray));
        
        Integer[] valueArray = map3.values().toArray(new Integer[0]);
        System.out.println("   values().toArray(): " + Arrays.toString(valueArray));
        
        System.out.println("\n=== ALL HASHMAP METHODS DEMONSTRATED SUCCESSFULLY ===");
        
        //======================================================================
        // 12. ADDITIONAL DEMONSTRATIONS
        //======================================================================
        System.out.println("\n12. ADDITIONAL DEMONSTRATIONS:");
        
        // Null keys and values
        HashMap<String, Integer> nullDemo = new HashMap<>();
        nullDemo.put(null, 100);
        nullDemo.put("test", null);
        System.out.println("   Null key and value demo: " + nullDemo);
        System.out.println("   get(null): " + nullDemo.get(null));
        
        // Collision demonstration
        HashMap<Integer, String> collisionDemo = new HashMap<>(2);
        collisionDemo.put(1, "One");
        collisionDemo.put(2, "Two");
        collisionDemo.put(3, "Three"); // This may cause collision in small map
        System.out.println("   Collision demo: " + collisionDemo);
    }
}