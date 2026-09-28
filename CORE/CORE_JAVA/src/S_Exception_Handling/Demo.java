package S_Exception_Handling;

public class Demo {
	public static void main(String args[]) {
		try {
			int x=Integer.parseInt("10");
			int y=Integer.parseInt("2");
			System.out.println(x/y);
		}catch(ArrayIndexOutOfBoundsException aoe) {
			System.err.println("Please pass two arguments");
		}
		catch(NumberFormatException ne) {
			System.err.println("Pass two numbers only:");
		}
		catch (ArithmeticException ae) {
			System.err.println("please pass second argument except zero:");
		}
		 
	}
}
