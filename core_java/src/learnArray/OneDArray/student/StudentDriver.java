package learnArray.OneDArray.student;

import java.util.Scanner;

public class StudentDriver {
	
	public static void main(String[] args) {
//		Student[] students = new Student[3];
//		students[0] = new Student(10, "Dinga");
//		students[1] = new Student(11, "Dingi");
//		students[2] = new Student(12, "Dingu");
//		
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i].id);
//			System.out.println(students[i].name);
//		}
		
//		for (Student student: students) {
//			System.out.println(student.id);
//			System.out.println(student.name);
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the Student details");
		Student[] students = new Student[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.print("Student ID: ");
			int id = sc.nextInt();
			
			System.out.print("Student name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Student marks: ");
			int marks = sc.nextInt();
			
			students[i] = new Student(id, name, marks);
		}
		
		System.out.print("\nEnter the threshold marks: ");
		int threshold = sc.nextInt();
		
		sc.close();
		
		Student[] filteredStudents = filterStudentsByMarks(threshold, students);
		
		System.out.println("\nThe qualified students are: ");
		for (Student student: filteredStudents) {
			if (student == null) continue;
			System.out.println();
			student.print();
		}
	}
	
	public static Student[] filterStudentsByMarks(int threshold, Student[] students) {
		int count = 0;
		
		for (Student student: students) {
			if (student.marks >= threshold)
				count++;
		}
		
		Student[] filteredStudents = new Student[count];
		
		int idx = 0;
		for (Student student: students) {
			if (student.marks >= threshold) {
				filteredStudents[idx++] = student;
			}
		}
		
		return filteredStudents;
	}
	
}
