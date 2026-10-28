package oct2026;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamMethod {

	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<>();
		 al.add(83);
		 al.add(45);
	     al.add(72);
	     al.add(43);
	     al.add(84);
	     
	     // filter
	     Stream<Integer> filter = al.stream().filter(a->a%2==0);
	     filter.forEach(a->System.out.println(a));
	     System.out.println();
	     
	     // map
	     Stream<Integer> map = al.stream().map(a->a+5);
	     map.forEach(a->System.out.println(a));
	     
	     // count
	     long count = al.stream().count();
	     System.out.println(count);
	     
	     // sorted
	     al.stream().sorted().forEach(a->System.out.println(a));
	     
	     
	     
	     
	}
}
