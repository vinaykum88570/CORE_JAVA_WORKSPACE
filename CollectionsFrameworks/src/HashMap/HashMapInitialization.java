package HashMap;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization{
	
	public static Map<String, Integer> marksMap;
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}

	public static void main(String[] args) {
		//1. using HashMap class
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		
		//2. static way : static HashMap:
		System.out.println(HashMapInitialization.marksMap.get("A"));
		
		
		//3. ImmutableMap with only one single entry :
		Map<String, Integer> map3 = Collections.singletonMap("test",100);
		System.out.println(map3.get("test"));
//		map3.put("ABC", 200); // UnsupportedOperationException  -> can't change the value
		
		
		//4. multi values Map : max 10 pairs can be stored
		Map<String, String> multiMap = Map.of("k1","v1","k2","v2","k3","v3");
		System.out.println(multiMap.get("k3"));
		
		
		
		
		
		
		
		
		
		
	}

}
