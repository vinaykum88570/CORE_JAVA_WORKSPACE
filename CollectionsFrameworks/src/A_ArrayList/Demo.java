package A_ArrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
     public static  void main(String[] args) {
	
    	
    	ArrayList<String> studentList = new ArrayList<String>();
 		studentList.add("A");
 		studentList.add("B");
 		studentList.add("C");
 		studentList.add("D");
 		studentList.add("E");
 		studentList.add("F");
 		System.out.println(studentList.size());
 		
 		System.out.println("Using for loop");
		
 	    Iterator<String> it = studentList.iterator();
 	    while(it.hasNext()) {
 	    	System.out.println(it.next());
 	    }
 		
   }
}
