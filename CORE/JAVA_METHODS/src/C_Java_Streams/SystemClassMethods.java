package C_Java_Streams;


public class SystemClassMethods {
	/**
	 *            SystemClassMethods
	 *            java.lang.System
	 * 
	 */
public static void main(String[] args) {

	
	
	// currentTimeMillis()
	System.out.println("1] Current time in ms:==>"+ System.currentTimeMillis());    //  Current time in ms:==>1755580708640
	
	
	// nanoTime()
	long start = System.nanoTime();                                              // nanoTime ==>400ns
	long end =System.nanoTime();
	System.out.println("2] nanoTime ==>"+ (end - start)+ "ns");             
	
	
	// gc()
	System.gc();
	System.out.println("3] Garbage Collaecton: ===>");                        // 
		
	
	// getenv()
	System.out.println("JAVA_HOME :===> "+ System.getenv("Home:"));           //JAVA_HOME :===> null
	
	
	// getProperty()
	System.out.println("OS:"+ System.getProperty("os.name"));                  // OS:Windows 10
	System.out.println("Java Version :" + System.getProperty("java.version")); // Java Version :21.0.3
	
	
	// setProperty()
	System.setProperty("mykey", "myValue");
	System.out.println(System.getProperty("SetProperty :=====> "+"myKey"));       // null
	
	
	// arrayCopy()
	int [] source = {1,2,3,4,5};
	int [] dest = new int [5];
	System.arraycopy(source, 0, dest, 0, source.length);
	for(int i : dest) {
		System.out.print("ArrayCopy :======>");
		System.out.println(i + " ");
	}
	
	
	// exit()
    System.exit(3);
	System.out.println("4] Exit Programme ===>");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
