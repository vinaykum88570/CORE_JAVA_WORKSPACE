package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SyncronizedHashMap {

	public static void main(String[] args) {
		
		// syncronizedMap method in collections class:
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "Naveen");
		map1.put("2", "Tom");
		map1.put("3", "Lisa");
		
		
		// create syncronizedMap:
		Map<String, String> synchronizedMap = Collections.synchronizedMap(map1);
		System.out.println(synchronizedMap);
		
		
		// concurrentHashmap: -> does'nt throw any concurrentModification Exception
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put("A", "Java");
		concurrentMap.put("B", "Python"); 
		concurrentMap.put("C", "Ruby");
		
		System.out.println(concurrentMap.get("A"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
