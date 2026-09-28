package practice;

import java.lang.foreign.UnionLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Pr {

	public static void main(String[] args) {
	
		HashMap<String, Integer> conmap = new HashMap<String, Integer>();
		conmap.put("Google", 10000);
		conmap.put("Walmart", 20000);
		conmap.put("Amazon", 30000);
		conmap.put("Facebook", 50000);
		conmap.put("Cisco", 15000);
		
	 Iterator<Entry<String, Integer>> it = conmap.entrySet().iterator();
	 
	 while(it.hasNext()) {
		 Entry<String, Integer> next = it.next();
		 System.out.println(next.getKey() +"  "+ next.getValue());
	 }
  }
}