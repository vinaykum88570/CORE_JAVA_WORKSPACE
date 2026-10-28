package A_Arrays;

public class RefType {
	void fun(int []a, float []b) {
	for(int c : a ) {
		System.out.println(c);
	}
	for(float d : b) {
		System.out.println(d);
	}
	}
	public static void main(String[] args) {
		new RefType().fun(new int[] {1,2,3} , new float[] {3.0f,2.0f,1.0f});
		
		RefType r =new RefType();
		//int[] x= {2,3,4};
		//float[] y= {2.0f,3.0f,4.0f};
		//r.fun(x,y);
		
	}
}
