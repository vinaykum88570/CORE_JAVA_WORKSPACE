package removeDuplicate;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		// Remove Duplicate from List 
		  ArrayList<Integer> list = new ArrayList<>();
		    list.add(10);
	        list.add(20);
	        list.add(10);
	        list.add(30);
	        list.add(20);
	        
	        HashSet<Integer> set = new HashSet<Integer>(list);
	        System.out.println(set);
	        
	}
}
