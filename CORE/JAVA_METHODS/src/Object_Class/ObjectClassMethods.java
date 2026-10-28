package Object_Class;

class Employee implements Cloneable{
	
	int roll_no = 100;
	
}
public class ObjectClassMethods {
	    public static void main(String[] args) {
	    	
	        System.out.println("=== JAVA.OBJECT CLASS ALL METHODS WITH EXAMPLES ===\n");
	        
	        Employee e = new Employee();
	        
	        // toString()
	        System.out.println("toString:==> "+e.toString());
	        
	        
	        // hashCode()
	        System.out.println("hashCode():==> "+e.hashCode());
	        
	        
	        // getClass()
	        String s = new String("Hello");
	        
	        Class c = s.getClass();
	        System.out.println("getClass():==> "+c.getName());
	        
	        
	        // equals()
	        String s1 = " Hello";
	        String s2 = " HELLO";
	       
	        System.out.println("equals():==> "+s1.equals(s2));
	        System.out.println("equalsIgnoreCase():==> "+s1.equalsIgnoreCase(s2));
	        
	     
	        // Finalize()
	        e = null ;
	        System.out.print("Finalize():==>");
	        System.gc();
	    }
	    
	    @Override
        protected void finalize() {
        	System.out.println("finalize methods called");
        }
	        
	        
//	        //======================================================================
//	        // OBJECT CREATION AND BASIC METHODS
//	        //======================================================================
//	        System.out.println("1. OBJECT CREATION AND BASIC METHODS ========");
//	        
//	        // Create objects for demonstration
//	        Person person1 = new Person("John", 25);
//	        Person person2 = new Person("John", 25);
//	        Person person3 = new Person("Alice", 30);
//	        
//	        // public final native Class<?> getClass()
//	        Class<?> personClass = person1.getClass();
//	        System.out.println("getClass(): " + personClass.getName());
//	        
//	        // public native int hashCode()
//	        int hashCode1 = person1.hashCode();
//	        int hashCode2 = person2.hashCode();
//	        System.out.println("hashCode() - person1: " + hashCode1);
//	        System.out.println("hashCode() - person2: " + hashCode2);
//	        
//	        // public boolean equals(Object obj)
//	        boolean equals1 = person1.equals(person2);
//	        boolean equals2 = person1.equals(person3);
//	        System.out.println("equals() - person1 vs person2: " + equals1);
//	        System.out.println("equals() - person1 vs person3: " + equals2);
//	        System.out.println("== operator - person1 vs person2: " + (person1 == person2));
//	        
//	        // public String toString()
//	        String toString = person1.toString();
//	        System.out.println("toString(): " + toString);
//	        
//	        //======================================================================
//	        // CLONING METHODS
//	        //======================================================================
//	        System.out.println("\n2. CLONING METHODS ========");
//	        
//	        // protected native Object clone() throws CloneNotSupportedException
//	        try {
//	            Person original = new Person("CloneExample", 40);
//	            Person cloned = (Person) original.clone();
//	            System.out.println("clone() - Original: " + original);
//	            System.out.println("clone() - Cloned: " + cloned);
//	            System.out.println("Are they equal? " + original.equals(cloned));
//	        } catch (CloneNotSupportedException e) {
//	            System.out.println("Clone not supported: " + e.getMessage());
//	        }
//	        
//	        //======================================================================
//	        // THREAD METHODS
//	        //======================================================================
//	        System.out.println("\n3. THREAD METHODS ========");
//	        
//	        // Create an object for thread synchronization
//	        final Object lock = new Object();
//	        
//	        // public final native void notify()
//	        // public final native void notifyAll()
//	        // public final void wait() throws InterruptedException
//	        // public final void wait(long timeout) throws InterruptedException
//	        // public final void wait(long timeout, int nanos) throws InterruptedException
//	        
//	        Thread waiterThread = new Thread(() -> {
//	            synchronized (lock) {
//	                try {
//	                    System.out.println("Thread is waiting for notification...");
//	                    lock.wait(2000); // Wait for 2 seconds or until notified
//	                    System.out.println("Thread received notification or timeout");
//	                } catch (InterruptedException e) {
//	                    e.printStackTrace();
//	                }
//	            }
//	        });
//	        
//	        Thread notifierThread = new Thread(() -> {
//	            synchronized (lock) {
//	                System.out.println("Thread is notifying...");
//	                lock.notify();
//	            }
//	        });
//	        
//	        waiterThread.start();
//	        Thread.sleep(500); // Give waiter time to acquire lock
//	        notifierThread.start();
//	        
//	        waiterThread.join();
//	        notifierThread.join();
//	        
//	        //======================================================================
//	        // FINALIZE METHOD (Deprecated but shown for completeness)
//	        //======================================================================
//	        System.out.println("\n4. FINALIZE METHOD ========");
//	        
//	        // protected void finalize() throws Throwable
//	        System.out.println("finalize() - This method is called by garbage collector");
//	        System.out.println("Note: finalize() is deprecated since Java 9");
//	        
//	        // Create an object and make it eligible for garbage collection
//	        Person tempPerson = new Person("Temp", 99);
//	        tempPerson = null; // Make eligible for GC
//	        System.gc(); // Suggest JVM to run garbage collection
//	        Thread.sleep(100); // Give GC some time
//	        
//	        //======================================================================
//	        // ADDITIONAL OBJECT CLASS FEATURES
//	        //======================================================================
//	        System.out.println("\n5. ADDITIONAL FEATURES ========");
//	        
//	        // Demonstrate inheritance from Object class
//	        Object obj1 = new Person("Bob", 35);
//	        Object obj2 = "Hello World";
//	        Object obj3 = new Integer(42);
//	        
//	        System.out.println("Object references can hold any type:");
//	        System.out.println("obj1: " + obj1.getClass().getName());
//	        System.out.println("obj2: " + obj2.getClass().getName());
//	        System.out.println("obj3: " + obj3.getClass().getName());
//	        
//	        // Demonstrate getClass() method
//	        System.out.println("\nClass information:");
//	        System.out.println("person1 class: " + person1.getClass());
//	        System.out.println("person1 superclass: " + person1.getClass().getSuperclass());
//	        
//	        System.out.println("\n=== ALL OBJECT CLASS METHODS DEMONSTRATED ===");
//	    }
//	}
//
//	// Person class implementing Cloneable for clone() demonstration
//	class Person implements Cloneable {
//	    private String name;
//	    private int age;
//	    
//	    public Person(String name, int age) {
//	        this.name = name;
//	        this.age = age;
//	    }
//	    
//	    // Override toString() for meaningful representation
//	    @Override
//	    public String toString() {
//	        return "Person{name='" + name + "', age=" + age + "}";
//	    }
//	    
//	    // Override equals() for content-based comparison
//	    @Override
//	    public boolean equals(Object obj) {
//	        if (this == obj) return true;
//	        if (obj == null || getClass() != obj.getClass()) return false;
//	        Person person = (Person) obj;
//	        return age == person.age && Objects.equals(name, person.name);
//	    }
//	    
//	    // Override hashCode() to be consistent with equals()
//	    @Override
//	    public int hashCode() {
//	        return Objects.hash(name, age);
//	    }
//	    
//	    // Override clone() method
//	    @Override
//	    protected Object clone() throws CloneNotSupportedException {
//	        return super.clone(); // Shallow copy
//	    }
//	    
//	    // Override finalize() method (for demonstration only)
//	    @Override
//	    protected void finalize() throws Throwable {
//	        System.out.println("Finalize method called for: " + this);
//	        super.finalize();
//	    }
	}


