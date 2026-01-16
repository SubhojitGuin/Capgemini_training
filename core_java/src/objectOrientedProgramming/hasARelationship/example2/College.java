package objectOrientedProgramming.hasARelationship.example2;

public class College {

	private String name;
	private String location;
	private Student student;
	private Trainer trainer;
	
	public College() {
		
	}
	
	public College(String name, String location, Student student, Trainer trainer) {
		this.name = name;
		this.location = location;
		this.student = student;
		this.trainer = trainer;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Trainer getTrainer() {
		return trainer;
	}
	
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	public void print() {
		System.out.println("----- COLLEGE ------");
		System.out.println(name);
		System.out.println(location);
		System.out.println("----- TRAINER ------");
		System.out.println(trainer.getName());
		System.out.println(trainer.getSubject());
		System.out.println("----- Student ------");
		System.out.println(student.getId());
		System.out.println(student.getName());
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", location=" + location + ", student=" + student + ", trainer=" + trainer
				+ "]";
	}
}
