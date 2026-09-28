package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

	public static void main(String[] args) {
		
	HashMap<Integer, String> map1 = new HashMap<Integer, String>();
	map1.put(1, "A");
	map1.put(2, "B");
	map1.put(3, "C");
	
	HashMap<Integer, String> map2 = new HashMap<Integer, String>();
	map2.put(3, "C");
	map2.put(1, "A");
	map2.put(2, "B");
	
	HashMap<Integer, String> map3 = new HashMap<Integer, String>();
	map3.put(1, "A");
	map3.put(2, "B");
	map3.put(3, "C");
	map3.put(3, "D");
	
	// 1. on the basis of key-value : use equals methods:
	System.out.println(map1.equals(map2));   // true
	System.out.println(map1.equals(map3));   // false
	
	
	// 2. compare hashmap for the same keys: keySets();
	System.out.println(map1.keySet().equals(map2.keySet())); // true
	System.out.println(map1.keySet().equals(map3.keySet())); // true
	
	// 3. Find out the extra keys:
	HashMap<Integer, String> map4 = new HashMap<Integer, String>();
	map4.put(1, "A");
	map4.put(2, "B");
	map4.put(3, "C");
	map4.put(4, "D");
	
	//  combine the keys from both the maps : using HashSet
	HashSet<Integer> combinekeys = new HashSet<Integer>(map1.keySet());
	combinekeys.addAll(map4.keySet());	
	combinekeys.removeAll(map1.keySet());
	System.out.println(combinekeys);     //    [4]
	
	// 4. compare maps by values
	HashMap<Integer, String> map5 = new HashMap<Integer, String>();
	map1.put(1, "A");
	map1.put(2, "B");
	map1.put(3, "C");
	
	HashMap<Integer, String> map6 = new HashMap<Integer, String>();
	map2.put(4, "A");
	map2.put(5, "B");
	map2.put(6, "C");
	
	HashMap<Integer, String> map7 = new HashMap<Integer, String>();
	map3.put(1, "A");
	map3.put(2, "B");
	map3.put(3, "C");
	map3.put(4, "C");
	
	
	// 1. Duplicates are not allowed: using ArrayList
	System.out.println(new ArrayList<>(map5.values()).equals(map6.values())); // false
	System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); // true
	
	// 2. Duplicates are not allowed: Using HashSet
	System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); // true 
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
