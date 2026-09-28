package Pr1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamAPIExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(11);
		al.add(40);
        al.add(20);
		al.add(89);
		al.add(33);
	    al.add(50);
		
	   Stream<Integer> s1 = al.stream();
	   
	   	    
	}
}
