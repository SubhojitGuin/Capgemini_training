package objectOrientedProgramming.hasARelationship.schoolManagementApplication;

public class SchoolDriver {
	public static void main(String[] args) {
		Student student = new Student("Dinga", 21, 123, 5);
		Course course = new Course(1, "OOPs");
		StudentCourse sc = new StudentCourse(student, course);
		
		sc.showStudentCourseDetails();
	}
}
