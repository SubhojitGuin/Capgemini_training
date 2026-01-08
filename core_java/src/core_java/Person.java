package core_java;

public class Person {
	
	private String name;
	private long ph_number;
	private char gender;
	private boolean marriage_status;
	private int age;
	private int weight;
	
	public Person(String name, long ph_number, char gender, boolean marriage_status, int age, int weight) {
		super();
		this.name = name;
		this.ph_number = ph_number;
		this.gender = gender;
		this.marriage_status = marriage_status;
		this.age = age;
		this.weight = weight;
	}

	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Phone number: " + ph_number);
		System.out.println("Gender: " + gender);
		System.out.println("Marriage Status: " + marriage_status);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
	}

	public static void main(String[] args) {
		Person p1 = new Person("Subhojit Guin", 9123963164L, 'M', false, 21, 66);
		p1.print();
	}

}
