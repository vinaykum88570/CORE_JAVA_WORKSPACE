package nov2026;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		   list.add("Java");
	       list.add("Spring");
	       list.add("SQL");
	       
	   
	       
	       list.addFirst("HTML");
	       list.addLast("Spring");
	       System.out.println(list);

	       System.out.println(list.removeLast());
	       System.out.println(list);
	       
	}

}
