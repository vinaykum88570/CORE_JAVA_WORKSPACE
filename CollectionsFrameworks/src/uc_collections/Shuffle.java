package uc_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 70, 50));
		
		// Randomly changes the order of elements.
		Collections.shuffle(list);
		
		System.out.println(list);
	}

}
