package S_Exception_Handling;
//Checked Exception

class NegativeNumberException extends Exception{
	
}
public class Cheked_Exception {
	void cube(int a)throws NegativeNumberException{
		if(a>0) {
			System.out.println(a*a*a);
		}else {
			throw new NegativeNumberException();
		}
	}
	public static void main(String[] args) {
		try {
		int x=Integer.parseInt("1");
		Cheked_Exception ce=new Cheked_Exception();
		ce.cube(x);
		}catch(NegativeNumberException ne) {
			System.err.println(ne);
		}
	}
}
