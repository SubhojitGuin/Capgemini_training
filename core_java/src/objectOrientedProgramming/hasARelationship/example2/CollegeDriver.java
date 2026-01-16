package objectOrientedProgramming.hasARelationship.example2;

public class CollegeDriver {

	public static void main(String[] args) {
		Student student = new Student(1, "Subho");
		Trainer trainer = new Trainer(
				"Trainer", 
				"OOPs", 
				student // giving Student to Trainer HAS-A
			);
		
		College college = new College(
				"IEM", 
				"Kolkata", 
				student, // giving Student to College HAS-A
				trainer // giving Trainer to College HAS-A
			); 
		
//		college.print();
		System.out.println(college);
	}

}
