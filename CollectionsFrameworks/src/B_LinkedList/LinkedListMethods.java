package B_LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Tom");
		names.add("Naveen");
		
		// Size();
		 System.out.println( "________" );
		System.out.println("Size() -->"+names.size()); // 2
		
		// get();
		 System.out.println( "____________" );
		System.out.println("get() -->"+names.get(1)); // Naveen
		
		// Iterator();
		 System.out.println( "__________" );           // Tom 
		Iterator<String> iterator = names.iterator();  // Naveen
		while(iterator.hasNext()) {
			System.out.println("Iterator() -->"+iterator.next());
		}
		
		// add();
		 System.out.println( "____________________________________" );
		names.add(2, "Vinay");
		System.out.println("add() -->"+names); //  [Tom, Naveen, Vinay]
		
		// addAll()
		 System.out.println( "____________________________________" );
		LinkedList<String> users = new LinkedList<String>();
		users.add("Peter");
		users.add("Trump");
		names.addAll(users);
		System.out.println("addAll() -->"+names);  // [Tom, Naveen, Vinay, Peter, Trump]
		
		// addFirst();
		 System.out.println( "____________________________________" );
		names.addFirst("Kamala");
		System.out.println("addFirst() -->"+names); // [Kamala, Tom, Naveen, Vinay, Peter, Trump]
		
		// addLast();
		 System.out.println( "____________________________________" );
		names.addLast("Shiva");
		System.out.println("addLast() -->"+names); //  [Kamala, Tom, Naveen, Vinay, Peter, Trump, Shiva]
		
		// remove();
		 System.out.println( "____________________________________" );
	    names.remove(2);
		System.out.println("remove() -->"+names); // [Kamala, Tom, Vinay, Peter, Trump, Shiva]
		
		// removeAll();
		 System.out.println( "____________________________________" );
		names.removeAll(users);
		System.out.println("removeAll() -->"+names); // [Kamala, Tom, Vinay, Shiva]
		
		// clear()
		 System.out.println( "____________________________________" );
		names.clear();
		System.out.println("clear()-->"+ names);
		
		
		
        LinkedList<String> lang = new LinkedList<>();
		
        lang.add("Java");
        lang.add("Python");
        lang.add("Ruby");
        lang.add("JavaScript");
		
		// reverse the LinkedList
		 System.out.println( "____________________________________" );
		Iterator<String> it = lang.descendingIterator();
		while (it.hasNext()) {
		    System.out.println( "reverse the LinkedList -->"+it.next()  );
		}
		
		System.out.println( "____________________________________" );
		
		for(String s : lang) {
			System.out.println("reverse the LinkedList -->"+s);
		}
		
		
		// sort();
		System.out.println( "____________________________________" );
		Collections.sort(lang);
		System.out.println("sort() -->"+lang); // [Java, JavaScript, Python, Ruby]
		
		
		
		
		
		
		
		
		
	}

}
