package objectOrientedProgramming.hasARelationship.schoolManagementApplication;

public class Student extends Person {
	private int rollNumber;
	private int grade;
	
	public Student() {
		super();
	}

	public Student(String name, int age, int rollNumber, int grade) {
		super(name, age);
		this.rollNumber = rollNumber;
		this.grade = grade;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
