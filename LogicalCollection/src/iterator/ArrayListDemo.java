package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {


	public static void main(String[] args) {
		
		System.out.println("ArrayList In Collection Frameworks");
		
		// Iterator ArrayList:
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("A");
		studentList.add("B");
		studentList.add("C");
		studentList.add("D");
		studentList.add("E");
		studentList.add("F");
	
//      1] for loop	
		System.out.println("Using for loop");
		for(int i=0;i<=studentList.size();i++) {
			System.out.println(studentList.get(i));
			if(i==5)
				break;
		}
		
//      2] for each loop
		System.out.println("========================");
		System.out.println("Using for each loop");
		for(String s:studentList) {
			System.out.println(s);
		}
		
//		3]Stream with lambda
		System.out.println("========================");
		System.out.println("Stream With Lambda");
		studentList.stream().forEach(ele->System.out.println(ele));
		
//		4] Iterator
		System.out.println("========================");
		System.out.println("Using Iterator");
		Iterator<String> it = studentList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
