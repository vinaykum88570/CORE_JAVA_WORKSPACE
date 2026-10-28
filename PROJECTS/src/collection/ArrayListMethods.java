package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("JavaScript");
		
		ArrayList<String > ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Dev Ops");
		
		// addAll();
		System.out.println("============ addAll() Methods ============");
		ar1.addAll(3, ar2);
		System.out.println(ar1);
		
		// clear();
		System.out.println("============ clear() Methods ============");
		ar1.clear();
		System.out.println(ar1);
		
		// clone();
		System.out.println("============ clone() Methods ============");
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		// contains();
		System.out.println("============ contains() Methods ============");
		boolean contains = ar1.contains("Java");
		System.out.println(contains);
		
		// indexOf()
		System.out.println("============ indexOf() Methods ============");
		int indexOf = ar1.indexOf("Ruby");
		System.out.println(indexOf);
		
		// lastIndexOf();
		System.out.println("============ lastIndexOf() Methods ============");
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Steve","Lisa"));
		System.out.println(list1);
		int lastIndexOf = list1.lastIndexOf("Lisa");
		System.out.println(lastIndexOf);
		
		// remove();
		System.out.println("============ remove() Methods ============");
		list1.remove(1);
		System.out.println(list1);
		
		// removeIf();
		System.out.println("============ removeIf() Methods ============");
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6 ,7,8,9,10));
		numbers.removeIf(num->num%2==0);
		System.out.println(numbers);
		
		// retainAll();
		System.out.println("============ retainAll() Methods ============");
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa", "Tom"));
        System.out.println(nameList);
		nameList.retainAll(Collections.singleton("Tom"));
		System.out.println(nameList);
		
		// subList()
		System.out.println("============ subList() Methods ============");
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(subList);
		
		// toArray()
		System.out.println("============ toArray() Methods ============");
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa", "Tom"));
		Object arr[] = newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o : arr) {
			System.out.println(o);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
