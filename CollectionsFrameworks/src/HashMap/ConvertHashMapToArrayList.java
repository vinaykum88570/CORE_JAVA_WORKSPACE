package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> conmap = new HashMap<String, Integer>();
		conmap.put("Google", 10000);
		conmap.put("Walmart", 20000);
		conmap.put("Amazon", 30000);
		conmap.put("Facebook", 50000);
		conmap.put("Cisco", 15000);
		
		System.out.println("company map size: "+conmap.size());
		
		Iterator it = conmap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry paires = (Map.Entry)it.next();
			System.out.println(paires.getKey() +" = "+paires.getValue() );
		}
		System.out.println("__________________________");	
		
		// using lambda 
		conmap.forEach((k,v)->System.out.println("key = "+ k +"values = "+v ));
		System.out.println("__________________________");	
		
		
		
	//1. convert hashmap keys into ArrayList
		List<String> comNameList = new ArrayList<String>(conmap.keySet());
		for(String t :comNameList) {
			System.out.println(t);
		}
		
		System.out.println("______________________");	
		
		
	//2. convert hashMap values into ArrayList
		List<Integer> valueList = new ArrayList<Integer>(conmap.values());
	    for(Integer i :valueList) {
	    	System.out.println(i);
	    }
		
	    
		
		
	    
	    
	    
		
		
		
		
		
		
		
	}

}
