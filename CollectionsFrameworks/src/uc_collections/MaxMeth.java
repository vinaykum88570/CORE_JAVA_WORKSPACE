package uc_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMeth {

	public static void main(String[] args) {
		
		 List<Integer> list = new ArrayList<>();

	        list.add(40);
	        list.add(10);
	        list.add(30);
	        list.add(20);
	        
	        System.out.println(Collections.max(list));

	}

}
