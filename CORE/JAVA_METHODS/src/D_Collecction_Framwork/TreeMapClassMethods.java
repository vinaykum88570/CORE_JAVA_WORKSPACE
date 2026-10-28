package D_Collecction_Framwork;

import java.util.*;

import java.io.IOException;

public class TreeMapClassMethods {
    public static void main(String[] args) {
        System.out.println("=== TREEMAP ALL METHODS WITH EXAMPLES ===\n");
        
        //======================================================================
        // 1. CONSTRUCTORS
        //======================================================================
        System.out.println("1. CONSTRUCTORS:");
        
        // public TreeMap() - natural ordering
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        System.out.println("   TreeMap() - Natural ordering: " + treeMap1);
        
        // public TreeMap(Comparator<? super K> comparator) - custom ordering
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(Comparator.reverseOrder());
        System.out.println("   TreeMap(Comparator.reverseOrder()) - Reverse ordering");
        
        // public TreeMap(Map<? extends K, ? extends V> map) - from existing map
        Map<String, Integer> initialMap = new HashMap<>();
        initialMap.put("Banana", 20);
        initialMap.put("Apple", 10);
        TreeMap<String, Integer> treeMap3 = new TreeMap<>(initialMap);
        System.out.println("   TreeMap(Map) - Sorted from unsorted map: " + treeMap3);
        
        // public TreeMap(SortedMap<K, ? extends V> sortedMap) - from sorted map
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Date", 40);
        sortedMap.put("Cherry", 30);
        TreeMap<String, Integer> treeMap4 = new TreeMap<>(sortedMap);
        System.out.println("   TreeMap(SortedMap) - From sorted map: " + treeMap4);
        
        //======================================================================
        // 2. BASIC OPERATIONS
        //======================================================================
        System.out.println("\n2. BASIC OPERATIONS:");
        
        TreeMap<String, Integer> map = new TreeMap<>();
        
        // public V put(K key, V value)
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);
        System.out.println("   put() operations - Automatically sorted: " + map);
        
        // public int size()
        int size = map.size();
        System.out.println("   size(): " + size);
        
        // public boolean containsKey(Object key)
        boolean hasKey = map.containsKey("Banana");
        System.out.println("   containsKey('Banana'): " + hasKey);
        
        // public boolean containsValue(Object value)
        boolean hasValue = map.containsValue(20);
        System.out.println("   containsValue(20): " + hasValue);
        
        // public V get(Object key)
        Integer value = map.get("Apple");
        System.out.println("   get('Apple'): " + value);
        
        // public Comparator<? super K> comparator()
        Comparator<? super String> comparator = map.comparator();
        System.out.println("   comparator(): " + (comparator == null ? "Natural ordering" : comparator));
        
        //======================================================================
        // 3. FIRST AND LAST OPERATIONS
        //======================================================================
        System.out.println("\n3. FIRST AND LAST OPERATIONS:");
        
        // public K firstKey()
        String firstKey = map.firstKey();
        System.out.println("   firstKey(): " + firstKey);
        
        // public K lastKey()
        String lastKey = map.lastKey();
        System.out.println("   lastKey(): " + lastKey);
        
        // public Map.Entry<K, V> firstEntry()
        Map.Entry<String, Integer> firstEntry = map.firstEntry();
        System.out.println("   firstEntry(): " + firstEntry);
        
        // public Map.Entry<K, V> lastEntry()
        Map.Entry<String, Integer> lastEntry = map.lastEntry();
        System.out.println("   lastEntry(): " + lastEntry);
        
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
        
        //======================================================================
        // 5. NAVIGATION METHODS
        //======================================================================
        System.out.println("\n5. NAVIGATION METHODS:");
        
        // public Map.Entry<K, V> lowerEntry(K key)
        Map.Entry<String, Integer> lowerEntry = map.lowerEntry("Cherry");
        System.out.println("   lowerEntry('Cherry'): " + lowerEntry);
        
        // public K lowerKey(K key)
        String lowerKey = map.lowerKey("Cherry");
        System.out.println("   lowerKey('Cherry'): " + lowerKey);
        
        // public Map.Entry<K, V> floorEntry(K key)
        Map.Entry<String, Integer> floorEntry = map.floorEntry("Cherry");
        System.out.println("   floorEntry('Cherry'): " + floorEntry);
        
        // public K floorKey(K key)
        String floorKey = map.floorKey("Cherry");
        System.out.println("   floorKey('Cherry'): " + floorKey);
        
        // public Map.Entry<K, V> ceilingEntry(K key)
        Map.Entry<String, Integer> ceilingEntry = map.ceilingEntry("Cherry");
        System.out.println("   ceilingEntry('Cherry'): " + ceilingEntry);
        
        // public K ceilingKey(K key)
        String ceilingKey = map.ceilingKey("Cherry");
        System.out.println("   ceilingKey('Cherry'): " + ceilingKey);
        
