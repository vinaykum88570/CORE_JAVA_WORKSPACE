package B_Methods;

public class M11 {
	
	int addElement(int[]a) {
		int total = 0;
		for(int c : a) {
			total=total + c;
		}
		return total;
	}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	//using object 
	int x=new M11().addElement(arr);
	System.out.println(x);
	
	//using object reference
    M11 m = new M11();
    System.out.println(m.addElement(arr));
	
}
}
