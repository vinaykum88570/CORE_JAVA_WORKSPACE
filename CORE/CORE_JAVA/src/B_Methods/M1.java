package B_Methods;

//1]Method with argument  and with rerurn value

//Instance method to access two type object and object refernces.

public class M1 {
	int add(int a,int b){
		int c=a+b;
		return c;
	}
public static void main(String[] args) {

	// using object 
	int x=new M1().add(5, 5);
	System.out.println(x);
	
	//using reference object
	M1 m = new M1();
	System.out.println(m.add(4, 4));
}
}
