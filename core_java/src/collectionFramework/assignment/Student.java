package collectionFramework.assignment;

import java.util.*;

public class Student {
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Dinga", 98));
		studentList.add(new Student(2, "Dingi", 38));
		studentList.add(new Student(3, "Dingu", 86));
		studentList.add(new Student(4, "Dingo", 52));
		studentList.add(new Student(5, "Dinge", 35));
		
		System.out.println("\n-------- DISPLAY ALL STUDENTS --------\n");
		printAll(studentList);
		
		System.out.println("\n-------- PASSED STUDENTS LIST --------\n");
		List<Student> passedStudents = filterStudentsByMarks(studentList, 40);
		printAll(passedStudents);
		
		System.out.println("\n----------- TOPPER STUDENT -----------\n");
		Student topperStudent = filterTopperStudent(studentList);
		topperStudent.print();
		
		System.out.println("\n----------- SEARCH STUDENT -----------\n");
		List<Student> foundStudents = findStudentsByName(studentList, "Dingi");
		printAll(foundStudents);
		
		System.out.println("\nThe number of passed students is " + passedStudents.size());
	}

	private static List<Student> findStudentsByName(List<Student> studentList, String name) {
		List<Student> foundStudents = new ArrayList<>();
		
		for (Student student: studentList) {
			if (student.name.contains(name)) {
				foundStudents.add(student);
			}
		}
		
		return foundStudents;
	}

	private static Student filterTopperStudent(List<Student> studentList) {
		Student topperStudent = null;
		
		for (Student student: studentList) {
			if (topperStudent == null || student.marks > topperStudent.marks) {
				topperStudent = student;
			}
		}
		
		return topperStudent;
	}

	private static List<Student> filterStudentsByMarks(List<Student> studentList, int passMarks) {
		List<Student> passedStudents = new ArrayList<>();
		
		for (Student student: studentList) {
			if (student.marks >= passMarks) {
				passedStudents.add(student);
			}
		}
		
		return passedStudents;
	}

	private void print() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}
	
	public static void printAll(List<Student> studentList) {
		for (Student student: studentList) {
			student.print();
			System.out.println();
		}
	}

}