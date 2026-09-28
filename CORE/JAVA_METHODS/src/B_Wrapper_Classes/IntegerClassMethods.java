package B_Wrapper_Classes;


public class IntegerClassMethods {
	/**
	 *     IntegerClassMethods
	 *     java.lang.Integer
	 */
public static void main(String[] args) {
	
	
   // parseInt()
	int number = Integer.parseInt("123");           // 123
	System.out.println(number);
	
	// toString()
	String numStr =Integer.toString(456);         // 456
	System.out.println(numStr);     
	
	// toBinaryString()
	String s1 = Integer.toBinaryString(28);         // 11100
	System.out.println(s1);
	
	// toOctalString()
	String s2 = Integer.toOctalString(28);          // 34
	System.out.println(s2);		
	
	// toHexString()
	String s3 = Integer.toHexString(28);            // 1c
	System.out.println(s3);
	
	// compare()
	System.out.println(Integer.compare(5, 10));  // -1    // return (x < y) ? -1 : ((x == y) ? 0 : 1);
	
	// max()
	System.out.println(Integer.max(7, 3));          // 7
	
	// min()
	System.out.println(Integer.min(7, 3));          // 3
	
	// sum()
	System.out.println(Integer.sum(4, 5));          // 9
	
	// bitCount()
	System.out.println(Integer.bitCount(20));       // 2
	
	// reverse()
	System.out.println(Integer.reverse(1));         // -2147483648
	
	// rotateLeft()
	System.out.println(Integer.rotateLeft(1, 1));   // 2
	
	// equals()
	Integer a =10 , b = 10;
	System.out.println(a.equals(b));             // true
	
	// compareTo()
	System.out.println(a.compareTo(b));          // 0
	
	// divideUnsigned()
	System.out.println(Integer.divideUnsigned(-1, 2));   //  2147483647
	
	// reminderUnsigned()
	System.out.println(Integer.remainderUnsigned(-1, 3));   //   0
	
	
	// Converting Integer to Other Types
	Integer num = 100;
	System.out.println(num.byteValue());   // byte 100
	System.out.println(num.shortValue());  // short 100
	System.out.println(num.intValue());    // int 100
	System.out.println(num.longValue());   // long 100L
	System.out.println(num.floatValue());  // float 100.0f
	System.out.println(num.doubleValue()); // double 100.0d

	
	
	
}
}
