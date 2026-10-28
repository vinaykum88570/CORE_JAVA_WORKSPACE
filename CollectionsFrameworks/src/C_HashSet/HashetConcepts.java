package C_HashSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashetConcepts {

	public static void main(String[] args) {
		
	  HashSet<String> hs = new HashSet<String>();
	  hs.add("Alpha");
	  hs.add("testing");
	  hs.add("Beta");
	  hs.add("Alpha");
	  hs.add(null);
	  
	  System.out.println(hs);
	  System.out.println(hs.contains("testing"));
	  System.out.println("__________________________________");
	  
	  // Iterating
	 for (String string : hs) {
		System.out.println(string);
	 }
	 System.out.println("__________________________________");
	 
	 // remove():
	 hs.remove("Beta");
	 System.out.println(hs);
	 System.out.println("__________________________________");
	 
	 Set<Integer> first = new HashSet<Integer>();
	 first.addAll(Arrays.asList(new Integer [] {1,2,3,4,5,8,9,10} ));
	 
	 Set<Integer> second = new HashSet<Integer>();
	 second.addAll(Arrays.asList(new Integer [] {1,2,3,5,8,0,9} ));
	 
	 // get the union:
	 Set<Integer> union = new HashSet<Integer>(first);
	 union.addAll(second);
	 System.out.println(union);
	 System.out.println("__________________________________");
	 
	 // get the Intesection : - Only maching number Display. 
	 HashSet<Integer> intesection = new HashSet<Integer>(first);
	 intesection.retainAll(second);
	 System.out.println("Intesection --> "+intesection);
	 System.out.println("__________________________________");
	 
	 // get the differances : - Only differance number Display
	 Set<Integer> diff = new HashSet<Integer>(first);
	 diff.removeAll(second);
	 System.out.println(diff);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	}
}