        // public Map.Entry<K, V> higherEntry(K key)
        Map.Entry<String, Integer> higherEntry = map.higherEntry("Cherry");
        System.out.println("   higherEntry('Cherry'): " + higherEntry);
        
        // public K higherKey(K key)
        String higherKey = map.higherKey("Cherry");
        System.out.println("   higherKey('Cherry'): " + higherKey);
        
        //======================================================================
        // 6. POLLING METHODS
        //======================================================================
        System.out.println("\n6. POLLING METHODS:");
        
        // public Map.Entry<K, V> pollFirstEntry()
        Map.Entry<String, Integer> polledFirst = map.pollFirstEntry();
        System.out.println("   pollFirstEntry(): " + polledFirst + ", Map: " + map);
        
        // public Map.Entry<K, V> pollLastEntry()
        Map.Entry<String, Integer> polledLast = map.pollLastEntry();
        System.out.println("   pollLastEntry(): " + polledLast + ", Map: " + map);
        
        // Add back removed entries
        map.put("Apple", 10);
        map.put("Date", 40);
        
        //======================================================================
        // 7. BULK OPERATIONS
        //======================================================================
        System.out.println("\n7. BULK OPERATIONS:");
        
        // public void putAll(Map<? extends K, ? extends V> map)
        Map<String, Integer> additional = new HashMap<>();
        additional.put("Fig", 50);
        additional.put("Grapes", 60);
        map.putAll(additional);
        System.out.println("   putAll(): " + map);
        
        //======================================================================
        // 8. DEFAULT METHODS (Java 8+)
        //======================================================================
        System.out.println("\n8. DEFAULT METHODS:");
        
        // public V putIfAbsent(K key, V value)
        Integer absentValue = map.putIfAbsent("Apple", 100); // Already exists
        Integer newValue = map.putIfAbsent("Honeydew", 70); // New key
        System.out.println("   putIfAbsent('Apple', 100): " + absentValue);
        System.out.println("   putIfAbsent('Honeydew', 70): " + newValue + ", Map: " + map);
        
        // public boolean replace(K key, V oldValue, V newValue)
        boolean replaced = map.replace("Apple", 10, 15);
        System.out.println("   replace('Apple', 10, 15): " + replaced + ", Map: " + map);
        
        // public V replace(K key, V value)
        Integer replacedValue = map.replace("Banana", 25);
        System.out.println("   replace('Banana', 25): " + replacedValue + ", Map: " + map);
        
        //======================================================================
        // 9. COMPUTE METHODS (Java 8+)
        //======================================================================
        System.out.println("\n9. COMPUTE METHODS:");
        
        // public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
        Integer computedAbsent = map.computeIfAbsent("Papaya", k -> 80);
        System.out.println("   computeIfAbsent('Papaya', k -> 80): " + computedAbsent + ", Map: " + map);
        
        // public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        Integer computedPresent = map.computeIfPresent("Banana", (k, v) -> v + 10);
        System.out.println("   computeIfPresent('Banana', (k, v) -> v + 10): " + computedPresent + ", Map: " + map);
        
        // public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        Integer computed = map.compute("Cherry", (k, v) -> v != null ? v + 5 : 0);
        System.out.println("   compute('Cherry', (k, v) -> v + 5): " + computed + ", Map: " + map);
        
        // public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
        Integer merged = map.merge("Mango", 35, (oldVal, newVal) -> oldVal + newVal);
        System.out.println("   merge('Mango', 35, (old, new) -> old + new): " + merged + ", Map: " + map);
        
        //======================================================================
        // 10. REMOVAL OPERATIONS
        //======================================================================
        System.out.println("\n10. REMOVAL OPERATIONS:");
        
        // public V remove(Object key)
        Integer removed = map.remove("Fig");
        System.out.println("   remove('Fig'): " + removed + ", Map: " + map);
        
        // public void clear()
        TreeMap<String, Integer> tempMap = new TreeMap<>(map);
        tempMap.clear();
        System.out.println("   clear(): " + tempMap);
        
        //======================================================================
        // 11. VIEW METHODS
        //======================================================================
        System.out.println("\n11. VIEW METHODS:");
        
        // public Set<K> keySet()
        Set<String> keys = map.keySet();
        System.out.println("   keySet(): " + keys);
        
        // public NavigableSet<K> navigableKeySet()
        NavigableSet<String> navigableKeys = map.navigableKeySet();
        System.out.println("   navigableKeySet(): " + navigableKeys);
        
        // public NavigableSet<K> descendingKeySet()
        NavigableSet<String> descendingKeys = map.descendingKeySet();
        System.out.println("   descendingKeySet(): " + descendingKeys);
        
        // public Collection<V> values()
        Collection<Integer> values = map.values();
        System.out.println("   values(): " + values);
        
