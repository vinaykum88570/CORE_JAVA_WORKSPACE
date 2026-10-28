package A_String_Handling;

public class StringClassMethods {
	/**
	 * @param args  Java String Class Methods
	 *              java.lang.String
	 */
public static void main(String[] args) {
	
	
	// length()
    String name = "HARRY";
    System.out.println(name.length()); // 5
    
    // hashCode
    System.out.println(name.hashCode()); // 68511360
  
    // toString()
    System.out.println(name.toString()); // HARRY
   
    // isEmpty()
    System.out.println(name.isEmpty()); //false
  
    //toLowerCase()
    System.out.println(name.toLowerCase()); // harry
  
    // toUpperCase()
    System.out.println(name.toUpperCase()); //HARRY
   
    // nonTrimmed()
    String nonTrimmedString ="     Harry      ";
    System.out.println(nonTrimmedString); //_______Harry_______  
   
    // trim()
    String str = "    Hello    ";
    System.out.println(str.trim()); // Hello
   
    // substring()
    System.out.println(name.substring(2));    // RRY
    System.out.println(name.substring(2,4));  // RR
   
    // replace() 
    System.out.println(name.replace('R','P' )); // HAPPY
   
    // startWith()
    System.out.println(name.startsWith("HAR")); // true
   
    // endsWith()
    System.out.println(name.endsWith("DD")); // false
  
    // charAt()
    System.out.println(name.charAt(4)); // Y
  
    // indexOf()
    System.out.println(name.indexOf("Y")); // 4
  
    // subSequence()
    System.out.println(name.subSequence(0, 2)); // HAR
   
    // lastIndexOf()
    String modifiedname = "Harrrrry";
    System.out.println(modifiedname.lastIndexOf("rry",3));
  
    // equals
    System.out.println(name.equals("HARRY")); // true
   
    // equalsIgnoreCase
    System.out.println(name.equalsIgnoreCase("harry")); // true
  
    // codePointAt()
	System.out.println(name.codePointAt(4)); // 89
	
	// codePointBefore()
	System.out.println(name.codePointBefore(4)); // 82
	
	// contains()
	System.out.println(name.contains("HA")); // true
	
	// containEquals()
	System.out.println(name.contentEquals("HARRy")); // false
	
//=============================================================================================================
   
	// compareTo
 	String s1="Hello";
 	String s2="Hello";
 	System.out.println(s1.compareTo(s2)); // 0 
	
 	// getBytes()
	byte [] b =name.getBytes();  // H
	System.out.println(b[0]); 
	
	// toCharArray()
	char [] mych = name.toCharArray();  // H
	System.out.println(mych[0]); 
	
	// getChar()
	char [] ch = {'1','2','3','4','5','6','7','8','9'};  // 123456789
	System.out.println(ch);                              // 123Hello9
	String stri ="Hello , World";
	stri.getChars(0, 5, ch, 3);
	System.out.println(ch);

	// compareTo()
	String s = "Object";
	String t = "object";
	System.out.println(s.compareTo(t)); // -32 negative
	
	// compareIgnoreCase()
	System.out.println(s.compareToIgnoreCase(t)); // 0
	
	// concat()
	System.out.println(s.concat(t));  // Objectobject
   
	// valuOf()
	char [] cha = {'H','E','L','L','O'};  // HELLO
    String sc = "";
    sc=sc.valueOf(cha, 0, 5);
	System.out.println(sc);
	
	// format()
	String string = "Copies %s characters %d from this string.";  // Copies String characters 101 from this string.
	System.out.println(string.format(string, "String",101));     
	
	// replaceAll()
	String world ="(?i)t";
	System.out.println(string.replaceAll(world, "D")); //  Copies %s characDers %d from Dhis sDring.
	
	// spilt()
	String regex2 =" ";                  // Copies     // from
	String [] st = string.split(regex2); // %s         // this
	for(String sr : st)                  // characters // string.
	System.out.println(sr);              //%d
	
	// replaceFirst()
	String mystr ="This is My School";  //  That is My School
	String regex1 ="That";
	System.out.println(mystr.replaceFirst(regex1, "This"));
	
	// lastIndexOf()
	System.out.println(string.lastIndexOf("this")); // 29
	
	// join()
	String v1 =String.join("Mango" , "Orange","Apple"); // OrangeMangoApple
	System.out.println(v1);
	
	// matches()
	String regex ="cat|dog|fish";
	System.out.println("cat".matches(regex)); // true

}
}

