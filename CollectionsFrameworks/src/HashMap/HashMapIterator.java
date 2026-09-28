package HashMap;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapIterator {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalmap = new HashMap<String,String>();
		capitalmap.put("India", "New Delhi");
		capitalmap.put("USA", "Washington DC");
		capitalmap.put("US", "London");
		capitalmap.put("UK", "London1");

		
		
		//  Iterator: over the keys: by using keySet()
		Iterator<String> it = capitalmap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalmap.get(key);
			System.out.println("Key=> "+key+"  |"+"  value=> "+value);
		}
	
		System.out.println("====================================================================");
		
	
		// Iterator: Over the set (using entrySet)
		Iterator<Entry<String, String>> iterator = capitalmap.entrySet().iterator();
	    while(iterator.hasNext()) {
			 Entry<String, String> entry = iterator.next();
			 System.out.println("Key = "+ entry.getKey() +"    and     Value = "+ entry.getValue());
		}
	
	    System.out.println("====================================================================");
	
	    // Iterator HashMap using java 8 for each and lambda:
	    capitalmap.forEach((k,v)->System.out.println("Key = "+ k +" value "+ v));
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	
	}

}