        // public Set<Map.Entry<K, V>> entrySet()
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("   entrySet(): " + entries);
        
        // public NavigableMap<K, V> descendingMap()
        NavigableMap<String, Integer> descendingMap = map.descendingMap();
        System.out.println("   descendingMap(): " + descendingMap);
        
        //======================================================================
        // 12. RANGE VIEW METHODS
        //======================================================================
        System.out.println("\n12. RANGE VIEW METHODS:");
        
        // public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)
        NavigableMap<String, Integer> subMap = map.subMap("Banana", true, "Date", true);
        System.out.println("   subMap(Banana, true, Date, true): " + subMap);
        
        // public NavigableMap<K, V> headMap(K toKey, boolean inclusive)
        NavigableMap<String, Integer> headMap = map.headMap("Cherry", true);
        System.out.println("   headMap(Cherry, true): " + headMap);
        
        // public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive)
        NavigableMap<String, Integer> tailMap = map.tailMap("Cherry", true);
        System.out.println("   tailMap(Cherry, true): " + tailMap);
        
        // public SortedMap<K, V> subMap(K fromKey, K toKey)
        SortedMap<String, Integer> sortedSubMap = map.subMap("Apple", "Date");
        System.out.println("   subMap(Apple, Date): " + sortedSubMap);
        
        // public SortedMap<K, V> headMap(K toKey)
        SortedMap<String, Integer> sortedHeadMap = map.headMap("Cherry");
        System.out.println("   headMap(Cherry): " + sortedHeadMap);
        
        // public SortedMap<K, V> tailMap(K fromKey)
        SortedMap<String, Integer> sortedTailMap = map.tailMap("Cherry");
        System.out.println("   tailMap(Cherry): " + sortedTailMap);
        
        //======================================================================
        // 13. ITERATION METHODS
        //======================================================================
        System.out.println("\n13. ITERATION METHODS:");
        
        // public void forEach(BiConsumer<? super K, ? super V> action)
        System.out.println("   forEach():");
        map.forEach((k, v) -> System.out.println("     " + k + " = " + v));
        
        // public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
        map.replaceAll((k, v) -> v * 2);
        System.out.println("   replaceAll((k, v) -> v * 2): " + map);
        
        //======================================================================
        // 14. CLONING METHOD
        //======================================================================
        System.out.println("\n14. CLONING METHOD:");
        
        // public Object clone()
        @SuppressWarnings("unchecked")
        TreeMap<String, Integer> cloned = (TreeMap<String, Integer>) map.clone();
        System.out.println("   clone(): " + cloned);
        System.out.println("   Original equals cloned: " + map.equals(cloned));
        
        //======================================================================
        // 15. PACKAGE-PRIVATE AND INTERNAL METHODS
        //======================================================================
        System.out.println("\n15. PACKAGE-PRIVATE AND INTERNAL METHODS:");
        
        System.out.println("   getEntry(), getEntryUsingComparator() - Internal entry retrieval");
        System.out.println("   getCeilingEntry(), getFloorEntry(), getHigherEntry(), getLowerEntry() - Internal navigation");
        System.out.println("   keyIterator(), descendingKeyIterator() - Internal iterators");
        System.out.println("   compare(), valEquals() - Internal comparison methods");
        System.out.println("   exportEntry(), keyOrNull(), key() - Internal entry utilities");
        System.out.println("   getFirstEntry(), getLastEntry() - Internal entry access");
        System.out.println("   successor(), predecessor() - Internal tree navigation");
        System.out.println("   readTreeSet(), addAllForTreeSet() - Internal TreeSet support");
        System.out.println("   keySpliterator(), descendingKeySpliterator(), keySpliteratorFor() - Internal spliterators");
        
        System.out.println("\n=== ALL TREEMAP METHODS DEMONSTRATED SUCCESSFULLY ===");
        
        //======================================================================
        // 16. ADDITIONAL DEMONSTRATIONS
        //======================================================================
        System.out.println("\n16. ADDITIONAL DEMONSTRATIONS:");
        
        // Custom comparator example
        TreeMap<String, Integer> customOrder = new TreeMap<>(Comparator.reverseOrder());
        customOrder.putAll(map);
        System.out.println("   TreeMap with reverse ordering: " + customOrder);
        
        // No null keys demonstration
        try {
            TreeMap<String, Integer> nullDemo = new TreeMap<>();
            nullDemo.put(null, 100); // TreeMap doesn't allow null keys
        } catch (NullPointerException e) {
            System.out.println("   TreeMap does not allow null keys: " + e.getClass().getSimpleName());
        }
        
        // Null values are allowed
        TreeMap<String, Integer> nullValueDemo = new TreeMap<>();
        nullValueDemo.put("test", null);
        System.out.println("   TreeMap allows null values: " + nullValueDemo);
    }
}