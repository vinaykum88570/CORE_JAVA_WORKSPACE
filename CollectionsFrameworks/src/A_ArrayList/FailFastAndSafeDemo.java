package A_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndSafeDemo {

	public static void main(String[] args) {
		
		// If we Write new ArrayList<>(); so Strucral Modification Not possible
		List <String> fruits = new CopyOnWriteArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		Iterator<String> iterator = fruits.iterator();
		
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			
			if(!fruits.contains("pineaple")) {
				fruits.add("pineaple");
			}
			System.out.println(fruit);
			
		}
		System.out.println(fruits);
	}
}
