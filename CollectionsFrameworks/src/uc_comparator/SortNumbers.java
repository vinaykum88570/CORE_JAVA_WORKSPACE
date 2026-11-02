package uc_comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		
		 List<Integer> list = new ArrayList<>(Arrays.asList(40, 10, 50, 20, 30));
		 
		 Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				
				return Integer.compare(a, b);
				
			}
		});
		 System.out.println(list);


	}

}
