package Pr1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;



// Implementing Chacked Exception  
public class Democon  {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,2,3,1,3,4,5,6,4,7,8,9,8,7,8,9));
		
		List<Integer> collect = numberList.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
	}
	
}



