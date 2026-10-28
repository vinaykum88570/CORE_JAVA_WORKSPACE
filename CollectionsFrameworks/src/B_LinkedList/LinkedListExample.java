package B_LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	
	LinkedList l = new LinkedList();
	
	l.add("Durga");
	
	l.add(30);
	
	l.add(null);
	
	l.add("Durga"); //  [Durga, 30, null, Durga] 
	
    l.set(0, "Software"); // [Software, 30, null, Durga]
    
	l.add(0, "Venky");  // [Venky, Software, 30, null, Durga]
	
	l.removeLast(); // [Venky, Software, 30, null]
	
	l.addFirst("CCC");  // [CCC, Venky, Software, 30, null] 
	System.out.println(l);

}
}
