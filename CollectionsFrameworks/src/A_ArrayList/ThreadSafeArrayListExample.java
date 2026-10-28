package A_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayListExample {

	public static void main(String[] args) {
		
		// synchronizedList();
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
		synchronized (namesList) {
			
			Iterator<String> it = namesList.iterator();
			while(it.hasNext()){
				System.out.println("synchronizedList() -->"+it.next());
			}
		}
		
		// CopyOnWriteList --> class    
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Naveen");
		
		Iterator<String> iterator = empList.iterator();
		while(iterator.hasNext()) {
			System.out.println("CopyOnWriteList -->"+iterator.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
