package innerClass;

public class College2 {
	
	enum Gender {MALE, FEMALE}
	
	enum Mode {ONLINE, OFFLINE}
	
	static interface Staff {
		public void task();
	}
	
	static class Student {
		String name;
		Gender gender;
		Mode mode;
		
		public Student(String name, Gender gender, Mode mode) {
			super();
			this.name = name;
			this.gender = gender;
			this.mode = mode;
		}
		
		public void study() {
			System.out.println("Study Java");
		}
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", gender=" + gender + ", mode=" + mode +"]";
		}
	}
	
	static class Trainer implements Staff {
		Gender gender;
		String name;
		
		public Trainer(Gender gender, String name) {
			super();
			this.gender = gender;
			this.name = name;
		}

		@Override
		public void task() {
			System.out.println("Teach Students");
		}

		@Override
		public String toString() {
			return "Trainer [gender=" + gender + ", name=" + name + "]";
		}
		
	}
	
	static class Security implements Staff {
		Gender gender;
		String name;

		public Security(Gender gender, String name) {
			super();
			this.gender = gender;
			this.name = name;
		}

		@Override
		public void task() {
			System.out.println("Secure the college");
		}

		@Override
		public String toString() {
			return "Security [gender=" + gender + ", name=" + name + "]";
		}
		
	}
	
	public static void main(String[] args) {
		Staff trainer = new Trainer(Gender.FEMALE, "Rajeshwari");
		System.out.println(trainer);
		trainer.task();
		
		Staff security = new Security(Gender.MALE, "Raj");
		System.out.println(security);
		security.task();
		
		Student student = new Student("Dinga", Gender.MALE, Mode.OFFLINE);
		System.out.println(student);
		student.study();
	}

}
