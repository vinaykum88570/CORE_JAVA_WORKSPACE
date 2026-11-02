package nov2026;

interface Test2{
//	int add(int a, int b);
//	int cube(int a);
//	void add(int a, int b);
	void cube(int a);
}
public class LambdaExpression {

	public static void main(String[] args) {
		//1. int add(int a , int b)
//		Test2 t = (a,b)->a+b;
//		System.out.println(t.add(5, 5));
		
		//2. int cube(int a)
//		Test2 t = (a)->a*a*a;
//		System.out.println(t.cube(5));
		
		//3. void add(int a, int b)
//		Test2 t =(a,b)->System.out.println(a+b);
//		t.add(5, 5);
		
		//4. void cube
		Test2 t = (a)->System.out.println(a*a*a);
		t.cube(5);
		
		
	}

}
