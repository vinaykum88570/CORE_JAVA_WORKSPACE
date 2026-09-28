package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorExample {

	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String list1 = it.next();
			
			if(!list.contains("E")) {
				list.add("E");
			}
			
		}
		System.out.println(list);
	    
	}
}
