package A_String_Handling;

import java.util.StringTokenizer;

public class StringTokenizerMethods {

	/**
	 * @param args   StringTokenizerMethods
	 *               java.util.StringTokenizer
	 */
	public static void main(String[] args) {
		

		
	// countToken()                
	StringTokenizer st = new StringTokenizer("Hello World Java");     // 3
	System.out.println( st.countTokens());
		
	// hasMoreTokens()                 
	System.out.println(st.hasMoreTokens());                             // true
		
    // nextElement()                                
	System.out.println(st.nextElement());                            // Hello           
	
	// hasMoreElement()
	System.out.println("hasmoreElent===>"+st.hasMoreElements());    // true
		
	// nextTokent()
	System.out.println(st.nextToken());                             // World

    // nextTokens()
	String s = "Welcome to java Programming.";                    //  Welcome 
	StringTokenizer str = new StringTokenizer(s);                 //  to
	while(str.hasMoreTokens()) {                                  //  java
		System.out.println(str.nextToken());                      //  Programming
	}

		
		
		
		
	}

}
