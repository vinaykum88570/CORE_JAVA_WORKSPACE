package oct2026;

import java.util.ArrayList;
import java.util.Iterator;

public class FindSum {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(60);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
		
		// Find Some
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum=sum+list.get(i);
		}
		System.out.println(sum);
	}
}
