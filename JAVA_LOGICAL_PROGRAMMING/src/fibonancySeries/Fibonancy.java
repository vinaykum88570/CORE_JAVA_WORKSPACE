package fibonancySeries;

import java.util.ArrayList;

public class Fibonancy {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); 
		for(int i =1;i<=20;i++) {
			list.add(i);
		}
		
		for (Integer i : list) {
			if(i%2==0) {
				System.out.println(i);
			}else {
//				System.out.println(i);
			}
			
			
		}
		
		
	}
}