package A_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
	
	public static void main(String[] args) {
		
		// 1. LinkedHashSet
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,2,3,1,3,4,5,6,4,7,8,9,8,7,8,9));
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numberList);
		
		ArrayList<Integer> numberListWithoutDuplicate = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(numberListWithoutDuplicate);
		
	
		// 2. Stream
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,1,3,4,5,6,4,7,8,9,8,7,8,9));
		
		List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(marksListUnique);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
