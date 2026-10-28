package in;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Serial {
	
	public static void main(String[] args) {
		
      
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,2,3,1,3,4,5,6,4,7,8,9,8,7,8,9));
		
		 HashSet dup = new HashSet<Integer>(numberList);
		 
		 List duplicate = new ArrayList<Integer>(dup);
		 
//		 duplicate.forEach();
	   
		
	}
}
