package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> myVector = new Vector<Integer>();
		myVector.add(2);
		myVector.add(4);
		myVector.add(6);
		myVector.add(8);
		myVector.add(10);
		myVector.add(12);
		myVector.add(14);
		myVector.add(16);
		
		System.out.println(myVector);         // [2, 4, 6, 8, 10, 12, 14, 16]
		
		System.out.println(myVector.get(2));      // 2
		
		myVector.remove(3); 
		System.out.println(myVector);        // [2, 4, 6, 10, 12, 14, 16]
	
	
		Vector<Integer> yourVector = new Vector<Integer>();
		yourVector.add(10);
		yourVector.add(11);
		
		myVector.addAll(yourVector);
		System.out.println(myVector);    // [2, 4, 6, 10, 12, 14, 16, 10, 11]
		
		
		// Using foreach
		for (Integer integer : myVector) {
			System.out.println(integer);
		}
		
		// Using for loop
		for(int p=0;p<myVector.size();p++) {
			System.out.println(myVector.get(p));
		}
		
		
		// Using Iterator
		Iterator<Integer> iterator = myVector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Collections.sort(myVector);
		System.out.println(myVector);     // [2, 4, 6, 10, 10, 11, 12, 14, 16]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
