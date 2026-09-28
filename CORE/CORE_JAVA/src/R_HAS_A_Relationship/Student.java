package R_HAS_A_Relationship;

public class Student {

	
	private int studentId;
	private String studentName;
	private Collage collage;
	private Address address;
	
	public Student(int studentId, String studentName, Collage collage) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collage = collage;
	}
	
	public void showStudentData() {
		System.out.println("Student id is "+ studentId);
		System.out.println("Student Name is "+ studentName);
		System.out.println("Student collage Name is "+ collage.getCollagName());
		System.out.println("Student collage location "+ collage.getCollageLocation());
	}
	
	
}
