package nov2026;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredifinedFunctionalInterface {

	public static void main(String[] args) {
//		// Function  -> return value  apply()
		Function<Integer, Integer> f= t->t+t+t;
		System.out.println(f.apply(5));
		
//		// Predicate -> return boolean value  Test() 
		Predicate<Integer> p = t->t%2==0;
		System.out.println(p.test(8));
		
//		// Consumer  --> void accept()
		Consumer<String> c = t->System.out.println(t);
		c.accept("Hello");
		
//		// Supplier
		Supplier<String> s = ()->"Welcome";
		System.out.println(s.get());
		

	}

}
