package Z_JAVA_8_Features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Stream API
//-----------------------------------------------------------------------------------------------

// 1] Filtering   public abstract stream<T> Filter(Predicate);
//   ArrayList<Integer> al = new ArrayList<>();
//	 al.add(83);
//	 al.add(45);
//   al.add(72);
//   al.add(43);
//   al.add(84);
//   Stream<Integer> s1 = al.stream();
//   Stream<Integer> s2 = s1.filter(a->a%2==0);
//   s2.forEach(a->System.out.println(a));


// 2] Mapping  public abstract stream <R> map(Function);
//	 ArrayList<Integer> al = new ArrayList<>();
//	 al.add(83);
//	 al.add(45);
//	 al.add(72);
//	 al.add(43);
//	 al.add(84);
//	 Stream<Integer> s1 = al.stream();
//	 Stream<Integer> s2 = s1.map(a->a+5);
//	 s2.forEach(a->System.out.println(a));


// 3] Count 
//	 ArrayList<Integer> al = new ArrayList<>();
//	 al.add(83);
//	 al.add(45);
//	 al.add(72);
//	 al.add(43);
//	 al.add(84);
//	 Stream<Integer> s1 = al.stream();
//	 long s2 = s1.count();
//	 System.out.println(s2);


// 4] Sorted
//   ArrayList<Integer> al = new ArrayList<>();
//   al.add(83);
//   al.add(45);
//   al.add(72);
//   al.add(43);
//   al.add(84);
//   Stream<Integer> s1 = al.stream();
//   Stream<Integer> s2 = s1.sorted();
//   s2.forEach(a->System.out.println(a));

// 5] Collect
//   List<String> l = Arrays.asList("Vinay","Kumdale","Vijay","Patil");
//   Stream<String> s1 = l.stream();
//   Stream<String> s2 = s1.map(String::toUpperCase);
//   List<String> s3 = s2.collect(Collectors.toList());
//   System.out.println(s3);

// 6] Reduce 
//   ArrayList<Integer> al = new ArrayList<>();
//   al.add(83);
//   al.add(45);
//   al.add(72);
//   al.add(43);
//   al.add(84);
//   Stream<Integer> s1 = al.stream();
//   Integer s2 = s1.reduce(0,(a,b)->a+b);
//   System.out.println(s2);

public class H_Stream_API {
	public static void main(String[] args) {
	  
		
		 
	}
}
