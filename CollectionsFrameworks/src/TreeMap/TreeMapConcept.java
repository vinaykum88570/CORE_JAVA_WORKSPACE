package TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1000,  "Tom");
		map.put(2000,  "Peter");
		map.put(3000,  "Steve");
		map.put(11000, "Naveen");
		map.put(1400,  "Robby");
		
		System.out.println(map);
		
		System.out.println("_____________________________________________________");
		// using lambda 
		System.out.println("Using Lambda");
		map.forEach((k,v)->System.out.println(" key = "+ k + " value = "+ v));
	    
		System.out.println("_______________________________");
		// firstkey() & lastkey() methods
		System.out.println("Firstkey() & Lastkey() Methods");
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println("____________________________");
		// print keys Less than 3000 : headMap(3000); methods
		System.out.println("HeadMap(); Methods");
		Set<Integer> keysLessThan3k = map.headMap(3000).keySet();
		System.out.println(keysLessThan3k);
		
		
		System.out.println("___________________________");
		// print keys Greter than 3000 : headMap(3000); methods
		System.out.println("HeadMap(3000); Methods");
		Set<Integer> keysGreterThan3k = map.tailMap(3000).keySet();
		System.out.println(keysGreterThan3k);
		
		
		
		
	}

}
