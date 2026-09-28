package Pr1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredifinedMethods {

	// Function - R apply(T,t)
	// Predicate - boolean test()
	// Consumer - void accept()
	// Supplier - T get()
	
	public static void main(String[] args) {
		
//		Function<Integer, Integer> f = (a)->a+a;
//		Integer apply = f.apply(2);
//		System.out.println(apply);
		
//		Predicate<Integer> p = n -> n % 2 == 0;
//		System.out.println(p.test(24));
        
//		Consumer<String> c = t ->System.out.println(t); 
//		c.accept("====== Hello ======");
		
//		Supplier<String> s = ()->"heeloo";
//		System.out.println(s.get());
		
//		Predicate<Integer> predicate = p-> p-10 == 8;         // 4 - 10 == 8 
//		boolean test = predicate.test(2);
//	    System.out.println(test);
		
//		Supplier<String> sup =()->"Hello";
//		String string = sup.get();
//		System.out.println(string);
		
		// Filtering  Predicate
		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);
//		list.add(10);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		Stream<Integer> sorted = list.stream().sorted();
//		sorted.forEach(a->System.out.println(a));
		
		
		 List<String> l = Arrays.asList("Vinay","Kumdale","Vijay","Patil");
		 Stream<String> s1 = l.stream().map(String::toUpperCase);
		 System.out.println(s1.collect(Collectors.toList()));

	   
		
	}

}
