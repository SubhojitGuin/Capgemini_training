package objectOrientedProgramming.inheritence.constructorChaining;

public class Human {
	String name;
	int age;
	char gender;
	
	public Human() {
		
	}
	
	public Human(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
	}
	
	public static void main(String[] args) {
		Human h = new Human("HumanName", 30, 'F');
		h.print();
		
		System.out.println();
		Employee e = new Employee("Raj", 22, 'M', 1, 50000.0);
		e.print();
		
		System.out.println();
		Student s = new Student("Subho", 21, 'M', 96.8f);
		s.print();
	}
}

class Employee extends Human {
	int id;
	double salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, char gender, int id, double salary) {
		super(name, age, gender);
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.id);
		System.out.println(this.salary);
	}
}

class Student extends Human {
	float percentage;
	
	public Student() {
		
	}
	
	public Student(String name, int age, char gender, float percentage) {
		super(name, age, gender);
		this.percentage = percentage;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.percentage);
	}
}