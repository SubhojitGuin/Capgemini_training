package objectClass;

public class Person {
	
	int id;
	String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() { // Override the toString() method to print custom data instead of the address of the object
		return "id:"+id+" name:"+name;
	}
	
	public static void main(String[] args) {
		Person p = new Person(10, "XYZ");
		System.out.println(p);
//		System.out.println(p.toString()); By default it will add toString()
	}

}
