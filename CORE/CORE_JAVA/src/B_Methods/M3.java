package B_Methods;
//3] Method without argument and with return value.


public class M3 {
	
    int[] get() {
	int[] a= {1,2,3,4,5};
    return a;
    }
public static void main(String[] args) {
	int[] x=new M3().get();
	for(int i=0;i<x.length;i++){
		System.out.println(x[i]);
	}
	System.out.println("= = = = = = = = = = = =");
	
	M3 m = new M3();
	int[] y=m.get();
	for(int a : y) {
		System.out.println(a);
	}
}
}
