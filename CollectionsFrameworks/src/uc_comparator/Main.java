package uc_comparator;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Integer a = 10;
		Integer b = 20;
		
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer a, Integer b) {
			
				return Integer.compare(a, b);
			}
		};

		System.out.println(c.compare(a, b));
	    //	Negative        First object comes before the second
		//  Zero            Both are equal for sorting
		//  Positive        First object comes after the second
		
		
	}

}
