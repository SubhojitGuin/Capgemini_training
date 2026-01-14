package staticKeyword.nonStaticBlock;

public class College { // 3 objects
	String name;
	String location;
	
	public void exam() {
		System.out.println(name + " is assigning exams");
	}
	
	public void printCollege() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		College c1 = new College();
		c1.name = "IEM";
		c1.location = "Sector V";
		c1.exam();
		c1.printCollege();
		
		College c2 = new College();
		c2.name = "UEM";
		c2.location = "Newtown";
		c2.exam();
		c2.printCollege();
		
		College c3 = new College();
		c3.name = "Heritage";
		c2.location = "Ruby";
		c3.exam();
		c3.printCollege();
	}
}
