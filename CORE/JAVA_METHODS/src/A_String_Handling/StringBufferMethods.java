package A_String_Handling;


public class StringBufferMethods {
	/**
	 *           StringBufferMethods  
	 *           java.lang.StringBuffer
	 */         
	
	public static void main(String[] args) {
		   
	     StringBuffer sb = new StringBuffer("Hello");
  
	     
	    // append()
	    System.out.println(sb.append(" "+"Java")); //  Hello Java

	    // insert()
	    System.out.println(sb.insert(1, "Java")); //  HJavaello Java

	    // replace()
	    System.out.println(sb.replace(1, 3, "Java")); //  HJavavaello Java

	    // delete()
	    System.out.println(sb.delete(0, 2)); //  avavaello Java 

	    // reverse()
	    System.out.println(sb.reverse()); //   avaJ olleavava

	    // Capacity()
	    System.out.println(sb.capacity()); //   21
	   
	    // length()
	    System.out.println(sb.length()); //  14
	    
	    // deleteCharAt()
	    System.out.println(sb.deleteCharAt(1)); //   Hllo
	   
	    // charAt()
	    System.out.println(sb.charAt(0)); // H
	    
	    // substring()
	    System.out.println(sb.substring(0)); //  Hello
	    
	    // setCharAt()
	    sb.setCharAt(1, 'p');
	    System.out.println(sb); //  Hpllo
 
	     
	   
	}
    

}
