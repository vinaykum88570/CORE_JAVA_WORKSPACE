package uc_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyMeth {

	public static void main(String[] args) {
		
		 List<Integer> list = new ArrayList<>();

	        list.add(40);
	        list.add(10);
	        list.add(30);
	        list.add(20);
	        list.add(10);
	        list.add(30);
	        list.add(10);
	        
	        int count = Collections.frequency(list, 10);
	        System.out.println(count);

	}

}
