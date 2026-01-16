package objectOrientedProgramming.hasARelationship.schoolManagementApplication;

public class StudentCourse {
	private Student student;
	private Course course;
	
	public StudentCourse() {
		super();
	}

	public StudentCourse(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void showStudentCourseDetails() {
		System.out.println("----------- COURSE ------------");
		System.out.printf("""
				Course Id: \t%s
				Course Name: \t%s
				""", 
				course.getCourseId(), course.getCourseName());
//		
//		System.out.println(course.getCourseId());
//		System.out.println(course.getCourseName());
		
		System.out.println("----------- STUDENT -----------");
		System.out.printf("""
				Roll Number: \t%s
				Name: \t\t%s
				Age: \t\t%s
				Grade: \t\t%s
				""",
				student.getRollNumber(),
				student.getName(),
				student.getAge(),
				student.getGrade());
//		System.out.println(student.getRollNumber());
//		System.out.println(student.getName());
//		System.out.println(student.getAge());
//		System.out.println(student.getGrade());
	}
}
