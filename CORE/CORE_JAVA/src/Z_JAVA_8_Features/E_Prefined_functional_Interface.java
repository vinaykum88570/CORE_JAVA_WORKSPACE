package Z_JAVA_8_Features;

import java.util.function.Function;

// Predefined Functional Interface
//-------------------------------------------------------------------------------------------------

// 1] Function<T,R> ==> R apply(T,t);
//   Function <Integer,Integer> f = t->t*t*t;
//   Integer i = f.apply(5);
//   System.out.println(i);


// 2] Predicate<T> ==> boolean test(T,t);
//   Predicate<Integer> p = t->t%2==0; 
//   boolean i = p.test(11);
//   if(i==true)
//  	System.out.println("Even");
//   else
//  	System.out.println("Odd");


// 3] Consumer<T> ==> void accept(T,t); 
//   Consumer<String> c = t->System.out.println(t);
//   c.accept("Vinay");


// 4] Supplier<T> ==> T get(); 
//   Supplier<String> s = ()-> "Welcome";
//   String str = s.get();
//   System.out.println(str);

public class E_Prefined_functional_Interface {
	
    public static void main(String[] args) {


    	Function<Integer,Integer> function = (f)->f*f*f;
    	Integer apply = function.apply(5);
    	System.out.println(apply);
//    	
//      Function <Integer,Integer> f = t->t*t*t;
//      Integer i = f.apply(5);
    	
    		
}
}
