package R_HAS_A_Relationship;

public class Main {

	public static void main(String[] args) {
		Collage c1 = new Collage("MUMU", "Udgir");
		
		Student s1 = new Student(1, "Vinay", c1); //HAS A Relationship
		Student s2 = new Student(2, "Rahul", c1);
		
		s1.showStudentData();
		s2.showStudentData();
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
