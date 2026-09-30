package sep30;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterface {

	public static void main(String[] args) {
		// Function
		// Predicate
		// Consumer
		// Supplier
		
		Function<Integer, Integer> f = t->t*t*t;
		System.out.println(f.apply(5));
		
		Predicate<Integer> p = t->t%2==0;
		System.out.println(p.test(10));
		
		Consumer<String> c= t->System.out.println(t);
		c.accept("Hello");
		
		Supplier<String> s= ()->"welcome";
		System.out.println(s.get());
	}
}
