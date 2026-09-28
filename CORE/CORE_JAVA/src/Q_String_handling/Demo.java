package Q_String_handling;


public class Demo  {
	public static void main(String[] args) {
		// To convert char array to a String.
		char [] ch = {'a','b','c','d'};
		String a = new String(ch);
		System.out.println(a);
		
		// To convert byte array to String.
		byte[] by = {101,100,99,98,97,};
		String b = new String(by);
		System.out.println(b);
		
		// To convert String into byte array
		String s = "Vinay";
		byte[] c =s.getBytes();
		for(byte d : c) {
			System.out.println(d);
		}
		
		// To convert String into char array
		String e="Welcome";
		char[] f = e.toCharArray();
		for(char g: f) {
			System.out.println(g);
		}
		
		// To count the number of character in String .
	/*  String h ="Kumdale";
		int count = h.length();
		System.out.println(count);
		
		int count = "Kumdale".length();
		System.out.println(count);
	*/	
		System.out.println("Kumdale".length());
		
		//To remove extra space begining and end.
		System.out.println("       Welcome to java programming             ");
		System.out.println("       Welcome to java programming                          ".trim());
	    }
	
	
	
}
