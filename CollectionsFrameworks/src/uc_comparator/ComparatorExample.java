package uc_comparator;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}
public class ComparatorExample {
	
	public static void main(String[] args) {
		
		 List<Student> students = new ArrayList<>();
		    students.add(new Student("Rahul", 22, 70));
	        students.add(new Student("Amit", 20, 90));
	        students.add(new Student("Priya", 21, 80));
		
	    // 1. Sort by marks (ascending order)
		students.sort((s1,s2)->	Integer.compare(s1.marks, s2.marks));
		
        System.out.println("Sort By Marks:");
        for(Student s:students) {
        	System.out.println(s.name+" "+s.age+" "+s.marks);
        }

        // 2. Sort by age (ascending order)
        students.sort((s1,s2)->s1.name.compareTo(s2.name));
        
        System.out.println("Sort By Name:");
        for(Student s:students) {
        	System.out.println(s.name+" "+s.age+" "+s.marks);
        }
        
	}
}
