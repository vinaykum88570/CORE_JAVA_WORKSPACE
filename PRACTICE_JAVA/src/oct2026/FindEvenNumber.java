package oct2026;

import java.util.ArrayList;

public class FindEvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				System.out.println(list.get(i));
			}
		}
	}
}
