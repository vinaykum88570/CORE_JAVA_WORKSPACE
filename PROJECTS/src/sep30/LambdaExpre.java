package sep30;


interface Test{
//	int add(int a, int b);
//	int cube(int a);
//	void add(int a,int b);
//	void cube(int a);
//	int get();
//	float getvalue();
//	void show();
//  int max(int a,int b);
	String upper(String s);
	
	
}
public class LambdaExpre {

	public static void main(String[] args) {
		
		//int add(int a, int b)
//		Test t =(a,b)->a+b;
//		System.out.println(t.add(10, 10));
		
//		Test t1=(a)->a*a*a;
//		System.out.println(t1.cube(5));
		
//		Test t=(a,b)->System.out.println(a+b);
//		t.add(5,5);
		
//		Test t=(a)->System.out.println(a*a*a);
//		t.cube(5);
		
//		Test t =()->10+10;
//		System.out.println(t.get());
		
//		Test t = ()->10;
//		System.out.println(t.getvalue());
		
//		Test t =()->System.out.println("Hello");
//		t.show();
		
//		Test t =(a,b)->(a>b)? a:b;
//		System.out.println(t.max(5, 10));
		
		Test t = (a)->a.toUpperCase();
		System.out.println(t.upper("vinay"));
		
	}
}
